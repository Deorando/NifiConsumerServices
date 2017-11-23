
package XRead;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class XStatus {

    @SerializedName("aggregateSnapshot")
    private XAggregateSnapshot mXAggregateSnapshot;
    @SerializedName("groupId")
    private String mGroupId;
    @SerializedName("id")
    private String mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("statsLastRefreshed")
    private String mStatsLastRefreshed;

    public XAggregateSnapshot getAggregateSnapshot() {
        return mXAggregateSnapshot;
    }

    public void setAggregateSnapshot(XAggregateSnapshot XAggregateSnapshot) {
        mXAggregateSnapshot = XAggregateSnapshot;
    }

    public String getGroupId() {
        return mGroupId;
    }

    public void setGroupId(String groupId) {
        mGroupId = groupId;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getStatsLastRefreshed() {
        return mStatsLastRefreshed;
    }

    public void setStatsLastRefreshed(String statsLastRefreshed) {
        mStatsLastRefreshed = statsLastRefreshed;
    }

}
