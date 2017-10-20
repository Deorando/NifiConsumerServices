
package nifi_objects.Consumer_model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Properties {

    @SerializedName("AMQP Version")
    private String mAMQPVersion;
    @SerializedName("Host Name")
    private String mHostName;
    @SerializedName("Password")
    private String mPassword;
    @SerializedName("Port")
    private String mPort;
    @SerializedName("Queue")
    private String mQueue;
    @SerializedName("ssl-client-auth")
    private String mSslClientAuth;
    @SerializedName("ssl-context-service")
    private Object mSslContextService;
    @SerializedName("User Name")
    private String mUserName;
    @SerializedName("Virtual Host")
    private Object mVirtualHost;

    public Properties(String mQueue) {
        this.mQueue = mQueue;
        this.mAMQPVersion="0.9.1";
        this.mHostName="172.16.26.5";
        this.mPassword="XXX";
        this.mPort="5672";
        this.mSslClientAuth="REQUIRED";
        this.mSslContextService=null;
        this.mUserName="producer";
        this.mVirtualHost=null;
    }

    public String getAMQPVersion() {
        return mAMQPVersion;
    }

    public void setAMQPVersion(String AMQPVersion) {
        mAMQPVersion = AMQPVersion;
    }

    public String getHostName() {
        return mHostName;
    }

    public void setHostName(String HostName) {
        mHostName = HostName;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String Password) {
        mPassword = Password;
    }

    public String getPort() {
        return mPort;
    }

    public void setPort(String Port) {
        mPort = Port;
    }

    public String getQueue() {
        return mQueue;
    }

    public void setQueue(String Queue) {
        mQueue = Queue;
    }

    public String getSslClientAuth() {
        return mSslClientAuth;
    }

    public void setSslClientAuth(String sslClientAuth) {
        mSslClientAuth = sslClientAuth;
    }

    public Object getSslContextService() {
        return mSslContextService;
    }

    public void setSslContextService(Object sslContextService) {
        mSslContextService = sslContextService;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String UserName) {
        mUserName = UserName;
    }

    public Object getVirtualHost() {
        return mVirtualHost;
    }

    public void setVirtualHost(Object VirtualHost) {
        mVirtualHost = VirtualHost;
    }

}
