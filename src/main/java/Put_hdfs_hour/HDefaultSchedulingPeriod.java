
package Put_hdfs_hour;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class HDefaultSchedulingPeriod {

    @SerializedName("CRON_DRIVEN")
    private String mCRONDRIVEN;
    @SerializedName("TIMER_DRIVEN")
    private String mTIMERDRIVEN;

    public String getCRONDRIVEN() {
        return mCRONDRIVEN;
    }

    public void setCRONDRIVEN(String CRONDRIVEN) {
        mCRONDRIVEN = CRONDRIVEN;
    }

    public String getTIMERDRIVEN() {
        return mTIMERDRIVEN;
    }

    public void setTIMERDRIVEN(String TIMERDRIVEN) {
        mTIMERDRIVEN = TIMERDRIVEN;
    }
    public HDefaultSchedulingPeriod(){
        mCRONDRIVEN="* * * * * ?";
        mTIMERDRIVEN="0 sec";
    }

}
