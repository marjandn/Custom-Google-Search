package dnejad.marjan.customgooglesearch.Models;

/**
 * Created by M.DN
 * On 09/01/2018
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Breadcrumb {

    @SerializedName("baseUrl")
    @Expose
    private String url;
    @SerializedName("title")
    @Expose
    private String title;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
