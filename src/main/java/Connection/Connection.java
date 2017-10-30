
package Connection;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Connection {

    @SerializedName("bends")
    private List<Object> mBends;
    @SerializedName("bulletins")
    private List<Object> mBulletins;
    @SerializedName("component")
    private Component mComponent;
    @SerializedName("labelIndex")
    private Long mLabelIndex;
    @SerializedName("permissions")
    private Permissions mPermissions;
    @SerializedName("revision")
    private Revision mRevision;
    @SerializedName("zIndex")
    private Long mZIndex;

    public List<Object> getBends() {
        return mBends;
    }

    public void setBends(List<Object> bends) {
        mBends = bends;
    }

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

    public Long getLabelIndex() {
        return mLabelIndex;
    }

    public void setLabelIndex(Long labelIndex) {
        mLabelIndex = labelIndex;
    }

    public Permissions getPermissions() {
        return mPermissions;
    }

    public void setPermissions(Permissions permissions) {
        mPermissions = permissions;
    }

    public Revision getRevision() {
        return mRevision;
    }

    public void setRevision(Revision revision) {
        mRevision = revision;
    }

    public Long getZIndex() {
        return mZIndex;
    }

    public void setZIndex(Long zIndex) {
        mZIndex = zIndex;
    }

    public Connection(String d_id,String d_type,String d_groupId,String d_name,String s_id,String s_type,String s_groupId,String s_name,String Relations){
        this.mLabelIndex=1l;
        this.mZIndex=0l;
        Destination destination = new Destination(d_id,d_type,d_groupId,d_name);
        Source source= new Source(s_id,s_type,s_groupId,s_name);
        mComponent= new Component(destination,source,Relations);
        mRevision= new Revision();

    }

}
