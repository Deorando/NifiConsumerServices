
package getHdfsDay;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class GDProperties {

    @SerializedName("Batch Size")
    private String mBatchSize;
    @SerializedName("Compression codec")
    private String mCompressionCodec;
    @SerializedName("Directory")
    private String mDirectory;
    @SerializedName("File Filter Regex")
    private Object mFileFilterRegex;
    @SerializedName("Filter Match Name Only")
    private String mFilterMatchNameOnly;
    @SerializedName("Hadoop Configuration Resources")
    private String mHadoopConfigurationResources;
    @SerializedName("IO Buffer Size")
    private Object mIOBufferSize;
    @SerializedName("Ignore Dotted Files")
    private String mIgnoreDottedFiles;
    @SerializedName("Keep Source File")
    private String mKeepSourceFile;
    @SerializedName("Kerberos Keytab")
    private Object mKerberosKeytab;
    @SerializedName("Kerberos Principal")
    private Object mKerberosPrincipal;
    @SerializedName("Kerberos Relogin Period")
    private String mKerberosReloginPeriod;
    @SerializedName("Maximum File Age")
    private Object mMaximumFileAge;
    @SerializedName("Minimum File Age")
    private String mMinimumFileAge;
    @SerializedName("Polling Interval")
    private String mPollingInterval;
    @SerializedName("Recurse Subdirectories")
    private String mRecurseSubdirectories;

    public String getBatchSize() {
        return mBatchSize;
    }

    public void setBatchSize(String BatchSize) {
        mBatchSize = BatchSize;
    }

    public String getCompressionCodec() {
        return mCompressionCodec;
    }

    public void setCompressionCodec(String CompressionCodec) {
        mCompressionCodec = CompressionCodec;
    }

    public String getDirectory() {
        return mDirectory;
    }

    public void setDirectory(String Directory) {
        mDirectory = Directory;
    }

    public Object getFileFilterRegex() {
        return mFileFilterRegex;
    }

    public void setFileFilterRegex(Object FileFilterRegex) {
        mFileFilterRegex = FileFilterRegex;
    }

    public String getFilterMatchNameOnly() {
        return mFilterMatchNameOnly;
    }

    public void setFilterMatchNameOnly(String FilterMatchNameOnly) {
        mFilterMatchNameOnly = FilterMatchNameOnly;
    }

    public String getHadoopConfigurationResources() {
        return mHadoopConfigurationResources;
    }

    public void setHadoopConfigurationResources(String HadoopConfigurationResources) {
        mHadoopConfigurationResources = HadoopConfigurationResources;
    }

    public Object getIOBufferSize() {
        return mIOBufferSize;
    }

    public void setIOBufferSize(Object IOBufferSize) {
        mIOBufferSize = IOBufferSize;
    }

    public String getIgnoreDottedFiles() {
        return mIgnoreDottedFiles;
    }

    public void setIgnoreDottedFiles(String IgnoreDottedFiles) {
        mIgnoreDottedFiles = IgnoreDottedFiles;
    }

    public String getKeepSourceFile() {
        return mKeepSourceFile;
    }

    public void setKeepSourceFile(String KeepSourceFile) {
        mKeepSourceFile = KeepSourceFile;
    }

    public Object getKerberosKeytab() {
        return mKerberosKeytab;
    }

    public void setKerberosKeytab(Object KerberosKeytab) {
        mKerberosKeytab = KerberosKeytab;
    }

    public Object getKerberosPrincipal() {
        return mKerberosPrincipal;
    }

    public void setKerberosPrincipal(Object KerberosPrincipal) {
        mKerberosPrincipal = KerberosPrincipal;
    }

    public String getKerberosReloginPeriod() {
        return mKerberosReloginPeriod;
    }

    public void setKerberosReloginPeriod(String KerberosReloginPeriod) {
        mKerberosReloginPeriod = KerberosReloginPeriod;
    }

    public Object getMaximumFileAge() {
        return mMaximumFileAge;
    }

    public void setMaximumFileAge(Object MaximumFileAge) {
        mMaximumFileAge = MaximumFileAge;
    }

    public String getMinimumFileAge() {
        return mMinimumFileAge;
    }

    public void setMinimumFileAge(String MinimumFileAge) {
        mMinimumFileAge = MinimumFileAge;
    }

    public String getPollingInterval() {
        return mPollingInterval;
    }

    public void setPollingInterval(String PollingInterval) {
        mPollingInterval = PollingInterval;
    }

    public String getRecurseSubdirectories() {
        return mRecurseSubdirectories;
    }

    public void setRecurseSubdirectories(String RecurseSubdirectories) {
        mRecurseSubdirectories = RecurseSubdirectories;
    }
    public GDProperties(String directory){
        this.mHadoopConfigurationResources="/etc/hadoop_client_config/core-site.xml,/etc/hadoop_client_config/hdfs-site.xml,/etc/hadoop_client_config/yarn-site.xml";
        this.mKerberosPrincipal=null;
        this.mKerberosKeytab=null;
        this.mKerberosReloginPeriod="4 hours";
        ///user/talend/staging/usage_communication_data/merge
        this.mDirectory=directory;
        this.mRecurseSubdirectories="true";
        this.mKeepSourceFile="false";
        this.mFileFilterRegex=null;
        this.mFilterMatchNameOnly="true";
        this.mIgnoreDottedFiles="true";
        this.mMinimumFileAge="0sec";
        this.mMaximumFileAge=null;
        this.mPollingInterval="0sec";
        this.mBatchSize="10000";
        this.mIOBufferSize=null;
        this.mCompressionCodec="NONE";

    }
}
