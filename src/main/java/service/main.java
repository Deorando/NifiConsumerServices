package service;

import Merge_model.JsonMerge;
import Merge_model.MPosition;
import Merge_model.MProperties;
import Put_hdfs_hour.HConfig;
import Put_hdfs_hour.HPosition;
import Put_hdfs_hour.HProperties;
import Put_hdfs_hour.PutHdfsHour;
import ReaderGroup.ReadProcessGroup;
import com.google.gson.Gson;
import controller.ConsumerSend;
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
import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d04a7-015f-1000-0000-00007587fed5/processors");
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        String json="";
        String inputLine="";
        String dummy="";
        while ((inputLine = in.readLine()) != null) {
             json += inputLine;
        }
        in.close();
        System.out.println("json: " + json.toString());
        Gson gson = new Gson();
        ReadProcessGroup rpg = gson.fromJson(json, ReadProcessGroup.class);
        System.out.println("rpg: " + rpg.getProcessors().size());
        for (int z=0;z<rpg.getProcessors().size();z++){
            System.out.println(rpg.getProcessors().get(z).getComponent().getId());
            System.out.println(rpg.getProcessors().get(z).getComponent().getName());
            System.out.println(rpg.getProcessors().get(z).getComponent().getParentGroupId());
            System.out.println(rpg.getProcessors().get(z).getComponent().getType());

        }



         //ReadDWH_usage();
         //ReadDWH_purchase();
         //ReadDWH_user();
        //SendProcessGroup("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/root/process-groups","ProdNew");
        //SendProcessGroup("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595b7e1c-015f-1000-ffff-fffff26953f5/process-groups","UsageALL");
        //SendProcessGroup("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0430-015f-1000-ffff-fffff8c9e102/process-groups","UsageHH",0.0,100.0);
        //SendProcessGroup("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0430-015f-1000-ffff-fffff8c9e102/process-groups","UsageBR",0.0,300.0);
        //SendProcessGroup("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0430-015f-1000-ffff-fffff8c9e102/process-groups","UsageKI",0.0,500.0);
        //ConsumerSend cs = new ConsumerSend("TestName", "QueueName", 0.0, 0.0, "http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d04a7-015f-1000-0000-00007587fed5/processors");


        // SendConsumer("ConsumerPurchaseXX", "QueuePurchaseXX", 0.0, 0.0);
        // SendMerge("MergeContentPurchaseHour", 600.0, 0.0, "* 50 * * * ?", "CRON_DRIVEN");
        // SendMerge("MergeContentPurchaseDay", 600.0, 400, "10 sec", "TIMER_DRIVEN");
        // SendPutHdfs("PutHdfsPurchaseHour", 1200.0, 0.0, "/user/talend/staging/purchaseXX");
        // SendPutHdfs("PutHdfsPurchaseError", 600.0, 200, "/user/talend/logging/nifi/purchaseXX");
        // SendPutHdfs("PutHdfsPurchaseFailure", 1200, 200, "/user/talend/logging/nifi/purchaseXX");
        // SendPutHdfs("PutHdfsPurchaseDay", 1200, 400, "/user/talend/logging/nifi/purchaseXX");
        // SendGetHdfsDay("GetHdfsPurchaseDay",0,400,"/user/talend/merge","* 50 * * * ?","CRON_DRIVEN");


    }
    public static void ReadDWH_purchase() throws Exception {
        //URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
        //BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        List<String> l_url_purchase = new ArrayList<String>();
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/1c493853-2b23-122e-ba8c-c905608b0806/processors");
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/08113ca4-dd7c-135e-9b6c-2a20f51f8cd8/processors");
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/3c323317-fb46-173d-aeb1-b95188af5149/processors");
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8d543e88-9b32-1944-aebc-b0d9f90a21c3/processors");

        String inputLine;
        int i_x = 1000;
        int j_y = 1000;

        BufferedReader in = null;

        for (int k = 0; k < l_url_purchase.size(); k++) {
            URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
            in = new BufferedReader(new InputStreamReader(oracle.openStream()));
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.contains("purchase_")) {
                    System.out.println(inputLine);
                    SendConsumer("Consumer_" + inputLine, "stg" + inputLine, 10, (10) + i_x, l_url_purchase.get(k));
                    System.out.println("k: " + k);
                    SendMerge("MergeContent" + inputLine, 600.0, (10) + i_x, "* 50 * * * ?", "CRON_DRIVEN",l_url_purchase.get(k));
                     SendMerge("MergeContent" + inputLine + "Day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN",l_url_purchase.get(k));
                    SendPutHdfs("PutHdfs" + inputLine + "Hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine,l_url_purchase.get(k));
                    SendPutHdfs("PutHdfs" + inputLine + "Error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch",l_url_purchase.get(k));
                    SendPutHdfs("PutHdfsPurchase" + inputLine + "Failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine,l_url_purchase.get(k));
                    SendPutHdfs("PutHdfs" + inputLine + "Day", 1200, (400) + i_x, "/user/talend/logging/nifi/" + inputLine,l_url_purchase.get(k));
                    SendGetHdfsDay("GetHdfs" + inputLine + "Day", 10, (400) + i_x, "/user/talend/staging/" + inputLine + "/merge", "* 50 * * * ?", "CRON_DRIVEN",l_url_purchase.get(k));
                    i_x = i_x + 1000;
                    j_y = j_y + 1000;
                }

            }
        }
        in.close();
    }
    public static void ReadDWH_usage() throws Exception {
        //URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
        //BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        List<String> l_url_usage= new ArrayList<String>();
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d04a7-015f-1000-0000-00007587fed5/processors");
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0518-015f-1000-0000-0000374b06f1/processors");
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0587-015f-1000-0000-0000718eef50/processors");
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/045e3481-a47b-1778-8dcd-a66f603c162a/processors");

        String inputLine;
        int i_x = 1000;
        int j_y = 1000;

        BufferedReader in =null;

        for(int k=0; k<l_url_usage.size();k++) {
            URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
            in = new BufferedReader(new InputStreamReader(oracle.openStream()));
            while ((inputLine = in.readLine()) != null) {
                if(inputLine.contains("usage_")) {
                    System.out.println(inputLine);
                    SendConsumer("Consumer_" + inputLine, "stg" + inputLine, 10, (10) + i_x, l_url_usage.get(k));
                    System.out.println("k: " + k);
                    SendMerge("MergeContent" + inputLine, 600.0, (10) + i_x, "* 50 * * * ?", "CRON_DRIVEN",l_url_usage.get(k));
                    SendMerge("MergeContent" + inputLine + "Day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN",l_url_usage.get(k));
                    SendPutHdfs("PutHdfs" + inputLine + "Hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine,l_url_usage.get(k));
                    SendPutHdfs("PutHdfs" + inputLine + "Error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch",l_url_usage.get(k));
                    SendPutHdfs("PutHdfsPurchase" + inputLine + "Failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine,l_url_usage.get(k));
                    SendPutHdfs("PutHdfs" + inputLine + "Day", 1200, (400) + i_x, "/user/talend/logging/nifi/" + inputLine,l_url_usage.get(k));
                    SendGetHdfsDay("GetHdfs" + inputLine + "Day", 10, (400) + i_x, "/user/talend/staging/" + inputLine + "/merge", "* 50 * * * ?", "CRON_DRIVEN",l_url_usage.get(k));
                    i_x = i_x + 1000;
                    j_y = j_y + 1000;
                }

            }
        }
        in.close();

    }
    public static void ReadDWH_user() throws Exception {
        //URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
        //BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        List<String> l_url_user= new ArrayList<String>();
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/2a873c97-fc86-1739-981c-0bcd9e3498b5/processors");
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/bb9338d3-3ebe-150f-beb3-bf693fa7678c/processors");
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8d2030e0-fcb9-15f8-b6b1-53eb50346872/processors");
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a8b43aeb-5944-1d3d-8c1b-6cded7c6f05a/processors");

        String inputLine;
        int i_x = 1000;
        int j_y = 1000;

        BufferedReader in =null;

        for(int k=0; k<l_url_user.size();k++) {
            URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
            in = new BufferedReader(new InputStreamReader(oracle.openStream()));
            while ((inputLine = in.readLine()) != null) {
                if(inputLine.contains("user_")) {
                    System.out.println(inputLine);
                    SendConsumer("Consumer_" + inputLine, "stg" + inputLine, 10, (10) + i_x, l_url_user.get(k));
                    System.out.println("k: " + k);
                    SendMerge("MergeContent" + inputLine, 600.0, (10) + i_x, "* 50 * * * ?", "CRON_DRIVEN",l_url_user.get(k));
                    SendMerge("MergeContent" + inputLine + "Day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN",l_url_user.get(k));
                    SendPutHdfs("PutHdfs" + inputLine + "Hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine,l_url_user.get(k));
                    SendPutHdfs("PutHdfs" + inputLine + "Error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch",l_url_user.get(k));
                    SendPutHdfs("PutHdfsPurchase" + inputLine + "Failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine,l_url_user.get(k));
                    SendPutHdfs("PutHdfs" + inputLine + "Day", 1200, (400) + i_x, "/user/talend/logging/nifi/" + inputLine,l_url_user.get(k));
                    SendGetHdfsDay("GetHdfs" + inputLine + "Day", 10, (400) + i_x, "/user/talend/staging/" + inputLine + "/merge", "* 50 * * * ?", "CRON_DRIVEN",l_url_user.get(k));
                    i_x = i_x + 1000;
                    j_y = j_y + 1000;
                }

            }
        }
        in.close();

    }

    public static void SendConsumer(String name, String queue_name, double pos_x, double pos_y,String url) throws Exception {
        String data;
        Position p = new Position(pos_x, pos_y);
        Properties pr = new Properties(queue_name);
        Consumer c = new Consumer(p, pr, name);
        Gson gson = new Gson();
        data = gson.toJson(c);
        System.out.println("Consumer: " + data);
        //Component co = new Component(p, pr,name);
        SendHttp(gson, data, url);


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
    public static void SendPutHdfs(String name, double pos_x, double pos_y, String directory,String url) throws Exception {
        HPosition hp = new HPosition(pos_x, pos_y);
        HProperties ppr = new HProperties(directory);
        HConfig hcon = new HConfig(ppr);
        PutHdfsHour phdh = new PutHdfsHour(hp, hcon, name);
        Gson gson_h = new Gson();
        String data_h;
        data_h = gson_h.toJson(phdh);
        System.out.println("PutHDFS: " + data_h);
        SendHttp(gson_h, data_h, url);
    }
    public static void SendMerge(String name, double pos_x, double pos_y, String sPeriod, String sStrategy,String url) throws Exception {
        MPosition m_p = new MPosition(pos_x, pos_y);
        MProperties m_pr = new MProperties();
        JsonMerge jm = new JsonMerge(m_p, m_pr, name, sPeriod, sStrategy);
        Gson gson_m = new Gson();
        String data_m;
        data_m = gson_m.toJson(jm);
        System.out.println("Merge: " + data_m);
         SendHttp(gson_m, data_m,url);

    }
    public static void SendGetHdfsDay(String name, double pos_x, long pos_y, String directory, String sPeriod, String sStrategy,String url) throws Exception {
        GDPosition p = new GDPosition(pos_x, pos_y);
        GDProperties ppr = new GDProperties(directory);
        GetHdfsDay ghd = new GetHdfsDay(p, name, ppr, sPeriod, sStrategy);
        Gson gson = new Gson();
        String data;
        data = gson.toJson(ghd);
         SendHttp(gson, data,url);

    }
    public static void SendProcessGroup(String url_s, String name, double pos_x, double pos_y,String url) throws Exception {
        PPosition p = new PPosition(pos_x, pos_y);
        ProcessGroup pg = new ProcessGroup(p, name);
        Gson gson = new Gson();
        String data;
       // String url = url_s;
        //String url="http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/root/process-groups";
        data = gson.toJson(pg);
        System.out.println("ProcessGroup: " + data);
        //SendHttp(gson, data, url);
    }


}















