
package Update;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class UComponent {

    @SerializedName("config")
    private UConfig mUConfig;
    @SerializedName("id")
    private String mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("state")
    private String mState;

    public UConfig getConfig() {
        return mUConfig;
    }

    public void setConfig(UConfig UConfig) {
        mUConfig = UConfig;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public UComponent(String id,String name,String state,String relation){
        mId=id;
        mName=name;
        mState=state;
        mUConfig= new UConfig(relation);

    }

}
