
package ReaderGroup;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class RDMaxBinAge {

    @SerializedName("description")
    private String mDescription;
    @SerializedName("displayName")
    private String mDisplayName;
    @SerializedName("dynamic")
    private Boolean mDynamic;
    @SerializedName("name")
    private String mName;
    @SerializedName("required")
    private Boolean mRequired;
    @SerializedName("sensitive")
    private Boolean mSensitive;
    @SerializedName("supportsEl")
    private Boolean mSupportsEl;

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

    public Boolean getDynamic() {
        return mDynamic;
    }

    public void setDynamic(Boolean dynamic) {
        mDynamic = dynamic;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Boolean getRequired() {
        return mRequired;
    }

    public void setRequired(Boolean required) {
        mRequired = required;
    }

    public Boolean getSensitive() {
        return mSensitive;
    }

    public void setSensitive(Boolean sensitive) {
        mSensitive = sensitive;
    }

    public Boolean getSupportsEl() {
        return mSupportsEl;
    }

    public void setSupportsEl(Boolean supportsEl) {
        mSupportsEl = supportsEl;
    }

}
