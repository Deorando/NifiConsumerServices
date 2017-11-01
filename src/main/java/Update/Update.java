
package Update;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Update {

    @SerializedName("component")
    private UComponent mUComponent;
    @SerializedName("revision")
    private URevision mURevision;

    public UComponent getComponent() {
        return mUComponent;
    }

    public void setComponent(UComponent UComponent) {
        mUComponent = UComponent;
    }

    public URevision getRevision() {
        return mURevision;
    }

    public void setRevision(URevision URevision) {
        mURevision = URevision;
    }

    public Update(String id,String name,String state,String clientID,long version,String relation){
        mUComponent= new UComponent(id,name,state,relation);
        mURevision = new URevision(clientID,version);

    }

}
