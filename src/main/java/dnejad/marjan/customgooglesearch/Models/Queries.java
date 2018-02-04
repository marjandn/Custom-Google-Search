package dnejad.marjan.customgooglesearch.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by M.DN
 * On 08/01/2018
 */
public class Queries {
    @SerializedName("request")
    @Expose
    private List<Request> request = null;
    @SerializedName("nextPage")
    @Expose
    private List<NextPage> nextPage = null;

    public List<Request> getRequest() {
        return request;
    }

    public void setRequest(List<Request> request) {
        this.request = request;
    }

    public List<NextPage> getNextPage() {
        return nextPage;
    }

    public void setNextPage(List<NextPage> nextPage) {
        this.nextPage = nextPage;
    }
}
