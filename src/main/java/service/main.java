package service;

import com.google.gson.Gson;
import nifi_objects.Consumer_model.Component;
import nifi_objects.Consumer_model.Consumer;
import nifi_objects.Consumer_model.Position;
import nifi_objects.Consumer_model.Properties;


public class main {
    public static void main(String[] args) {
        String data;

        Position p= new Position(0.0,100.0);
        Properties pr= new Properties("test_queue_name");
        Consumer c = new Consumer(p,pr);

        Gson gson= new Gson();
        data=gson.toJson(c);
        System.out.println(data);

        Component co= new Component(p,pr);
        //System.out.println("co: "+gson.toJson(co));









    }

}
