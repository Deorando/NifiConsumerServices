
package processGroup;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ProcessGroup {

    @SerializedName("activeRemotePortCount")
    private Long mActiveRemotePortCount;
    @SerializedName("bulletins")
    private List<Object> mBulletins;
    @SerializedName("component")
    private PComponent mPComponent;
    @SerializedName("disabledCount")
    private Long mDisabledCount;
    @SerializedName("inactiveRemotePortCount")
    private Long mInactiveRemotePortCount;
    @SerializedName("inputPortCount")
    private Long mInputPortCount;
    @SerializedName("invalidCount")
    private Long mInvalidCount;
    @SerializedName("outputPortCount")
    private Long mOutputPortCount;
    @SerializedName("permissions")
    private PPermissions mPPermissions;
    @SerializedName("position")
    private PPosition mPPosition;
    @SerializedName("revision")
    private PRevision mPRevision;
    @SerializedName("runningCount")
    private Long mRunningCount;
    @SerializedName("stoppedCount")
    private Long mStoppedCount;

    public Long getActiveRemotePortCount() {
        return mActiveRemotePortCount;
    }

    public void setActiveRemotePortCount(Long activeRemotePortCount) {
        mActiveRemotePortCount = activeRemotePortCount;
    }

    public List<Object> getBulletins() {
        return mBulletins;
    }

    public void setBulletins(List<Object> bulletins) {
        mBulletins = bulletins;
    }

    public PComponent getComponent() {
        return mPComponent;
    }

    public void setComponent(PComponent PComponent) {
        mPComponent = PComponent;
    }

    public Long getDisabledCount() {
        return mDisabledCount;
    }

    public void setDisabledCount(Long disabledCount) {
        mDisabledCount = disabledCount;
    }

    public Long getInactiveRemotePortCount() {
        return mInactiveRemotePortCount;
    }

    public void setInactiveRemotePortCount(Long inactiveRemotePortCount) {
        mInactiveRemotePortCount = inactiveRemotePortCount;
    }

    public Long getInputPortCount() {
        return mInputPortCount;
    }

    public void setInputPortCount(Long inputPortCount) {
        mInputPortCount = inputPortCount;
    }

    public Long getInvalidCount() {
        return mInvalidCount;
    }

    public void setInvalidCount(Long invalidCount) {
        mInvalidCount = invalidCount;
    }

    public Long getOutputPortCount() {
        return mOutputPortCount;
    }

    public void setOutputPortCount(Long outputPortCount) {
        mOutputPortCount = outputPortCount;
    }

    public PPermissions getPermissions() {
        return mPPermissions;
    }

    public void setPermissions(PPermissions PPermissions) {
        mPPermissions = PPermissions;
    }

    public PPosition getPosition() {
        return mPPosition;
    }

    public void setPosition(PPosition PPosition) {
        mPPosition = PPosition;
    }

    public PRevision getRevision() {
        return mPRevision;
    }

    public void setRevision(PRevision PRevision) {
        mPRevision = PRevision;
    }

    public Long getRunningCount() {
        return mRunningCount;
    }

    public void setRunningCount(Long runningCount) {
        mRunningCount = runningCount;
    }

    public Long getStoppedCount() {
        return mStoppedCount;
    }

    public void setStoppedCount(Long stoppedCount) {
        mStoppedCount = stoppedCount;
    }

    public ProcessGroup(PPosition p,String name){
        this.mRunningCount= 0l;
        this.mStoppedCount= 0l;
        this.mInvalidCount= 0l;
        this.mDisabledCount= 0l;
        this.mActiveRemotePortCount= 0l;
        this.mInactiveRemotePortCount= 0l;
        this.mInputPortCount= 0l;
        this.mOutputPortCount= 0l;
        mPRevision= new PRevision();
        mPPermissions= new PPermissions();
        mPComponent= new PComponent(p,name);



    }

}
