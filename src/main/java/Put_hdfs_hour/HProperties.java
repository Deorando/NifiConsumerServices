
package Put_hdfs_hour;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class HProperties {

    @SerializedName("Block Size")
    private String mBlockSize;
    @SerializedName("Compression codec")
    private String mCompressionCodec;
    @SerializedName("Conflict Resolution Strategy")
    private String mConflictResolutionStrategy;
    @SerializedName("Directory")
    private String mDirectory;
    @SerializedName("Hadoop Configuration Resources")
    private String mHadoopConfigurationResources;
    @SerializedName("IO Buffer Size")
    private String mIOBufferSize;
    @SerializedName("Kerberos Keytab")
    private String mKerberosKeytab;
    @SerializedName("Kerberos Principal")
    private String mKerberosPrincipal;
    @SerializedName("Kerberos Relogin Period")
    private String mKerberosReloginPeriod;
    @SerializedName("Permissions umask")
    private String mPermissionsUmask;
    @SerializedName("Remote Group")
    private String mRemoteGroup;
    @SerializedName("Remote Owner")
    private String mRemoteOwner;
    @SerializedName("Replication")
    private String mReplication;

    public String getmDirectory() {
        return mDirectory;
    }

    public void setmDirectory(String mDirectory) {
        this.mDirectory = mDirectory;
    }

    public HProperties(String mDirectory){

        this.mHadoopConfigurationResources="/etc/hadoop_client_config/core-site.xml,/etc/hadoop_client_config/hdfs-site.xml,/etc/hadoop_client_config/yarn-site.xml";
        this.mKerberosPrincipal=null;
        this.mKerberosKeytab=null;
        this.mKerberosReloginPeriod="4 hours";
        this.mDirectory=mDirectory;
        this.mConflictResolutionStrategy="fail";
        this.mBlockSize="128 MB";
        this.mIOBufferSize=null;
        this.mReplication=null;
        this.mPermissionsUmask=null;
        this.mRemoteOwner=null;
        this.mRemoteGroup=null;
        this.mCompressionCodec="NONE";
    }

}
