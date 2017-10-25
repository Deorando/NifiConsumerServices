package Merge_model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class JsonMerge {

    @SerializedName("bulletins")
    private List<Object> mBulletins;
    @SerializedName("component")
    private MComponent mMComponent;
    @SerializedName("inputRequirement")
    private String mInputRequirement;
    @SerializedName("permissions")
    private MPermissions mMPermissions;
    @SerializedName("position")
    private MPosition mMPosition;
    @SerializedName("revision")
    private MRevision mMRevision;

    public List<Object> getBulletins() {
        return mBulletins;
    }

    public void setBulletins(List<Object> bulletins) {
        mBulletins = bulletins;
    }

    public MComponent getComponent() {
        return mMComponent;
    }

    public void setComponent(MComponent MComponent) {
        mMComponent = MComponent;
    }

    public String getInputRequirement() {
        return mInputRequirement;
    }

    public void setInputRequirement(String inputRequirement) {
        mInputRequirement = inputRequirement;
    }

    public MPermissions getPermissions() {
        return mMPermissions;
    }

    public void setPermissions(MPermissions MPermissions) {
        mMPermissions = MPermissions;
    }

    public MPosition getPosition() {
        return mMPosition;
    }

    public void setPosition(MPosition MPosition) {
        mMPosition = MPosition;
    }

    public MRevision getRevision() {
        return mMRevision;
    }

    public void setRevision(MRevision MRevision) {
        mMRevision = MRevision;
    }
    public JsonMerge(MPosition p, MProperties pr ) {
        mMRevision = new MRevision();
        mMComponent = new MComponent(p, pr, this.getMRelations());
        mMPermissions = new MPermissions();
        mMPosition = p;
        mInputRequirement = "INPUT_FORBIDDEN";
    }

    private ArrayList<MRelationship> getMRelations() {
        RelationshipMerge rm = new RelationshipMerge();
        ArrayList<MRelationship> relationships =rm.getL_mr();


        return relationships;
    }

}
