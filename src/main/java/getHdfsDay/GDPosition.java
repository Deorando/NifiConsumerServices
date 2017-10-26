
package getHdfsDay;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class GDPosition {

    @SerializedName("x")
    private Double mX;
    @SerializedName("y")
    private Long mY;

    public Double getX() {
        return mX;
    }

    public void setX(Double x) {
        mX = x;
    }

    public Long getY() {
        return mY;
    }

    public void setY(Long y) {
        mY = y;
    }

    public GDPosition(double mX,Long mY){
        this.mX=mX;
        this.mY=mY;

    }

}
