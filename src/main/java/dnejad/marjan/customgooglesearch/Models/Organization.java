package dnejad.marjan.customgooglesearch.Models;

/**
 * Created by M.DN
 * On 09/01/2018
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Organization {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("baseUrl")
    @Expose
    private String url;
    @SerializedName("logo")
    @Expose
    private String logo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
