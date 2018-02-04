package dnejad.marjan.customgooglesearch;

import dnejad.marjan.customgooglesearch.Models.Result;

/**
 * Created by M.DN
 * On 09/01/2018
 *
 * this class is an interface between CustomGoogleSearch Module
 * and the project that use it
 * to all get search notifications in project
 */
public interface SearchingInteractor {

     void onSearchingComplete(Result results);

     void onSearchError(String error);
}
