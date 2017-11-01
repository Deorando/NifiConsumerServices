
package Update;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class UConfig {

    @SerializedName("autoTerminatedRelationships")
    private List<String> mAutoTerminatedRelationships;

    public List<String> getAutoTerminatedRelationships() {
        return mAutoTerminatedRelationships;
    }

    public void setAutoTerminatedRelationships(List<String> autoTerminatedRelationships) {
        mAutoTerminatedRelationships = autoTerminatedRelationships;
    }

    public UConfig(String relation){
        mAutoTerminatedRelationships= new ArrayList<String>();
        mAutoTerminatedRelationships.add(relation);
    }



}
