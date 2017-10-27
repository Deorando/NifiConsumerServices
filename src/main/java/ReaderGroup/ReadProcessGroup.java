
package ReaderGroup;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ReadProcessGroup {

    @SerializedName("processors")
    private List<RDProcessor> mRDProcessors;

    public List<RDProcessor> getProcessors() {
        return mRDProcessors;
    }

    public void setProcessors(List<RDProcessor> RDProcessors) {
        mRDProcessors = RDProcessors;
    }

}
