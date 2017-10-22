package Merge_model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class JsonMerge {

    @SerializedName("bulletins")
    private List<Object> mBulletins;
    @SerializedName("component")
    private Component mComponent;
    @SerializedName("inputRequirement")
    private String mInputRequirement;
    @SerializedName("permissions")
    private Permissions mPermissions;
    @SerializedName("position")
    private Position mPosition;
    @SerializedName("revision")
    private Revision mRevision;

    public List<Object> getBulletins() {
        return mBulletins;
    }

    public void setBulletins(List<Object> bulletins) {
        mBulletins = bulletins;
    }

    public Component getComponent() {
        return mComponent;
    }

    public void setComponent(Component component) {
        mComponent = component;
    }

    public String getInputRequirement() {
        return mInputRequirement;
    }

    public void setInputRequirement(String inputRequirement) {
        mInputRequirement = inputRequirement;
    }

    public Permissions getPermissions() {
        return mPermissions;
    }

    public void setPermissions(Permissions permissions) {
        mPermissions = permissions;
    }

    public Position getPosition() {
        return mPosition;
    }

    public void setPosition(Position position) {
        mPosition = position;
    }

    public Revision getRevision() {
        return mRevision;
    }

    public void setRevision(Revision revision) {
        mRevision = revision;
    }
    public JsonMerge(Position p,Properties pr ) {
        mRevision = new Revision();
        mComponent = new Component(p, pr);
        mPermissions = new Permissions();
        mPosition = p;
        mInputRequirement = "INPUT_FORBIDDEN";
    }

}
