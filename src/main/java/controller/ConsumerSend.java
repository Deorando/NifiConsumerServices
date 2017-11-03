package controller;

import com.google.gson.Gson;
import nifi_objects.Consumer_model.Consumer;
import nifi_objects.Consumer_model.Position;
import nifi_objects.Consumer_model.Properties;

import static service.main.SendHttp;

/**
 * Created by thomas.palyska on 26.10.2017.
 */
public class ConsumerSend {

    String data;
    Position p;
    Properties ppr;
    Consumer c;
    String name;
    String queue_name;
    double pos_x;
    double pos_y;
    String url;
    String virtualHost;

    public String getData() {
        return data;
    }

    public Position getP() {
        return p;
    }

    public Properties getPpr() {
        return ppr;
    }

    public Consumer getC() {
        return c;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setP(Position p) {
        this.p = p;
    }

    public void setPpr(Properties ppr) {
        this.ppr = ppr;
    }

    public void setC(Consumer c) {
        this.c = c;
    }

    /*public ConsumerSend(String name, String queue_name, double pos_x, double pos_y,String virtualHost) {
        this.name=name;
        this.queue_name=queue_name;
        this.pos_x=pos_x;
        this.pos_y=pos_y;
        this.virtualHost=virtualHost;

        this.p = new Position(this.pos_x, this.pos_y);
        this.ppr = new Properties(this.queue_name,this.virtualHost);
        this.c = new Consumer(this.p, this.ppr, this.name);
        Gson gson = new Gson();
        this.data = gson.toJson(this.c);

    }
*/

 /*   public ConsumerSend(String name, String queue_name, double pos_x, double pos_y, String url) throws Exception {

        this.name=name;
        this.queue_name=queue_name;
        this.url=url;

        this.pos_x=pos_x;
        this.pos_y=pos_y;

         this.p = new Position(this.pos_x, this.pos_y);
         this.ppr = new Properties(this.queue_name);
        this.c = new Consumer(this.p, this.ppr, this.name);
        Gson gson = new Gson();
        this.data = gson.toJson(this.c);
       SendHttp(gson, data, url);


    }
*/

}
    /*public static void SendConsumer(String name, String queue_name, double pos_x, double pos_y) throws Exception {
        String data;
        Position p = new Position(pos_x, pos_y);
        Properties pr = new Properties(queue_name);
        Consumer c = new Consumer(p, pr, name);
        Gson gson = new Gson();
        data = gson.toJson(c);
        System.out.println("Consumer: " + data);
        //Component co = new Component(p, pr,name);
        SendHttp(gson, data,url);


    }*/

