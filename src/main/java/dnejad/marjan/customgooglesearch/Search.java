package dnejad.marjan.customgooglesearch;

import android.support.annotation.MainThread;
import android.util.Log;

import dnejad.marjan.customgooglesearch.Models.Result;
import dnejad.marjan.customgooglesearch.Repository.SearchingRemoteRepository;
import dnejad.marjan.customgooglesearch.Repository.SearchingRepository;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.observers.DisposableLambdaObserver;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by M.DN
 * On 08/01/2018
 *
 *
 * this class is in whole access of project
 * that mean programmer can call all type of search with difference arguments
 * such as (q , itemCount , excludeTerm , includeTerm ,...)
 *
 */
public class Search {

    private SearchingInteractor interactor;
    private SearchingRepository remoteRepository;

    public Search(SearchingInteractor interactor)  {
        this.interactor = interactor;
        remoteRepository = new SearchingRemoteRepository();
    }

    public void doSearch(String q,String equalText,String orText,int itemCount,String progLang,
                         String siteText,String siteFilter){
        remoteRepository.searching(q,equalText,orText,itemCount,progLang,siteText,siteFilter)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new DisposableObserver<Result>() {
                    @Override
                    public void onNext(Result result) {
                        interactor.onSearchingComplete(result);
                    }

                    @Override
                    public void onError(Throwable e) {
                        interactor.onSearchError(e.toString());
                        Log.e("marjan ", e.toString());
                    }

                    @Override
                    public void onComplete() {
                        Log.e("marjan", "we have get result list complete");
                    }
                });
    }

    public void doSearch(String q, String equalSearch,
                         String orText, int itemCount,
                         String titleText, String urlText,
                         String siteText,String siteFilter,
                         String cutText, String incText){
        remoteRepository.searching(q,equalSearch,orText,itemCount,titleText,urlText,siteText,siteFilter,cutText,incText)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribeWith(new DisposableObserver<Result>() {
                    @Override
                    public void onNext(Result results) {
                        interactor.onSearchingComplete(results);
                    }

                    @Override
                    public void onError(Throwable e) {
                        interactor.onSearchError(e.toString());
                        Log.e("marjan ", e.toString());
                    }

                    @Override
                    public void onComplete() {
                        Log.e("marjan", "we have get result list complete");
                    }
                });
    }
}
