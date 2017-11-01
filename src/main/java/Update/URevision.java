
package Update;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class URevision {

    @SerializedName("clientId")
    private String mClientId;
    @SerializedName("version")
    private Long mVersion;

    public String getClientId() {
        return mClientId;
    }

    public void setClientId(String clientId) {
        mClientId = clientId;
    }

    public Long getVersion() {
        return mVersion;
    }

    public void setVersion(Long version) {
        mVersion = version;
    }

    public URevision(String clientID,long version){
        mClientId=clientID;
        mVersion=version;

    }

}
