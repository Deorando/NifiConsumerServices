
package nifi_objects.Consumer_model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Permissions {

    @SerializedName("canRead")
    private Boolean mCanRead;
    @SerializedName("canWrite")
    private Boolean mCanWrite;

    public Boolean getCanRead() {
        return mCanRead;
    }

    public Boolean getCanWrite() {
        return mCanWrite;
    }

    public Permissions(){
        mCanRead=true;
        mCanWrite=true;
    }

}
