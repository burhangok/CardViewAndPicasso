package turyol.com.turyol;

import java.io.Serializable;

public class ShipItem implements Serializable {

    private String shipName;
    private String shipPhoto;

    public ShipItem(String shipName, String shipPhoto) {
        this.shipName = shipName;
        this.shipPhoto = shipPhoto;
    }

    public ShipItem() {
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipPhoto() {
        return shipPhoto;
    }

    public void setShipPhoto(String shipPhoto) {
        this.shipPhoto = shipPhoto;
    }




}
