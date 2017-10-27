
package ReaderGroup;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class RDDefaultConcurrentTasks {

    @SerializedName("CRON_DRIVEN")
    private String mCRONDRIVEN;
    @SerializedName("EVENT_DRIVEN")
    private String mEVENTDRIVEN;
    @SerializedName("TIMER_DRIVEN")
    private String mTIMERDRIVEN;

    public String getCRONDRIVEN() {
        return mCRONDRIVEN;
    }

    public void setCRONDRIVEN(String CRONDRIVEN) {
        mCRONDRIVEN = CRONDRIVEN;
    }

    public String getEVENTDRIVEN() {
        return mEVENTDRIVEN;
    }

    public void setEVENTDRIVEN(String EVENTDRIVEN) {
        mEVENTDRIVEN = EVENTDRIVEN;
    }

    public String getTIMERDRIVEN() {
        return mTIMERDRIVEN;
    }

    public void setTIMERDRIVEN(String TIMERDRIVEN) {
        mTIMERDRIVEN = TIMERDRIVEN;
    }

}
