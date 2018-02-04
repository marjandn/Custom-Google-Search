package dnejad.marjan.customgooglesearch.Models;

/**
 * Created by M.DN
 * On 09/01/2018
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Imageobject {

    @SerializedName("baseUrl")
    @Expose
    private String url;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

}
