
package XRead;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class XReadProcessGroup {

    @SerializedName("processors")
    private List<XProcessor> mXProcessors;

    public List<XProcessor> getProcessors() {
        return mXProcessors;
    }

    public void setProcessors(List<XProcessor> XProcessors) {
        mXProcessors = XProcessors;
    }

}
