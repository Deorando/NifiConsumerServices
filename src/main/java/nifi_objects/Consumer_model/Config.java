
package nifi_objects.Consumer_model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Config {

    @SerializedName("bulletinLevel")
    private String mBulletinLevel;
    @SerializedName("comments")
    private String mComments;
    @SerializedName("concurrentlySchedulableTaskCount")
    private int mConcurrentlySchedulableTaskCount;
    @SerializedName("defaultConcurrentTasks")
    private DefaultConcurrentTasks mDefaultConcurrentTasks;
    @SerializedName("defaultSchedulingPeriod")
    private DefaultSchedulingPeriod mDefaultSchedulingPeriod;
    @SerializedName("lossTolerant")
    private Boolean mLossTolerant;
    @SerializedName("penaltyDuration")
    private String mPenaltyDuration;
    @SerializedName("properties")
    private Properties mProperties;
    @SerializedName("runDurationMillis")
    private int mRunDurationMillis;
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

    public Config(Properties pr) {

        this.mSchedulingPeriod="0 sec";
        this.mSchedulingStrategy="TIMER_DRIVEN";
        this.mPenaltyDuration="30 sec";
        this.mYieldDuration="1 sec";
        this.mBulletinLevel="WARN";
        this.mRunDurationMillis=0;
        this.mConcurrentlySchedulableTaskCount=1;
        this.mComments="";
        this.mLossTolerant=false;
        mDefaultConcurrentTasks  = new DefaultConcurrentTasks();
        mDefaultSchedulingPeriod = new DefaultSchedulingPeriod();
        mProperties= pr;



    }

    public String getComments() {
        return mComments;
    }

    public void setComments(String comments) {
        mComments = comments;
    }

    public int getConcurrentlySchedulableTaskCount() {
        return mConcurrentlySchedulableTaskCount;
    }

    public void setConcurrentlySchedulableTaskCount(int concurrentlySchedulableTaskCount) {
        mConcurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
    }

    public DefaultConcurrentTasks getDefaultConcurrentTasks() {
        return mDefaultConcurrentTasks;
    }

    public void setDefaultConcurrentTasks(DefaultConcurrentTasks defaultConcurrentTasks) {
        mDefaultConcurrentTasks = defaultConcurrentTasks;
    }

    public DefaultSchedulingPeriod getDefaultSchedulingPeriod() {
        return mDefaultSchedulingPeriod;
    }

    public void setDefaultSchedulingPeriod(DefaultSchedulingPeriod defaultSchedulingPeriod) {
        mDefaultSchedulingPeriod = defaultSchedulingPeriod;
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

    public Properties getProperties() {
        return mProperties;
    }

    public void setProperties(Properties properties) {
        mProperties = properties;
    }

    public int getRunDurationMillis() {
        return mRunDurationMillis;
    }

    public void setRunDurationMillis(int runDurationMillis) {
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
