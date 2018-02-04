package dnejad.marjan.customgooglesearch.Models;

/**
 * Created by M.DN
 * On 09/01/2018
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Person {

    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("baseUrl")
    @Expose
    private String url;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
