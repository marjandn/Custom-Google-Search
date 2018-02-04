package dnejad.marjan.customgooglesearch.Models;

/**
 * Created by M.DN
 * On 09/01/2018
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CseThumbnail {

    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("src")
    @Expose
    private String src;

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

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

}