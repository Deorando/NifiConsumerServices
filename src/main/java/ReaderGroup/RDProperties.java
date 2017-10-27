
package ReaderGroup;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class RDProperties {

    @SerializedName("Attribute Strategy")
    private String mAttributeStrategy;
    @SerializedName("Compression Level")
    private String mCompressionLevel;
    @SerializedName("Correlation Attribute Name")
    private RDCorrelationAttributeName mRDCorrelationAttributeName;
    @SerializedName("Delimiter Strategy")
    private String mDelimiterStrategy;
    @SerializedName("Demarcator File")
    private RDDemarcatorFile mRDDemarcatorFile;
    @SerializedName("Footer File")
    private RDFooterFile mRDFooterFile;
    @SerializedName("Header File")
    private RDHeaderFile mRDHeaderFile;
    @SerializedName("Keep Path")
    private String mKeepPath;
    @SerializedName("Max Bin Age")
    private RDMaxBinAge mRDMaxBinAge;
    @SerializedName("Maximum Group Size")
    private RDMaximumGroupSize mRDMaximumGroupSize;
    @SerializedName("Maximum number of Bins")
    private String mMaximumNumberOfBins;
    @SerializedName("Maximum Number of Entries")
    private RDMaximumNumberOfEntries mRDMaximumNumberOfEntries;
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

    public RDCorrelationAttributeName getCorrelationAttributeName() {
        return mRDCorrelationAttributeName;
    }

    public void setCorrelationAttributeName(RDCorrelationAttributeName RDCorrelationAttributeName) {
        mRDCorrelationAttributeName = RDCorrelationAttributeName;
    }

    public String getDelimiterStrategy() {
        return mDelimiterStrategy;
    }

    public void setDelimiterStrategy(String DelimiterStrategy) {
        mDelimiterStrategy = DelimiterStrategy;
    }

    public RDDemarcatorFile getDemarcatorFile() {
        return mRDDemarcatorFile;
    }

    public void setDemarcatorFile(RDDemarcatorFile RDDemarcatorFile) {
        mRDDemarcatorFile = RDDemarcatorFile;
    }

    public RDFooterFile getFooterFile() {
        return mRDFooterFile;
    }

    public void setFooterFile(RDFooterFile RDFooterFile) {
        mRDFooterFile = RDFooterFile;
    }

    public RDHeaderFile getHeaderFile() {
        return mRDHeaderFile;
    }

    public void setHeaderFile(RDHeaderFile RDHeaderFile) {
        mRDHeaderFile = RDHeaderFile;
    }

    public String getKeepPath() {
        return mKeepPath;
    }

    public void setKeepPath(String KeepPath) {
        mKeepPath = KeepPath;
    }

    public RDMaxBinAge getMaxBinAge() {
        return mRDMaxBinAge;
    }

    public void setMaxBinAge(RDMaxBinAge RDMaxBinAge) {
        mRDMaxBinAge = RDMaxBinAge;
    }

    public RDMaximumGroupSize getMaximumGroupSize() {
        return mRDMaximumGroupSize;
    }

    public void setMaximumGroupSize(RDMaximumGroupSize RDMaximumGroupSize) {
        mRDMaximumGroupSize = RDMaximumGroupSize;
    }

    public String getMaximumNumberOfBins() {
        return mMaximumNumberOfBins;
    }

    public void setMaximumNumberOfBins(String MaximumNumberOfBins) {
        mMaximumNumberOfBins = MaximumNumberOfBins;
    }

    public RDMaximumNumberOfEntries getMaximumNumberOfEntries() {
        return mRDMaximumNumberOfEntries;
    }

    public void setMaximumNumberOfEntries(RDMaximumNumberOfEntries RDMaximumNumberOfEntries) {
        mRDMaximumNumberOfEntries = RDMaximumNumberOfEntries;
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

}
