package dnejad.marjan.customgooglesearch.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by M.DN
 * On 09/01/2018
 */
public class Physician {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("alumni")
    @Expose
    private String alumni;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlumni() {
        return alumni;
    }

    public void setAlumni(String alumni) {
        this.alumni = alumni;
    }

}
