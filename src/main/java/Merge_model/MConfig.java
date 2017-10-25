package Merge_model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class MConfig {

    @SerializedName("bulletinLevel")
    private String mBulletinLevel;
    @SerializedName("comments")
    private String mComments;
    @SerializedName("concurrentlySchedulableTaskCount")
    private Long mConcurrentlySchedulableTaskCount;
    @SerializedName("defaultConcurrentTasks")
    private MDefaultConcurrentTasks mMDefaultConcurrentTasks;
    @SerializedName("defaultSchedulingPeriod")
    private MDefaultSchedulingPeriod mMDefaultSchedulingPeriod;
    @SerializedName("lossTolerant")
    private Boolean mLossTolerant;
    @SerializedName("penaltyDuration")
    private String mPenaltyDuration;
    @SerializedName("properties")
    private MProperties mMProperties;
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

    public MDefaultConcurrentTasks getDefaultConcurrentTasks() {
        return mMDefaultConcurrentTasks;
    }

    public void setDefaultConcurrentTasks(MDefaultConcurrentTasks MDefaultConcurrentTasks) {
        mMDefaultConcurrentTasks = MDefaultConcurrentTasks;
    }

    public MDefaultSchedulingPeriod getDefaultSchedulingPeriod() {
        return mMDefaultSchedulingPeriod;
    }

    public void setDefaultSchedulingPeriod(MDefaultSchedulingPeriod MDefaultSchedulingPeriod) {
        mMDefaultSchedulingPeriod = MDefaultSchedulingPeriod;
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

    public MProperties getProperties() {
        return mMProperties;
    }

    public void setProperties(MProperties MProperties) {
        mMProperties = MProperties;
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

    public MConfig(MProperties ppr){
        this.mSchedulingPeriod="3600 sec";
        this.mSchedulingStrategy="TIMER_DRIVEN";
        this.mPenaltyDuration="30 sec";
        this.mYieldDuration="1sec";
        this.mBulletinLevel="WARN";
        this.mRunDurationMillis=0l;
        this.mConcurrentlySchedulableTaskCount=1l;
        this.mComments=null;
        this.mLossTolerant=false;
        mMProperties= ppr;
        MDefaultSchedulingPeriod dsp= new MDefaultSchedulingPeriod();
        MDefaultConcurrentTasks dct= new MDefaultConcurrentTasks();




    }

}
