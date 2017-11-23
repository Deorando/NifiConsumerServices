
package XRead;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class XConfig {

    @SerializedName("bulletinLevel")
    private String mBulletinLevel;
    @SerializedName("comments")
    private String mComments;
    @SerializedName("concurrentlySchedulableTaskCount")
    private Long mConcurrentlySchedulableTaskCount;
    @SerializedName("defaultConcurrentTasks")
    private XDefaultConcurrentTasks mXDefaultConcurrentTasks;
    @SerializedName("defaultSchedulingPeriod")
    private XDefaultSchedulingPeriod mXDefaultSchedulingPeriod;
    @SerializedName("descriptors")
    private XDescriptors mXDescriptors;
    @SerializedName("lossTolerant")
    private Boolean mLossTolerant;
    @SerializedName("penaltyDuration")
    private String mPenaltyDuration;
    @SerializedName("properties")
    private XProperties mXProperties;
    @SerializedName("runDurationMillis")
    private Long mRunDurationMillis;
    @SerializedName("schedulingPeriod")
    private String mSchedulingPeriod;
    @SerializedName("schedulingStrategy")
    private String mSchedulingStrategy;
    @SerializedName("yieldDuration")
    private String mYieldDuration;

    public String getBulletinLevel() {
        return mBulletinLevel;
    }

    public void setBulletinLevel(String bulletinLevel) {
        mBulletinLevel = bulletinLevel;
    }

    public String getComments() {
        return mComments;
    }

    public void setComments(String comments) {
        mComments = comments;
    }

    public Long getConcurrentlySchedulableTaskCount() {
        return mConcurrentlySchedulableTaskCount;
    }

    public void setConcurrentlySchedulableTaskCount(Long concurrentlySchedulableTaskCount) {
        mConcurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
    }

    public XDefaultConcurrentTasks getDefaultConcurrentTasks() {
        return mXDefaultConcurrentTasks;
    }

    public void setDefaultConcurrentTasks(XDefaultConcurrentTasks XDefaultConcurrentTasks) {
        mXDefaultConcurrentTasks = XDefaultConcurrentTasks;
    }

    public XDefaultSchedulingPeriod getDefaultSchedulingPeriod() {
        return mXDefaultSchedulingPeriod;
    }

    public void setDefaultSchedulingPeriod(XDefaultSchedulingPeriod XDefaultSchedulingPeriod) {
        mXDefaultSchedulingPeriod = XDefaultSchedulingPeriod;
    }

    public XDescriptors getDescriptors() {
        return mXDescriptors;
    }

    public void setDescriptors(XDescriptors XDescriptors) {
        mXDescriptors = XDescriptors;
    }

    public Boolean getLossTolerant() {
        return mLossTolerant;
    }

    public void setLossTolerant(Boolean lossTolerant) {
        mLossTolerant = lossTolerant;
    }

    public String getPenaltyDuration() {
        return mPenaltyDuration;
    }

    public void setPenaltyDuration(String penaltyDuration) {
        mPenaltyDuration = penaltyDuration;
    }

    public XProperties getProperties() {
        return mXProperties;
    }

    public void setProperties(XProperties XProperties) {
        mXProperties = XProperties;
    }

    public Long getRunDurationMillis() {
        return mRunDurationMillis;
    }

    public void setRunDurationMillis(Long runDurationMillis) {
        mRunDurationMillis = runDurationMillis;
    }

    public String getSchedulingPeriod() {
        return mSchedulingPeriod;
    }

    public void setSchedulingPeriod(String schedulingPeriod) {
        mSchedulingPeriod = schedulingPeriod;
    }

    public String getSchedulingStrategy() {
        return mSchedulingStrategy;
    }

    public void setSchedulingStrategy(String schedulingStrategy) {
        mSchedulingStrategy = schedulingStrategy;
    }

    public String getYieldDuration() {
        return mYieldDuration;
    }

    public void setYieldDuration(String yieldDuration) {
        mYieldDuration = yieldDuration;
    }

}
