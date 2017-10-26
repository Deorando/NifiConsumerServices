
package getHdfsDay;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class GDComponent {

    @SerializedName("config")
    private GDConfig mGDConfig;
    @SerializedName("inputRequirement")
    private String mInputRequirement;
    @SerializedName("name")
    private String mName;
    @SerializedName("persistsState")
    private Boolean mPersistsState;
    @SerializedName("position")
    private GDPosition mGDPosition;
    @SerializedName("relationships")
    private List<GDRelationship> mGDRelationships;
    @SerializedName("state")
    private String mState;
    @SerializedName("style")
    private GDStyle mGDStyle;
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

    public GDConfig getConfig() {
        return mGDConfig;
    }

    public void setConfig(GDConfig GDConfig) {
        mGDConfig = GDConfig;
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

    public GDPosition getPosition() {
        return mGDPosition;
    }

    public void setPosition(GDPosition GDPosition) {
        mGDPosition = GDPosition;
    }

    public List<GDRelationship> getRelationships() {
        return mGDRelationships;
    }

    public void setRelationships(List<GDRelationship> GDRelationships) {
        mGDRelationships = GDRelationships;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public GDStyle getStyle() {
        return mGDStyle;
    }

    public void setStyle(GDStyle GDStyle) {
        mGDStyle = GDStyle;
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

    public GDComponent(GDPosition p, GDProperties pr,String name,String sPeriod,String sStrategy){
        //this.mName="GetHDFS_usage_communication_data_day";
        this.mName=name;
        this.mType="org.apache.nifi.processors.hadoop.GetHDFS";
        this.mState="STOPPED";
        this.mSupportsParallelProcessing= true;
        this.mSupportsEventDriven= false;
        this.mSupportsBatching= false;
        this.mPersistsState= false;
        this.mInputRequirement="INPUT_FORBIDDEN";
        mGDConfig= new GDConfig(sPeriod,sStrategy,pr);
        mGDPosition=p;


    }

}
