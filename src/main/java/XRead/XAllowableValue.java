
package XRead;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class XAllowableValue {

    @SerializedName("allowableValue")
    private XAllowableValue mXAllowableValue;
    @SerializedName("canRead")
    private Boolean mCanRead;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("displayName")
    private String mDisplayName;
    @SerializedName("value")
    private String mValue;

    public XAllowableValue getAllowableValue() {
        return mXAllowableValue;
    }

    public void setAllowableValue(XAllowableValue XAllowableValue) {
        mXAllowableValue = XAllowableValue;
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
