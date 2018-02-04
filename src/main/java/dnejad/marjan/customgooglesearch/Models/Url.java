package dnejad.marjan.customgooglesearch.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by M.DN
 * On 08/01/2018
 */
public class Url {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("template")
    @Expose
    private String template;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
