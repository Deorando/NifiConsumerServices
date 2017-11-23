
package XRead;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class XComponent {

    @SerializedName("config")
    private XConfig mXConfig;
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
    private XPosition mXPosition;
    @SerializedName("relationships")
    private List<XRelationship> mXRelationships;
    @SerializedName("state")
    private String mState;
    @SerializedName("style")
    private XStyle mXStyle;
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

    public XConfig getConfig() {
        return mXConfig;
    }

    public void setConfig(XConfig XConfig) {
        mXConfig = XConfig;
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

    public XPosition getPosition() {
        return mXPosition;
    }

    public void setPosition(XPosition XPosition) {
        mXPosition = XPosition;
    }

    public List<XRelationship> getRelationships() {
        return mXRelationships;
    }

    public void setRelationships(List<XRelationship> XRelationships) {
        mXRelationships = XRelationships;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public XStyle getStyle() {
        return mXStyle;
    }

    public void setStyle(XStyle XStyle) {
        mXStyle = XStyle;
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
