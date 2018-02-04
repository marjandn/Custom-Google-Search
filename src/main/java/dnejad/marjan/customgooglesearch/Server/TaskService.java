package dnejad.marjan.customgooglesearch.Server;

import io.reactivex.Observable;

import dnejad.marjan.customgooglesearch.Models.Result;
import retrofit2.http.GET;
import retrofit2.http.Url;


/**
 * Created by M.DN
 * On 08/01/2018
 *
 *
 * this class is for sending request to server
 * and we have just one request because it use dynamic url
 * and all arguments are in url and send with it
 */
public interface TaskService {

    /*
    * we use dynamic url , because custom google search don't get parameters
    * and just know the whole url
    */
    @GET
    Observable<Result> searching(@Url String url);

}
