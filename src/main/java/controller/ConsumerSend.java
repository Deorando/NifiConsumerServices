package controller;

/**
 * Created by thomas.palyska on 26.10.2017.
 */
public class ConsumerSend {
    String data;
    Postion p;
    Properties ppr;
    Consumer c;

    public ConsumerSend(String name, String queue_name, double pos_x, double pos_y){


    }
    public ConsumerSend(String name, String queue_name, double pos_x, double pos_y,String url){

    }


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

