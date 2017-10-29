
package Connection;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Source {

    @SerializedName("comments")
    private String mComments;
    @SerializedName("groupId")
    private String mGroupId;
    @SerializedName("id")
    private String mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("running")
    private Boolean mRunning;
    @SerializedName("type")
    private String mType;

    public String getComments() {
        return mComments;
    }

    public void setComments(String comments) {
        mComments = comments;
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

    public Boolean getRunning() {
        return mRunning;
    }

    public void setRunning(Boolean running) {
        mRunning = running;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public Source (String s_id,String s_type,String s_groupId,String s_name){
        this.mId=s_id;
        this.mGroupId=s_groupId;
        this.mName=s_name;
        this.mType=s_type;
        this.mRunning=false;
        this.mComments=null;
    }

}
