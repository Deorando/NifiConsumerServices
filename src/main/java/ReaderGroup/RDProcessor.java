
package ReaderGroup;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class RDProcessor {

    @SerializedName("bulletins")
    private List<Object> mBulletins;
    @SerializedName("component")
    private RDComponent mRDComponent;
    @SerializedName("id")
    private String mId;
    @SerializedName("inputRequirement")
    private String mInputRequirement;
    @SerializedName("permissions")
    private RDPermissions mRDPermissions;
    @SerializedName("position")
    private RDPosition mRDPosition;
    @SerializedName("revision")
    private RDRevision mRDRevision;
    @SerializedName("status")
    private RDStatus mRDStatus;
    @SerializedName("uri")
    private String mUri;

    public List<Object> getBulletins() {
        return mBulletins;
    }

    public void setBulletins(List<Object> bulletins) {
        mBulletins = bulletins;
    }

    public RDComponent getComponent() {
        return mRDComponent;
    }

    public void setComponent(RDComponent RDComponent) {
        mRDComponent = RDComponent;
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

    public RDPermissions getPermissions() {
        return mRDPermissions;
    }

    public void setPermissions(RDPermissions RDPermissions) {
        mRDPermissions = RDPermissions;
    }

    public RDPosition getPosition() {
        return mRDPosition;
    }

    public void setPosition(RDPosition RDPosition) {
        mRDPosition = RDPosition;
    }

    public RDRevision getRevision() {
        return mRDRevision;
    }

    public void setRevision(RDRevision RDRevision) {
        mRDRevision = RDRevision;
    }

    public RDStatus getStatus() {
        return mRDStatus;
    }

    public void setStatus(RDStatus RDStatus) {
        mRDStatus = RDStatus;
    }

    public String getUri() {
        return mUri;
    }

    public void setUri(String uri) {
        mUri = uri;
    }

}
