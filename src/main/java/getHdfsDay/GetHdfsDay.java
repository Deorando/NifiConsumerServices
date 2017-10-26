
package getHdfsDay;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class GetHdfsDay {

    @SerializedName("bulletins")
    private List<Object> mBulletins;
    @SerializedName("component")
    private GDComponent mGDComponent;
    @SerializedName("inputRequirement")
    private String mInputRequirement;
    @SerializedName("permissions")
    private GDPermissions mGDPermissions;
    @SerializedName("position")
    private GDPosition mGDPosition;
    @SerializedName("revision")
    private GDRevision mGDRevision;

    public List<Object> getBulletins() {
        return mBulletins;
    }

    public void setBulletins(List<Object> bulletins) {
        mBulletins = bulletins;
    }

    public GDComponent getComponent() {
        return mGDComponent;
    }

    public void setComponent(GDComponent GDComponent) {
        mGDComponent = GDComponent;
    }

    public String getInputRequirement() {
        return mInputRequirement;
    }

    public void setInputRequirement(String inputRequirement) {
        mInputRequirement = inputRequirement;
    }

    public GDPermissions getPermissions() {
        return mGDPermissions;
    }

    public void setPermissions(GDPermissions GDPermissions) {
        mGDPermissions = GDPermissions;
    }

    public GDPosition getPosition() {
        return mGDPosition;
    }

    public void setPosition(GDPosition GDPosition) {
        mGDPosition = GDPosition;
    }

    public GDRevision getRevision() {
        return mGDRevision;
    }

    public void setRevision(GDRevision GDRevision) {
        mGDRevision = GDRevision;
    }

    public GetHdfsDay(GDPosition p,String name,GDProperties pr,String sPeriod,String sStrategy){
        mGDRevision=new GDRevision();
        mGDPermissions=new GDPermissions();
        mGDPosition=p;
        mGDComponent=new GDComponent(p,pr,name,sPeriod,sStrategy);
        mInputRequirement="INPUT_FORBIDDEN";



    }

}
