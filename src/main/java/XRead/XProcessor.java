
package XRead;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class XProcessor {

    @SerializedName("bulletins")
    private List<Object> mBulletins;
    @SerializedName("component")
    private XComponent mXComponent;
    @SerializedName("id")
    private String mId;
    @SerializedName("inputRequirement")
    private String mInputRequirement;
    @SerializedName("permissions")
    private XPermissions mXPermissions;
    @SerializedName("position")
    private XPosition mXPosition;
    @SerializedName("revision")
    private XRevision mXRevision;
    @SerializedName("status")
    private XStatus mXStatus;
    @SerializedName("uri")
    private String mUri;

    public List<Object> getBulletins() {
        return mBulletins;
    }

    public void setBulletins(List<Object> bulletins) {
        mBulletins = bulletins;
    }

    public XComponent getComponent() {
        return mXComponent;
    }

    public void setComponent(XComponent XComponent) {
        mXComponent = XComponent;
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

    public XPermissions getPermissions() {
        return mXPermissions;
    }

    public void setPermissions(XPermissions XPermissions) {
        mXPermissions = XPermissions;
    }

    public XPosition getPosition() {
        return mXPosition;
    }

    public void setPosition(XPosition XPosition) {
        mXPosition = XPosition;
    }

    public XRevision getRevision() {
        return mXRevision;
    }

    public void setRevision(XRevision XRevision) {
        mXRevision = XRevision;
    }

    public XStatus getStatus() {
        return mXStatus;
    }

    public void setStatus(XStatus XStatus) {
        mXStatus = XStatus;
    }

    public String getUri() {
        return mUri;
    }

    public void setUri(String uri) {
        mUri = uri;
    }

}
