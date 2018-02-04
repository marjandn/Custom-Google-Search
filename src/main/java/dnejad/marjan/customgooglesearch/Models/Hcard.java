package dnejad.marjan.customgooglesearch.Models;

/**
 * Created by M.DN
 * On 09/01/2018
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hcard {

    @SerializedName("fn")
    @Expose
    private String fn;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("bday")
    @Expose
    private String bday;

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

}