
package nifi_objects.Consumer_model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Position {

    @SerializedName("x")
    private Double mX;
    @SerializedName("y")
    private Double mY;



    public Double getX() {
        return mX;
    }

    public void setX(Double x) {
        mX = x;
    }

    public Double getY() {
        return mY;
    }

    public void setY(Double y) {
        mY = y;
    }

    public Position(Double mX, Double mY) {
        this.mX = mX;
        this.mY = mY;
    }

}
