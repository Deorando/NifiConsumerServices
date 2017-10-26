
package getHdfsDay;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class GDConfig {

    @SerializedName("bulletinLevel")
    private String mBulletinLevel;
    @SerializedName("comments")
    private String mComments;
    @SerializedName("concurrentlySchedulableTaskCount")
    private Long mConcurrentlySchedulableTaskCount;
    @SerializedName("defaultConcurrentTasks")
    private GDDefaultConcurrentTasks mGDDefaultConcurrentTasks;
    @SerializedName("defaultSchedulingPeriod")
    private GDDefaultSchedulingPeriod mGDDefaultSchedulingPeriod;
    @SerializedName("lossTolerant")
    private Boolean mLossTolerant;
    @SerializedName("penaltyDuration")
    private String mPenaltyDuration;
    @SerializedName("properties")
    private GDProperties mGDProperties;
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

    public GDDefaultConcurrentTasks getDefaultConcurrentTasks() {
        return mGDDefaultConcurrentTasks;
    }

    public void setDefaultConcurrentTasks(GDDefaultConcurrentTasks GDDefaultConcurrentTasks) {
        mGDDefaultConcurrentTasks = GDDefaultConcurrentTasks;
    }

    public GDDefaultSchedulingPeriod getDefaultSchedulingPeriod() {
        return mGDDefaultSchedulingPeriod;
    }

    public void setDefaultSchedulingPeriod(GDDefaultSchedulingPeriod GDDefaultSchedulingPeriod) {
        mGDDefaultSchedulingPeriod = GDDefaultSchedulingPeriod;
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

    public GDProperties getProperties() {
        return mGDProperties;
    }

    public void setProperties(GDProperties GDProperties) {
        mGDProperties = GDProperties;
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

    public GDConfig(String sPeriod,String sStrategy,GDProperties ppr ){

        //this.mSchedulingPeriod= "0 10 23 * * ?";
        //this.mSchedulingStrategy= "CRON_DRIVEN";
        mGDProperties=ppr;
        this.mSchedulingPeriod= sPeriod;
        this.mSchedulingStrategy= sStrategy;
        this.mPenaltyDuration= "30 sec";
        this.mYieldDuration= "1 sec";
        this.mBulletinLevel= "WARN";
        this.mRunDurationMillis= 0l;
        this.mConcurrentlySchedulableTaskCount= 1l;
        this.mComments="";
        this.mLossTolerant= false;
        mGDDefaultConcurrentTasks  = new GDDefaultConcurrentTasks();
        mGDDefaultSchedulingPeriod = new GDDefaultSchedulingPeriod();
    }

}
