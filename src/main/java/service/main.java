package service;

import Merge_model.JsonMerge;
import Merge_model.MPosition;
import Merge_model.MProperties;
import Put_hdfs_hour.HConfig;
import Put_hdfs_hour.HPosition;
import Put_hdfs_hour.HProperties;
import Put_hdfs_hour.PutHdfsHour;
import com.google.gson.Gson;
import nifi_objects.Consumer_model.Component;
import nifi_objects.Consumer_model.Consumer;
import nifi_objects.Consumer_model.Position;
import nifi_objects.Consumer_model.Properties;


import java.io.IOException;
import java.net.HttpURLConnection;


public class main {
    public static void main (String[] args)throws Exception
    {
        SendMerge();
        //SendConsumer();
        //SendPutHdfs();

    }


    public static void SendConsumer() throws Exception {
        String data;
        int i = 0;
        Position p = new Position(0.0, (i * 500.0));
        Properties pr = new Properties("test_queue_name");
        Consumer c = new Consumer(p, pr);
        Gson gson = new Gson();
        data = gson.toJson(c);
        System.out.println(data);
        Component co = new Component(p, pr);


    }

    public static void SendMerge()throws Exception {
        MPosition m_p = new MPosition(100.0, 500.0);
        MProperties m_pr = new MProperties();
        JsonMerge jm = new JsonMerge(m_p, m_pr);
        Gson gson_m = new Gson();
        String data_m;
        data_m = gson_m.toJson(jm);
        System.out.println("merge_model: " + data_m);
        SendHttp(gson_m,data_m);

    }

    public static void SendHttp(Gson gson, String data) throws Exception {
        String co = data;
        System.out.println("co: " + gson.toJson(co));
        HttpURLConnectionNifi http = new HttpURLConnectionNifi();
        http.setUrl(" http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/53759954-015f-1000-ffff-ffff9474d593/processors");
        http.setPostData(data);
        http.sendingPostRequest();
    }
    public static void SendPutHdfs(){
        HPosition hp= new HPosition(100.0,1000.0);
        HProperties ppr= new HProperties("/user/test/test");
        HConfig hcon= new HConfig(ppr);
        PutHdfsHour phdh= new PutHdfsHour(hp,hcon);
        Gson gson_h = new Gson();
        String data_h;
        data_h = gson_h.toJson(phdh);
        System.out.println("HDFS: "+data_h);
    }


}















