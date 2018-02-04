package dnejad.marjan.customgooglesearch.Repository;

import android.util.Log;

import java.io.IOException;

import dnejad.marjan.customgooglesearch.Models.Result;
import dnejad.marjan.customgooglesearch.Server.ServiceGenerator;
import dnejad.marjan.customgooglesearch.Server.UrlFactory;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/**
 * Created by M.DN
 * On 09/01/2018
 *
 *
 * this class is for execute SearchingRepository interface
 * cause we use this interface in Search Class for each type of search
 */
public class SearchingRemoteRepository implements SearchingRepository {

    ServiceGenerator serviceGenerator;

    public SearchingRemoteRepository() {
        try {
            this.serviceGenerator = new ServiceGenerator();
        } catch (IOException e) {
            throw new NullPointerException("serviceGenerator object in SearchingRemoteRepository is null");
        }
    }

    @Override
    public Observable<Result> searching(String q, String equalSearch,
                                        String orText, int itemCount,
                                        String titleText, String urlText,
                                        String siteText,String siteFilter,
                                        String cutText, String incText) {
        Observable<Result> result;
        String url=UrlFactory.buildUrl(q,equalSearch,orText,itemCount,titleText,urlText,siteText,siteFilter,cutText,incText);
        try {
            result = serviceGenerator.getService().
                    searching(url);
        } catch (Exception e) {
            throw new RuntimeException("marjan we have an error it is : " + e.toString());
        }
        return result.flatMap(new Function<Result, ObservableSource<Result>>() {
            @Override
            public ObservableSource<Result> apply(Result result) throws Exception {
                return Observable.just(result);
            }
        });
    }

    @Override
    public Observable<Result> searching(String q, String equalText, String orText, int itemCount, String progLang, String siteText, String siteFilter) {
        Observable<Result> result;
        String url=UrlFactory.buildUrl(q,equalText,orText,itemCount,progLang,siteText,siteFilter);
        try{
            result =serviceGenerator.getService().searching(url);
        }catch (Exception e) {
            throw new RuntimeException("marjan we have an error it is : " + e.toString());
        }
        return result.flatMap(new Function<Result, ObservableSource<Result>>() {
            @Override
            public ObservableSource<Result> apply(Result result) throws Exception {
                return Observable.just(result);
            }
        });
    }


}