package service;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionNifi {
    public String url="";
    public String postData;

    public void sendingPostRequest() throws Exception{
        this.postData=postData;
        URL obj= new URL(this.url);
        System.out.println("url: "+url);
        HttpURLConnection con = (HttpURLConnection)obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);
        DataOutputStream wr= new DataOutputStream(con.getOutputStream());
        System.out.println("HTTTTTP: "+postData);
        wr.writeBytes(postData);
        wr.flush();
        wr.close();
        int responseCode= con.getResponseCode();
        System.out.println("Response Code: "+responseCode);
    }



    public HttpURLConnectionNifi(){

    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setPostData(String postData) {
        this.postData = postData;
    }
}
