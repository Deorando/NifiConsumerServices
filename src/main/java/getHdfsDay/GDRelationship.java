
package getHdfsDay;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class GDRelationship {

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

}
