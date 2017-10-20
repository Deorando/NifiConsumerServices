
package nifi_objects.Consumer_model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Component {

    @SerializedName("config")
    private Config mConfig;
    @SerializedName("inputRequirement")
    private String mInputRequirement;
    @SerializedName("name")
    private String mName;
    @SerializedName("persistsState")
    private Boolean mPersistsState;
    @SerializedName("position")
    private Position mPosition;
    @SerializedName("relationships")
    private List<Relationship> mRelationships;
    @SerializedName("state")
    private String mState;
    @SerializedName("style")
    private Style mStyle;
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

    public Config getConfig() {
        return mConfig;
    }

    public void setConfig(Config config) {
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

    public Position getPosition() {
        return mPosition;
    }

    public void setPosition(Position position) {
        mPosition = position;
    }

    public List<Relationship> getRelationships() {
        return mRelationships;
    }

    public void setRelationships(List<Relationship> relationships) {
        mRelationships = relationships;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public Style getStyle() {
        return mStyle;
    }

    public void setStyle(Style style) {
        mStyle = style;
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

    public Component(Position p,Properties pr){
        mType= "org.apache.nifi.amqp.processors.ConsumeAMQP";
        mState="STOPPED";
        mSupportsParallelProcessing=true;
        mSupportsEventDriven=false;
        mSupportsBatching=false;
        mPersistsState=false;
        mInputRequirement="INPUT_FORBIDDEN";
        Relationship re = new Relationship();
        mRelationships= new ArrayList<Relationship>();
        mRelationships.add(re);
        mConfig= new Config(pr);
        mPosition=p;





    }

}
