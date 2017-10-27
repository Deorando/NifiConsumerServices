
package ReaderGroup;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class RDAllowableValue {

    @SerializedName("allowableValue")
    private RDAllowableValue mRDAllowableValue;
    @SerializedName("canRead")
    private Boolean mCanRead;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("displayName")
    private String mDisplayName;
    @SerializedName("value")
    private String mValue;

    public RDAllowableValue getAllowableValue() {
        return mRDAllowableValue;
    }

    public void setAllowableValue(RDAllowableValue RDAllowableValue) {
        mRDAllowableValue = RDAllowableValue;
    }

    public Boolean getCanRead() {
        return mCanRead;
    }

    public void setCanRead(Boolean canRead) {
        mCanRead = canRead;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getDisplayName() {
        return mDisplayName;
    }

    public void setDisplayName(String displayName) {
        mDisplayName = displayName;
    }

    public String getValue() {
        return mValue;
    }

    public void setValue(String value) {
        mValue = value;
    }

}
