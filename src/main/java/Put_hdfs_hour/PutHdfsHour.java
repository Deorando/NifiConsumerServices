
package Put_hdfs_hour;

import java.util.List;
import javax.annotation.Generated;

import Merge_model.MPosition;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class PutHdfsHour {

    @SerializedName("bulletins")
    private List<Object> mBulletins;
    @SerializedName("component")
    private HComponent mHComponent;
    @SerializedName("inputRequirement")
    private String mInputRequirement;
    @SerializedName("permissions")
    private HPermissions mHPermissions;
    @SerializedName("position")
    private HPosition mHPosition;
    @SerializedName("revision")
    private HRevision mHRevision;

    public List<Object> getBulletins() {
        return mBulletins;
    }

    public void setBulletins(List<Object> bulletins) {
        mBulletins = bulletins;
    }

    public HComponent getComponent() {
        return mHComponent;
    }

    public void setComponent(HComponent HComponent) {
        mHComponent = HComponent;
    }

    public String getInputRequirement() {
        return mInputRequirement;
    }

    public void setInputRequirement(String inputRequirement) {
        mInputRequirement = inputRequirement;
    }

    public HPermissions getPermissions() {
        return mHPermissions;
    }

    public void setPermissions(HPermissions HPermissions) {
        mHPermissions = HPermissions;
    }

    public HPosition getPosition() {
        return mHPosition;
    }

    public void setPosition(HPosition HPosition) {
        mHPosition = HPosition;
    }

    public HRevision getRevision() {
        return mHRevision;
    }

    public void setRevision(HRevision HRevision) {
        mHRevision = HRevision;
    }
    public PutHdfsHour(HPosition p,HConfig hconfig,String name){
        mHRevision= new HRevision();
        mHPosition= p;
        mHPermissions= new HPermissions();
        mHComponent=new HComponent(p,hconfig,name);
        mInputRequirement="INPUT_REQUIRED";

    }

}
