
package Put_hdfs_hour;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class HComponent {

    @SerializedName("config")
    private HConfig mHConfig;
    @SerializedName("inputRequirement")
    private String mInputRequirement;
    @SerializedName("name")
    private String mName;
    @SerializedName("persistsState")
    private Boolean mPersistsState;
    @SerializedName("position")
    private HPosition mHPosition;
    @SerializedName("relationships")
    private List<HRelationship> mHRelationships;
    @SerializedName("state")
    private String mState;
    @SerializedName("style")
    private HStyle mHStyle;
    @SerializedName("supportsBatching")
    private Boolean mSupportsBatching;
    @SerializedName("supportsEventDriven")
    private Boolean mSupportsEventDriven;
    @SerializedName("supportsParallelProcessing")
    private Boolean mSupportsParallelProcessing;
    @SerializedName("type")
    private String mType;
    @SerializedName("validationErrors")
    private List<Object> mValidationErrors;

    public HConfig getConfig() {
        return mHConfig;
    }

    public void setConfig(HConfig HConfig) {
        mHConfig = HConfig;
    }

    public String getInputRequirement() {
        return mInputRequirement;
    }

    public void setInputRequirement(String inputRequirement) {
        mInputRequirement = inputRequirement;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Boolean getPersistsState() {
        return mPersistsState;
    }

    public void setPersistsState(Boolean persistsState) {
        mPersistsState = persistsState;
    }

    public HPosition getPosition() {
        return mHPosition;
    }

    public void setPosition(HPosition HPosition) {
        mHPosition = HPosition;
    }

    public List<HRelationship> getRelationships() {
        return mHRelationships;
    }

    public void setRelationships(List<HRelationship> HRelationships) {
        mHRelationships = HRelationships;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public HStyle getStyle() {
        return mHStyle;
    }

    public void setStyle(HStyle HStyle) {
        mHStyle = HStyle;
    }

    public Boolean getSupportsBatching() {
        return mSupportsBatching;
    }

    public void setSupportsBatching(Boolean supportsBatching) {
        mSupportsBatching = supportsBatching;
    }

    public Boolean getSupportsEventDriven() {
        return mSupportsEventDriven;
    }

    public void setSupportsEventDriven(Boolean supportsEventDriven) {
        mSupportsEventDriven = supportsEventDriven;
    }

    public Boolean getSupportsParallelProcessing() {
        return mSupportsParallelProcessing;
    }

    public void setSupportsParallelProcessing(Boolean supportsParallelProcessing) {
        mSupportsParallelProcessing = supportsParallelProcessing;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public List<Object> getValidationErrors() {
        return mValidationErrors;
    }

    public void setValidationErrors(List<Object> validationErrors) {
        mValidationErrors = validationErrors;
    }

    public HComponent(HPosition p,HConfig conf) {
        mName = "PutHDFS_purchase_data";
        mType = "org.apache.nifi.processors.hadoop.PutHDFS";
        mState = "STOPPED";
        mSupportsParallelProcessing = true;
        mSupportsEventDriven = false;
        mSupportsBatching = false;
        mPersistsState = false;
        mInputRequirement="INPUT_REQUIRED";
        mHPosition=p;
        mHConfig=conf;
        HRelationship re = new HRelationship();
        mHRelationships= new ArrayList<HRelationship>();
        mHRelationships.add(re);




    }

}
