package Merge_model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class MRelationship {

    @SerializedName("autoTerminate")
    private Boolean mAutoTerminate;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("name")
    private String mName;

    public Boolean getAutoTerminate() {
        return mAutoTerminate;
    }

    public void setAutoTerminate(Boolean autoTerminate) {
        mAutoTerminate = autoTerminate;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public MRelationship() {

        this.mAutoTerminate=false;
        this.mDescription="If the bundle cannot be created, all FlowFiles that would have been used to created the bundle will be transferred to failure";
        this.mName="failure";


    }

    public MRelationship(Boolean mAutoTerminate, String mDescription, String mName) {
        this.mAutoTerminate = mAutoTerminate;
        this.mDescription = mDescription;
        this.mName = mName;
    }
}
