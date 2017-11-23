
package XRead;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class XProperties {

    @SerializedName("AMQP Version")
    private String mAMQPVersion;
    @SerializedName("Attribute Strategy")
    private String mAttributeStrategy;
    @SerializedName("Batch Size")
    private String mBatchSize;
    @SerializedName("Block Size")
    private String mBlockSize;
    @SerializedName("Compression codec")
    private String mCompressionCodec;
    @SerializedName("Compression Level")
    private String mCompressionLevel;
    @SerializedName("Conflict Resolution Strategy")
    private String mConflictResolutionStrategy;
    @SerializedName("Correlation Attribute Name")
    private XCorrelationAttributeName mXCorrelationAttributeName;
    @SerializedName("Delimiter Strategy")
    private String mDelimiterStrategy;
    @SerializedName("Demarcator File")
    private XDemarcatorFile mXDemarcatorFile;
    @SerializedName("XDirectory")
    private String mDirectory;
    @SerializedName("File Filter Regex")
    private XFileFilterRegex mXFileFilterRegex;
    @SerializedName("Filter Match Name Only")
    private String mFilterMatchNameOnly;
    @SerializedName("Footer File")
    private XFooterFile mXFooterFile;
    @SerializedName("Hadoop Configuration Resources")
    private String mHadoopConfigurationResources;
    @SerializedName("Header File")
    private XHeaderFile mXHeaderFile;
    @SerializedName("Host Name")
    private String mHostName;
    @SerializedName("IO Buffer Size")
    private XIOBufferSize mXIOBufferSize;
    @SerializedName("Ignore Dotted Files")
    private String mIgnoreDottedFiles;
    @SerializedName("Keep Path")
    private String mKeepPath;
    @SerializedName("Keep Source File")
    private String mKeepSourceFile;
    @SerializedName("Kerberos Keytab")
    private XKerberosKeytab mXKerberosKeytab;
    @SerializedName("Kerberos Principal")
    private XKerberosPrincipal mXKerberosPrincipal;
    @SerializedName("Kerberos Relogin Period")
    private String mKerberosReloginPeriod;
    @SerializedName("Max Bin Age")
    private XMaxBinAge mXMaxBinAge;
    @SerializedName("Maximum File Age")
    private XMaximumFileAge mXMaximumFileAge;
    @SerializedName("Maximum Group Size")
    private XMaximumGroupSize mXMaximumGroupSize;
    @SerializedName("Maximum number of Bins")
    private String mMaximumNumberOfBins;
    @SerializedName("Maximum Number of Entries")
    private String mMaximumNumberOfEntries;
    @SerializedName("Merge Format")
    private String mMergeFormat;
    @SerializedName("Merge Strategy")
    private String mMergeStrategy;
    @SerializedName("Minimum File Age")
    private String mMinimumFileAge;
    @SerializedName("Minimum Group Size")
    private String mMinimumGroupSize;
    @SerializedName("Minimum Number of Entries")
    private String mMinimumNumberOfEntries;
    @SerializedName("XPassword")
    private String mPassword;
    @SerializedName("XPermissions umask")
    private XPermissionsUmask mXPermissionsUmask;
    @SerializedName("Polling Interval")
    private String mPollingInterval;
    @SerializedName("XPort")
    private String mPort;
    @SerializedName("XQueue")
    private String mQueue;
    @SerializedName("Recurse Subdirectories")
    private String mRecurseSubdirectories;
    @SerializedName("Remote Group")
    private XRemoteGroup mXRemoteGroup;
    @SerializedName("Remote Owner")
    private XRemoteOwner mXRemoteOwner;
    @SerializedName("XReplication")
    private XReplication mXReplication;
    @SerializedName("ssl-client-auth")
    private String mSslClientAuth;
    @SerializedName("ssl-context-service")
    private XSslContextService mXSslContextService;
    @SerializedName("User Name")
    private String mUserName;
    @SerializedName("Virtual Host")
    private String mVirtualHost;

    public String getAMQPVersion() {
        return mAMQPVersion;
    }

    public void setAMQPVersion(String AMQPVersion) {
        mAMQPVersion = AMQPVersion;
    }

    public String getAttributeStrategy() {
        return mAttributeStrategy;
    }

    public void setAttributeStrategy(String AttributeStrategy) {
        mAttributeStrategy = AttributeStrategy;
    }

    public String getBatchSize() {
        return mBatchSize;
    }

    public void setBatchSize(String BatchSize) {
        mBatchSize = BatchSize;
    }

    public String getBlockSize() {
        return mBlockSize;
    }

    public void setBlockSize(String BlockSize) {
        mBlockSize = BlockSize;
    }

    public String getCompressionCodec() {
        return mCompressionCodec;
    }

    public void setCompressionCodec(String CompressionCodec) {
        mCompressionCodec = CompressionCodec;
    }

    public String getCompressionLevel() {
        return mCompressionLevel;
    }

    public void setCompressionLevel(String CompressionLevel) {
        mCompressionLevel = CompressionLevel;
    }

    public String getConflictResolutionStrategy() {
        return mConflictResolutionStrategy;
    }

    public void setConflictResolutionStrategy(String ConflictResolutionStrategy) {
        mConflictResolutionStrategy = ConflictResolutionStrategy;
    }

    public XCorrelationAttributeName getCorrelationAttributeName() {
        return mXCorrelationAttributeName;
    }

    public void setCorrelationAttributeName(XCorrelationAttributeName XCorrelationAttributeName) {
        mXCorrelationAttributeName = XCorrelationAttributeName;
    }

    public String getDelimiterStrategy() {
        return mDelimiterStrategy;
    }

    public void setDelimiterStrategy(String DelimiterStrategy) {
        mDelimiterStrategy = DelimiterStrategy;
    }

    public XDemarcatorFile getDemarcatorFile() {
        return mXDemarcatorFile;
    }

    public void setDemarcatorFile(XDemarcatorFile XDemarcatorFile) {
        mXDemarcatorFile = XDemarcatorFile;
    }

    public String getDirectory() {
        return mDirectory;
    }

    public void setDirectory(String Directory) {
        mDirectory = Directory;
    }

    public XFileFilterRegex getFileFilterRegex() {
        return mXFileFilterRegex;
    }

    public void setFileFilterRegex(XFileFilterRegex XFileFilterRegex) {
        mXFileFilterRegex = XFileFilterRegex;
    }

    public String getFilterMatchNameOnly() {
        return mFilterMatchNameOnly;
    }

    public void setFilterMatchNameOnly(String FilterMatchNameOnly) {
        mFilterMatchNameOnly = FilterMatchNameOnly;
    }

    public XFooterFile getFooterFile() {
        return mXFooterFile;
    }

    public void setFooterFile(XFooterFile XFooterFile) {
        mXFooterFile = XFooterFile;
    }

    public String getHadoopConfigurationResources() {
        return mHadoopConfigurationResources;
    }

    public void setHadoopConfigurationResources(String HadoopConfigurationResources) {
        mHadoopConfigurationResources = HadoopConfigurationResources;
    }

    public XHeaderFile getHeaderFile() {
        return mXHeaderFile;
    }

    public void setHeaderFile(XHeaderFile XHeaderFile) {
        mXHeaderFile = XHeaderFile;
    }

    public String getHostName() {
        return mHostName;
    }

    public void setHostName(String HostName) {
        mHostName = HostName;
    }

    public XIOBufferSize getIOBufferSize() {
        return mXIOBufferSize;
    }

    public void setIOBufferSize(XIOBufferSize XIOBufferSize) {
        mXIOBufferSize = XIOBufferSize;
    }

    public String getIgnoreDottedFiles() {
        return mIgnoreDottedFiles;
    }

    public void setIgnoreDottedFiles(String IgnoreDottedFiles) {
        mIgnoreDottedFiles = IgnoreDottedFiles;
    }

    public String getKeepPath() {
        return mKeepPath;
    }

    public void setKeepPath(String KeepPath) {
        mKeepPath = KeepPath;
    }

    public String getKeepSourceFile() {
        return mKeepSourceFile;
    }

    public void setKeepSourceFile(String KeepSourceFile) {
        mKeepSourceFile = KeepSourceFile;
    }

    public XKerberosKeytab getKerberosKeytab() {
        return mXKerberosKeytab;
    }

    public void setKerberosKeytab(XKerberosKeytab XKerberosKeytab) {
        mXKerberosKeytab = XKerberosKeytab;
    }

    public XKerberosPrincipal getKerberosPrincipal() {
        return mXKerberosPrincipal;
    }

    public void setKerberosPrincipal(XKerberosPrincipal XKerberosPrincipal) {
        mXKerberosPrincipal = XKerberosPrincipal;
    }

    public String getKerberosReloginPeriod() {
        return mKerberosReloginPeriod;
    }

    public void setKerberosReloginPeriod(String KerberosReloginPeriod) {
        mKerberosReloginPeriod = KerberosReloginPeriod;
    }

    public XMaxBinAge getMaxBinAge() {
        return mXMaxBinAge;
    }

    public void setMaxBinAge(XMaxBinAge XMaxBinAge) {
        mXMaxBinAge = XMaxBinAge;
    }

    public XMaximumFileAge getMaximumFileAge() {
        return mXMaximumFileAge;
    }

    public void setMaximumFileAge(XMaximumFileAge XMaximumFileAge) {
        mXMaximumFileAge = XMaximumFileAge;
    }

    public XMaximumGroupSize getMaximumGroupSize() {
        return mXMaximumGroupSize;
    }

    public void setMaximumGroupSize(XMaximumGroupSize XMaximumGroupSize) {
        mXMaximumGroupSize = XMaximumGroupSize;
    }

    public String getMaximumNumberOfBins() {
        return mMaximumNumberOfBins;
    }

    public void setMaximumNumberOfBins(String MaximumNumberOfBins) {
        mMaximumNumberOfBins = MaximumNumberOfBins;
    }

    public String getMaximumNumberOfEntries() {
        return mMaximumNumberOfEntries;
    }

    public void setMaximumNumberOfEntries(String MaximumNumberOfEntries) {
        mMaximumNumberOfEntries = MaximumNumberOfEntries;
    }

    public String getMergeFormat() {
        return mMergeFormat;
    }

    public void setMergeFormat(String MergeFormat) {
        mMergeFormat = MergeFormat;
    }

    public String getMergeStrategy() {
        return mMergeStrategy;
    }

    public void setMergeStrategy(String MergeStrategy) {
        mMergeStrategy = MergeStrategy;
    }

    public String getMinimumFileAge() {
        return mMinimumFileAge;
    }

    public void setMinimumFileAge(String MinimumFileAge) {
        mMinimumFileAge = MinimumFileAge;
    }

    public String getMinimumGroupSize() {
        return mMinimumGroupSize;
    }

    public void setMinimumGroupSize(String MinimumGroupSize) {
        mMinimumGroupSize = MinimumGroupSize;
    }

    public String getMinimumNumberOfEntries() {
        return mMinimumNumberOfEntries;
    }

    public void setMinimumNumberOfEntries(String MinimumNumberOfEntries) {
        mMinimumNumberOfEntries = MinimumNumberOfEntries;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String Password) {
        mPassword = Password;
    }

    public XPermissionsUmask getPermissionsUmask() {
        return mXPermissionsUmask;
    }

    public void setPermissionsUmask(XPermissionsUmask XPermissionsUmask) {
        mXPermissionsUmask = XPermissionsUmask;
    }

    public String getPollingInterval() {
        return mPollingInterval;
    }

    public void setPollingInterval(String PollingInterval) {
        mPollingInterval = PollingInterval;
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

    public String getRecurseSubdirectories() {
        return mRecurseSubdirectories;
    }

    public void setRecurseSubdirectories(String RecurseSubdirectories) {
        mRecurseSubdirectories = RecurseSubdirectories;
    }

    public XRemoteGroup getRemoteGroup() {
        return mXRemoteGroup;
    }

    public void setRemoteGroup(XRemoteGroup XRemoteGroup) {
        mXRemoteGroup = XRemoteGroup;
    }

    public XRemoteOwner getRemoteOwner() {
        return mXRemoteOwner;
    }

    public void setRemoteOwner(XRemoteOwner XRemoteOwner) {
        mXRemoteOwner = XRemoteOwner;
    }

    public XReplication getReplication() {
        return mXReplication;
    }

    public void setReplication(XReplication XReplication) {
        mXReplication = XReplication;
    }

    public String getSslClientAuth() {
        return mSslClientAuth;
    }

    public void setSslClientAuth(String sslClientAuth) {
        mSslClientAuth = sslClientAuth;
    }

    public XSslContextService getSslContextService() {
        return mXSslContextService;
    }

    public void setSslContextService(XSslContextService XSslContextService) {
        mXSslContextService = XSslContextService;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String UserName) {
        mUserName = UserName;
    }

    public String getVirtualHost() {
        return mVirtualHost;
    }

    public void setVirtualHost(String VirtualHost) {
        mVirtualHost = VirtualHost;
    }

}
