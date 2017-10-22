package service;

import com.google.gson.Gson;
import nifi_objects.Consumer_model.Component;
import nifi_objects.Consumer_model.Consumer;
import nifi_objects.Consumer_model.Position;
import nifi_objects.Consumer_model.Properties;

import java.io.IOException;
import java.net.HttpURLConnection;


public class main {
    public static void main(String[] args) throws Exception{
        String data;
for (int i=0;i<2;i++) {
    Position p = new Position(0.0, (i*500.0));
    Properties pr = new Properties("test_queue_name");
    Consumer c = new Consumer(p, pr);
    Gson gson = new Gson();
    data = gson.toJson(c);
    System.out.println(data);
    Component co = new Component(p, pr);
    //System.out.println("co: "+gson.toJson(co));
    HttpURLConnectionNifi http = new HttpURLConnectionNifi();
    http.setUrl("http://localhost:8080/nifi-api/process-groups/793b4b3e-015c-1000-2371-d8c52aa0dc76/processors");
    http.setPostData(data);
    http.sendingPostRequest();
}












    }

}
