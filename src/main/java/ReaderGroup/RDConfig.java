
package ReaderGroup;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class RDConfig {

    @SerializedName("bulletinLevel")
    private String mBulletinLevel;
    @SerializedName("comments")
    private String mComments;
    @SerializedName("concurrentlySchedulableTaskCount")
    private Long mConcurrentlySchedulableTaskCount;
    @SerializedName("defaultConcurrentTasks")
    private RDDefaultConcurrentTasks mRDDefaultConcurrentTasks;
    @SerializedName("defaultSchedulingPeriod")
    private RDDefaultSchedulingPeriod mRDDefaultSchedulingPeriod;
    @SerializedName("descriptors")
    private RDDescriptors mRDDescriptors;
    @SerializedName("lossTolerant")
    private Boolean mLossTolerant;
    @SerializedName("penaltyDuration")
    private String mPenaltyDuration;
    @SerializedName("properties")
    private RDProperties mRDProperties;
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

    public RDDefaultConcurrentTasks getDefaultConcurrentTasks() {
        return mRDDefaultConcurrentTasks;
    }

    public void setDefaultConcurrentTasks(RDDefaultConcurrentTasks RDDefaultConcurrentTasks) {
        mRDDefaultConcurrentTasks = RDDefaultConcurrentTasks;
    }

    public RDDefaultSchedulingPeriod getDefaultSchedulingPeriod() {
        return mRDDefaultSchedulingPeriod;
    }

    public void setDefaultSchedulingPeriod(RDDefaultSchedulingPeriod RDDefaultSchedulingPeriod) {
        mRDDefaultSchedulingPeriod = RDDefaultSchedulingPeriod;
    }

    public RDDescriptors getDescriptors() {
        return mRDDescriptors;
    }

    public void setDescriptors(RDDescriptors RDDescriptors) {
        mRDDescriptors = RDDescriptors;
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

    public RDProperties getProperties() {
        return mRDProperties;
    }

    public void setProperties(RDProperties RDProperties) {
        mRDProperties = RDProperties;
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
