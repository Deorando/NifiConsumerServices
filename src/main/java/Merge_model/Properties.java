package Merge_model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Properties {

    @SerializedName("Attribute Strategy")
    private String mAttributeStrategy;
    @SerializedName("Compression Level")
    private String mCompressionLevel;
    @SerializedName("Correlation Attribute Name")
    private Object mCorrelationAttributeName;
    @SerializedName("Delimiter Strategy")
    private String mDelimiterStrategy;
    @SerializedName("Demarcator File")
    private Object mDemarcatorFile;
    @SerializedName("Footer File")
    private Object mFooterFile;
    @SerializedName("Header File")
    private Object mHeaderFile;
    @SerializedName("Keep Path")
    private String mKeepPath;
    @SerializedName("Max Bin Age")
    private Object mMaxBinAge;
    @SerializedName("Maximum Group Size")
    private Object mMaximumGroupSize;
    @SerializedName("Maximum number of Bins")
    private String mMaximumNumberOfBins;
    @SerializedName("Maximum Number of Entries")
    private Object mMaximumNumberOfEntries;
    @SerializedName("Merge Format")
    private String mMergeFormat;
    @SerializedName("Merge Strategy")
    private String mMergeStrategy;
    @SerializedName("Minimum Group Size")
    private String mMinimumGroupSize;
    @SerializedName("Minimum Number of Entries")
    private String mMinimumNumberOfEntries;

    public String getAttributeStrategy() {
        return mAttributeStrategy;
    }

    public void setAttributeStrategy(String AttributeStrategy) {
        mAttributeStrategy = AttributeStrategy;
    }

    public String getCompressionLevel() {
        return mCompressionLevel;
    }

    public void setCompressionLevel(String CompressionLevel) {
        mCompressionLevel = CompressionLevel;
    }

    public Object getCorrelationAttributeName() {
        return mCorrelationAttributeName;
    }

    public void setCorrelationAttributeName(Object CorrelationAttributeName) {
        mCorrelationAttributeName = CorrelationAttributeName;
    }

    public String getDelimiterStrategy() {
        return mDelimiterStrategy;
    }

    public void setDelimiterStrategy(String DelimiterStrategy) {
        mDelimiterStrategy = DelimiterStrategy;
    }

    public Object getDemarcatorFile() {
        return mDemarcatorFile;
    }

    public void setDemarcatorFile(Object DemarcatorFile) {
        mDemarcatorFile = DemarcatorFile;
    }

    public Object getFooterFile() {
        return mFooterFile;
    }

    public void setFooterFile(Object FooterFile) {
        mFooterFile = FooterFile;
    }

    public Object getHeaderFile() {
        return mHeaderFile;
    }

    public void setHeaderFile(Object HeaderFile) {
        mHeaderFile = HeaderFile;
    }

    public String getKeepPath() {
        return mKeepPath;
    }

    public void setKeepPath(String KeepPath) {
        mKeepPath = KeepPath;
    }

    public Object getMaxBinAge() {
        return mMaxBinAge;
    }

    public void setMaxBinAge(Object MaxBinAge) {
        mMaxBinAge = MaxBinAge;
    }

    public Object getMaximumGroupSize() {
        return mMaximumGroupSize;
    }

    public void setMaximumGroupSize(Object MaximumGroupSize) {
        mMaximumGroupSize = MaximumGroupSize;
    }

    public String getMaximumNumberOfBins() {
        return mMaximumNumberOfBins;
    }

    public void setMaximumNumberOfBins(String MaximumNumberOfBins) {
        mMaximumNumberOfBins = MaximumNumberOfBins;
    }

    public Object getMaximumNumberOfEntries() {
        return mMaximumNumberOfEntries;
    }

    public void setMaximumNumberOfEntries(Object MaximumNumberOfEntries) {
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
    public Properties(){
        this.mMergeStrategy="Bin-PackingAlgorithm";
        this.mMergeFormat="Avro";
        this.mAttributeStrategy="KeepOnlyCommonAttributes";
        this.mCorrelationAttributeName=null;
        this.mMinimumNumberOfEntries="1";
        this.mMinimumGroupSize="0B";
        this.mMaximumGroupSize=null;
        this.mMaxBinAge=null;
        this.mMaximumNumberOfBins="100";
        this.mDelimiterStrategy="Filename";
        this.mHeaderFile=null;
        this.mFooterFile=null;
        this.mDemarcatorFile=null;
        this.mCompressionLevel="1";
        this.mKeepPath="false";
    }

}
