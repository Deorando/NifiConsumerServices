
package Put_hdfs_hour;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class HConfig {

    @SerializedName("bulletinLevel")
    private String mBulletinLevel;
    @SerializedName("comments")
    private String mComments;
    @SerializedName("concurrentlySchedulableTaskCount")
    private Long mConcurrentlySchedulableTaskCount;
    @SerializedName("defaultConcurrentTasks")
    private HDefaultConcurrentTasks mHDefaultConcurrentTasks;
    @SerializedName("defaultSchedulingPeriod")
    private HDefaultSchedulingPeriod mHDefaultSchedulingPeriod;
    @SerializedName("lossTolerant")
    private Boolean mLossTolerant;
    @SerializedName("penaltyDuration")
    private String mPenaltyDuration;
    @SerializedName("properties")
    private HProperties mHProperties;
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

    public HDefaultConcurrentTasks getDefaultConcurrentTasks() {
        return mHDefaultConcurrentTasks;
    }

    public void setDefaultConcurrentTasks(HDefaultConcurrentTasks HDefaultConcurrentTasks) {
        mHDefaultConcurrentTasks = HDefaultConcurrentTasks;
    }

    public HDefaultSchedulingPeriod getDefaultSchedulingPeriod() {
        return mHDefaultSchedulingPeriod;
    }

    public void setDefaultSchedulingPeriod(HDefaultSchedulingPeriod HDefaultSchedulingPeriod) {
        mHDefaultSchedulingPeriod = HDefaultSchedulingPeriod;
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

    public HProperties getProperties() {
        return mHProperties;
    }

    public void setProperties(HProperties HProperties) {
        mHProperties = HProperties;
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

    public HConfig(HProperties ppr){
        mHProperties=ppr;
        this.mSchedulingPeriod= "0 sec";
        this.mSchedulingStrategy= "TIMER_DRIVEN";
        this.mPenaltyDuration= "30 sec";
        this.mYieldDuration= "1 sec";
        this.mBulletinLevel= "WARN";
        this.mRunDurationMillis= 0l;
        this.mConcurrentlySchedulableTaskCount= 1l;
        this.mComments= "";
        this.mLossTolerant= false;
        mHDefaultConcurrentTasks  = new HDefaultConcurrentTasks();
        mHDefaultSchedulingPeriod = new HDefaultSchedulingPeriod();

    }


}
