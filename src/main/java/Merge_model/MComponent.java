package Merge_model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;



@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class MComponent {

    @SerializedName("config")
    private MConfig mConfig;
    @SerializedName("inputRequirement")
    private String mInputRequirement;
    @SerializedName("name")
    private String mName;
    @SerializedName("persistsState")
    private Boolean mPersistsState;
    @SerializedName("position")
    private MPosition mMPosition;
    @SerializedName("relationships")
    private List<MRelationship> mMRelationships;
    @SerializedName("state")
    private String mState;
    @SerializedName("style")
    private MStyle mMStyle;
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

    public MConfig getConfig() {
        return mConfig;
    }

    public void setConfig(MConfig config) {
        mConfig = config;
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

    public MPosition getPosition() {
        return mMPosition;
    }

    public void setPosition(MPosition MPosition) {
        mMPosition = MPosition;
    }

    public List<MRelationship> getRelationships() {
        return mMRelationships;
    }

    public void setRelationships(List<MRelationship> MRelationships) {
        mMRelationships = MRelationships;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public MStyle getStyle() {
        return mMStyle;
    }

    public void setStyle(MStyle MStyle) {
        mMStyle = MStyle;
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

    public MComponent(MPosition p, MProperties pr,List<MRelationship> relationships) {
        mType = "org.apache.nifi.processors.standard.MergeContent";
        mState = "STOPPED";
        mSupportsParallelProcessing = true;
        mSupportsEventDriven = false;
        mSupportsBatching = false;
        mPersistsState = false;
        mInputRequirement = "INPUT_FORBIDDEN";
        mMRelationships = relationships;
        mConfig = new MConfig(pr);
        mMPosition = p;
    }

}
