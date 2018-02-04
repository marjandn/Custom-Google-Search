package dnejad.marjan.customgooglesearch.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by M.DN
 * On 09/01/2018
 */
public class Postaladdress {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("streetaddress")
    @Expose
    private String streetaddress;
    @SerializedName("addresslocality")
    @Expose
    private String addresslocality;
    @SerializedName("addressregion")
    @Expose
    private String addressregion;
    @SerializedName("postalcode")
    @Expose
    private String postalcode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public String getAddresslocality() {
        return addresslocality;
    }

    public void setAddresslocality(String addresslocality) {
        this.addresslocality = addresslocality;
    }

    public String getAddressregion() {
        return addressregion;
    }

    public void setAddressregion(String addressregion) {
        this.addressregion = addressregion;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }
}
