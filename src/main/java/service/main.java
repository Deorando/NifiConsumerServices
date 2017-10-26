package service;

import Merge_model.JsonMerge;
import Merge_model.MPosition;
import Merge_model.MProperties;
import Put_hdfs_hour.HConfig;
import Put_hdfs_hour.HPosition;
import Put_hdfs_hour.HProperties;
import Put_hdfs_hour.PutHdfsHour;
import com.google.gson.Gson;
import getHdfsDay.GDConfig;
import getHdfsDay.GDPosition;
import getHdfsDay.GDProperties;
import getHdfsDay.GetHdfsDay;
import nifi_objects.Consumer_model.Component;
import nifi_objects.Consumer_model.Consumer;
import nifi_objects.Consumer_model.Position;
import nifi_objects.Consumer_model.Properties;
import processGroup.PPosition;
import processGroup.ProcessGroup;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class main {
    public static void main(String[] args) throws Exception {


        // ReadDWH();
        //SendProcessGroup("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/root/process-groups","ProdNew");
        //SendProcessGroup("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595b7e1c-015f-1000-ffff-fffff26953f5/process-groups","UsageALL");
        SendProcessGroup("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0430-015f-1000-ffff-fffff8c9e102/process-groups","UsageHH",0.0,100.0);
        SendProcessGroup("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0430-015f-1000-ffff-fffff8c9e102/process-groups","UsageBR",0.0,300.0);
        SendProcessGroup("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0430-015f-1000-ffff-fffff8c9e102/process-groups","UsageKI",0.0,500.0);


        // SendConsumer("ConsumerPurchaseXX", "QueuePurchaseXX", 0.0, 0.0);
        // SendMerge("MergeContentPurchaseHour", 600.0, 0.0, "* 50 * * * ?", "CRON_DRIVEN");
        // SendMerge("MergeContentPurchaseDay", 600.0, 400, "10 sec", "TIMER_DRIVEN");
        // SendPutHdfs("PutHdfsPurchaseHour", 1200.0, 0.0, "/user/talend/staging/purchaseXX");
        // SendPutHdfs("PutHdfsPurchaseError", 600.0, 200, "/user/talend/logging/nifi/purchaseXX");
        // SendPutHdfs("PutHdfsPurchaseFailure", 1200, 200, "/user/talend/logging/nifi/purchaseXX");
        // SendPutHdfs("PutHdfsPurchaseDay", 1200, 400, "/user/talend/logging/nifi/purchaseXX");
        // SendGetHdfsDay("GetHdfsPurchaseDay",0,400,"/user/talend/merge","* 50 * * * ?","CRON_DRIVEN");


    }

    public static void ReadDWH() throws Exception {
        URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        String inputLine;
        int i_x = 1000;
        int j_y = 1000;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
            SendConsumer("Consumer" + inputLine, "stg" + inputLine, 10, (10) + i_x);
            SendMerge("MergeContent" + inputLine, 600.0, (10) + i_x, "* 50 * * * ?", "CRON_DRIVEN");
            SendMerge("MergeContent" + inputLine + "Day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN");
            SendPutHdfs("PutHdfs" + inputLine + "Hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine);
            SendPutHdfs("PutHdfs" + inputLine + "Error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch");
            SendPutHdfs("PutHdfsPurchase" + inputLine + "Failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine);
            SendPutHdfs("PutHdfs" + inputLine + "Day", 1200, (400) + i_x, "/user/talend/logging/nifi/" + inputLine);
            SendGetHdfsDay("GetHdfs" + inputLine + "Day", 10, (400) + i_x, "/user/talend/staging/" + inputLine + "/merge", "* 50 * * * ?", "CRON_DRIVEN");
            i_x = i_x + 1000;
            j_y = j_y + 1000;
        }
        in.close();

    }


    public static void SendConsumer(String name, String queue_name, double pos_x, double pos_y) throws Exception {
        String data;
        Position p = new Position(pos_x, pos_y);
        Properties pr = new Properties(queue_name);
        Consumer c = new Consumer(p, pr, name);
        Gson gson = new Gson();
        data = gson.toJson(c);
        System.out.println("Consumer: " + data);
        //Component co = new Component(p, pr,name);
        SendHttp(gson, data,url);


    }


    public static void SendHttp(Gson gson, String data, String url) throws Exception {
        String co = data;
        System.out.println("co: " + gson.toJson(co));
        HttpURLConnectionNifi http = new HttpURLConnectionNifi();
        // http.setUrl("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/53759954-015f-1000-ffff-ffff9474d593/processors");
        http.setUrl(url);
        http.setPostData(data);
        http.sendingPostRequest();
    }

    public static void SendPutHdfs(String name, double pos_x, double pos_y, String directory) throws Exception {
        HPosition hp = new HPosition(pos_x, pos_y);
        HProperties ppr = new HProperties(directory);
        HConfig hcon = new HConfig(ppr);
        PutHdfsHour phdh = new PutHdfsHour(hp, hcon, name);
        Gson gson_h = new Gson();
        String data_h;
        data_h = gson_h.toJson(phdh);
        System.out.println("PutHDFS: " + data_h);
        //SendHttp(gson_h, data_h);
    }

    public static void SendMerge(String name, double pos_x, double pos_y, String sPeriod, String sStrategy) throws Exception {
        MPosition m_p = new MPosition(pos_x, pos_y);
        MProperties m_pr = new MProperties();
        JsonMerge jm = new JsonMerge(m_p, m_pr, name, sPeriod, sStrategy);
        Gson gson_m = new Gson();
        String data_m;
        data_m = gson_m.toJson(jm);
        System.out.println("Merge: " + data_m);
        // SendHttp(gson_m, data_m);

    }

    public static void SendGetHdfsDay(String name, double pos_x, long pos_y, String directory, String sPeriod, String sStrategy) throws Exception {
        GDPosition p = new GDPosition(pos_x, pos_y);
        GDProperties ppr = new GDProperties(directory);
        GetHdfsDay ghd = new GetHdfsDay(p, name, ppr, sPeriod, sStrategy);
        Gson gson = new Gson();
        String data;
        data = gson.toJson(ghd);
        // SendHttp(gson, data);

    }

    public static void SendProcessGroup(String url_s,String name,double pos_x,double pos_y) throws Exception {
        PPosition p = new PPosition(pos_x, pos_y);
        ProcessGroup pg = new ProcessGroup(p,name);
        Gson gson = new Gson();
        String data;
        String url = url_s;
        //String url="http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/root/process-groups";
        data = gson.toJson(pg);
        System.out.println("ProcessGroup: " + data);
        SendHttp(gson, data, url);
    }


}















