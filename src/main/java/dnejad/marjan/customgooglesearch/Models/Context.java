package dnejad.marjan.customgooglesearch.Models;

import java.util.List;

/**
 * Created by M.DN
 * On 08/01/2018
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Context {

    @SerializedName("title")
    @Expose
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
