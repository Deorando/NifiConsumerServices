
package XRead;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class XPermissions {

    @SerializedName("canRead")
    private Boolean mCanRead;
    @SerializedName("canWrite")
    private Boolean mCanWrite;

    public Boolean getCanRead() {
        return mCanRead;
    }

    public void setCanRead(Boolean canRead) {
        mCanRead = canRead;
    }

    public Boolean getCanWrite() {
        return mCanWrite;
    }

    public void setCanWrite(Boolean canWrite) {
        mCanWrite = canWrite;
    }

}
