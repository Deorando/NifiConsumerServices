
package Connection;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Component {

    @SerializedName("availableRelationships")
    private List<String> mAvailableRelationships;
    @SerializedName("backPressureDataSizeThreshold")
    private String mBackPressureDataSizeThreshold;
    @SerializedName("backPressureObjectThreshold")
    private Long mBackPressureObjectThreshold;
    @SerializedName("bends")
    private List<Object> mBends;
    @SerializedName("destination")
    private Destination mDestination;
    @SerializedName("flowFileExpiration")
    private String mFlowFileExpiration;
    @SerializedName("labelIndex")
    private Long mLabelIndex;
    @SerializedName("name")
    private String mName;
    @SerializedName("prioritizers")
    private List<Object> mPrioritizers;
    @SerializedName("selectedRelationships")
    private List<String> mSelectedRelationships;
    @SerializedName("source")
    private Source mSource;
    @SerializedName("zIndex")
    private Long mZIndex;

    public List<String> getAvailableRelationships() {
        return mAvailableRelationships;
    }

    public void setAvailableRelationships(List<String> availableRelationships) {
        mAvailableRelationships = availableRelationships;
    }

    public String getBackPressureDataSizeThreshold() {
        return mBackPressureDataSizeThreshold;
    }

    public void setBackPressureDataSizeThreshold(String backPressureDataSizeThreshold) {
        mBackPressureDataSizeThreshold = backPressureDataSizeThreshold;
    }

    public Long getBackPressureObjectThreshold() {
        return mBackPressureObjectThreshold;
    }

    public void setBackPressureObjectThreshold(Long backPressureObjectThreshold) {
        mBackPressureObjectThreshold = backPressureObjectThreshold;
    }

    public List<Object> getBends() {
        return mBends;
    }

    public void setBends(List<Object> bends) {
        mBends = bends;
    }

    public Destination getDestination() {
        return mDestination;
    }

    public void setDestination(Destination destination) {
        mDestination = destination;
    }

    public String getFlowFileExpiration() {
        return mFlowFileExpiration;
    }

    public void setFlowFileExpiration(String flowFileExpiration) {
        mFlowFileExpiration = flowFileExpiration;
    }

    public Long getLabelIndex() {
        return mLabelIndex;
    }

    public void setLabelIndex(Long labelIndex) {
        mLabelIndex = labelIndex;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public List<Object> getPrioritizers() {
        return mPrioritizers;
    }

    public void setPrioritizers(List<Object> prioritizers) {
        mPrioritizers = prioritizers;
    }

    public List<String> getSelectedRelationships() {
        return mSelectedRelationships;
    }

    public void setSelectedRelationships(List<String> selectedRelationships) {
        mSelectedRelationships = selectedRelationships;
    }

    public Source getSource() {
        return mSource;
    }

    public void setSource(Source source) {
        mSource = source;
    }

    public Long getZIndex() {
        return mZIndex;
    }

    public void setZIndex(Long zIndex) {
        mZIndex = zIndex;
    }

    public Component(Destination d, Source s,String Relations){
        this.mName=null;
        this.mLabelIndex=1l;
        this.mZIndex=0l;
        this.mBackPressureObjectThreshold=10000000l;
        this.mBackPressureDataSizeThreshold="1000 GB";
        this.mFlowFileExpiration="0 sec";
        mDestination= d;
        mSource=s;
        List<String> l_s= new ArrayList<String>();
        l_s.add(Relations);
        setSelectedRelationships(l_s);
        setAvailableRelationships(l_s);



    }


}
