
package ReaderGroup;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class RDComponent {

    @SerializedName("config")
    private RDConfig mRDConfig;
    @SerializedName("id")
    private String mId;
    @SerializedName("inputRequirement")
    private String mInputRequirement;
    @SerializedName("name")
    private String mName;
    @SerializedName("parentGroupId")
    private String mParentGroupId;
    @SerializedName("persistsState")
    private Boolean mPersistsState;
    @SerializedName("position")
    private RDPosition mRDPosition;
    @SerializedName("relationships")
    private List<RDRelationship> mRDRelationships;
    @SerializedName("state")
    private String mState;
    @SerializedName("style")
    private RDStyle mRDStyle;
    @SerializedName("supportsBatching")
    private Boolean mSupportsBatching;
    @SerializedName("supportsEventDriven")
    private Boolean mSupportsEventDriven;
    @SerializedName("supportsParallelProcessing")
    private Boolean mSupportsParallelProcessing;
    @SerializedName("type")
    private String mType;
    @SerializedName("validationErrors")
    private List<String> mValidationErrors;

    public RDConfig getConfig() {
        return mRDConfig;
    }

    public void setConfig(RDConfig RDConfig) {
        mRDConfig = RDConfig;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
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

    public String getParentGroupId() {
        return mParentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        mParentGroupId = parentGroupId;
    }

    public Boolean getPersistsState() {
        return mPersistsState;
    }

    public void setPersistsState(Boolean persistsState) {
        mPersistsState = persistsState;
    }

    public RDPosition getPosition() {
        return mRDPosition;
    }

    public void setPosition(RDPosition RDPosition) {
        mRDPosition = RDPosition;
    }

    public List<RDRelationship> getRelationships() {
        return mRDRelationships;
    }

    public void setRelationships(List<RDRelationship> RDRelationships) {
        mRDRelationships = RDRelationships;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public RDStyle getStyle() {
        return mRDStyle;
    }

    public void setStyle(RDStyle RDStyle) {
        mRDStyle = RDStyle;
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

    public List<String> getValidationErrors() {
        return mValidationErrors;
    }

    public void setValidationErrors(List<String> validationErrors) {
        mValidationErrors = validationErrors;
    }

}
