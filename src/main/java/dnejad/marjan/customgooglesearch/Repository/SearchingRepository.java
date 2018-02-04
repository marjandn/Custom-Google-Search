package dnejad.marjan.customgooglesearch.Repository;



import dnejad.marjan.customgooglesearch.Models.Result;
import io.reactivex.Observable;

/**
 * Created by M.DN
 * On 09/01/2018
 *
 *
 * we use this interface for handle each type of search in Search class
 */
public interface SearchingRepository {

    Observable<Result> searching(String q, String equalSearch,
                                 String orText, int itemCount,
                                 String titleText, String urlText,
                                 String siteText,String siteFilter,
                                 String cutText, String incText
                                 );
    Observable<Result> searching(String q,String equalText,String orText,int itemCount,String progLang,
                                 String siteText,String siteFilter);
}
