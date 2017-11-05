package Locations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thomas.palyska on 03.11.2017.
 */
public class Locations {
    List<String> locations= new ArrayList<String>();

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public Locations() {
        this.locations.add("/tp");
        this.locations.add("/ddach");
        this.locations.add("/dint");
        this.locations.add("/ac");
        this.locations.add("/id");
        this.locations.add(" ");

    }
}
