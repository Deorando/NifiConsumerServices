
package nifi_objects.Consumer_model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Consumer {

    @SerializedName("component")
    private Component mComponent;
    @SerializedName("inputRequirement")
    private String mInputRequirement;
    @SerializedName("permissions")
    private Permissions mPermissions;
    @SerializedName("position")
    private Position mPosition;
    @SerializedName("revision")
    private Revision revision;



    public Component getComponent() {
        return mComponent;
    }

    public void setComponent(Component component) {
        mComponent = component;
    }

    public String getInputRequirement() {
        return mInputRequirement;
    }

    public void setInputRequirement(String inputRequirement) {
        mInputRequirement = inputRequirement;
    }

    public Permissions getPermissions() {
        return mPermissions;
    }

    public void setPermissions(Permissions permissions) {
        mPermissions = permissions;
    }

    public Position getPosition() {
        return mPosition;
    }

    public void setPosition(Position position) {
        mPosition = position;
    }

   public Consumer(Position p,Properties pr,String name ){
        revision= new Revision();
        mComponent=new Component(p,pr,name);
        mPermissions= new Permissions();
        mPosition=p;
        mInputRequirement="INPUT_FORBIDDEN";




   }

}
