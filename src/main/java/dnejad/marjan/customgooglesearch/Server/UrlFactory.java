package dnejad.marjan.customgooglesearch.Server;

import android.util.Log;

import java.net.URLEncoder;

import dnejad.marjan.customgooglesearch.Models.Result;
import io.reactivex.Observable;

/**
 * Created by Marjan.DNejad
 * On 08/01/2018
 * <p>
 * <p>
 * this class is for static data that i get it from
 * <p>
 * https://console.cloud.google.com/home/dashboard?[Project in my account]
 * for key
 * <p>
 * https://cse.google.com/cse/all
 * for cx
 * <p>
 * <p>
 * and build url method that get needed arguments and build an url base of that's
 */
public class UrlFactory {
    private static final String baseUrl = "https://www.googleapis.com/customsearch/v1";
    private static final String cx = "your cx";
    private static final String key = "your search account key";


    public static String buildUrl(String keyword) throws Exception {
        return baseUrl + "?key=" + key + "&cx=" + cx + "&q=" + URLEncoder.encode(keyword);
    }

    public static String buildUrl(String keyword, int itemCount) {
        return baseUrl + "?key=" + key + "&cx=" + cx + "&q=" + URLEncoder.encode(keyword) + "&num=" + itemCount;
    }

    public static String buildUrl(String q, String equalText, String orText, int itemCount,
                                  String progLang, String siteText, String siteFilter) {
        String url = baseUrl + "?key=" + key + "&cx=" + cx +  "&num=" + itemCount;

        if (!equalText.isEmpty())
            url = url + "&exactTerms=" + equalText;
        if (!orText.isEmpty())
            url += "&orTerms=" + orText;
        if (!progLang.isEmpty())
            q += " in " + progLang;
        if (!siteText.isEmpty())
            url += "&siteSearch=" + siteText + "&siteSearchFilter=" + siteFilter;

        url += "&q=" + URLEncoder.encode(q) ;
        Log.e("MARJAN BUILED URL IS", url);

        return url;
    }

    public static String buildUrl(String q, String equalSearch,
                                  String orText, int itemCount,
                                  String titleText, String urlText,
                                  String siteText, String siteFilter,
                                  String cutText, String incText) {
        String url = baseUrl + "?key=" + key + "&cx=" + cx + "&q=" + URLEncoder.encode(q) + "&num=" + itemCount;
        if (!titleText.isEmpty())
            url += "&title=" + titleText;
        if (!urlText.isEmpty())
            url += "&linkSite=" + urlText;
        if (!equalSearch.isEmpty())
            url = url + "&exactTerms=" + equalSearch;
        if (!orText.isEmpty())
            url += "&orTerms=" + orText;
        if (!siteText.isEmpty()) {
            url += "&siteSearch=" + siteText + "&siteSearchFilter=" + siteFilter;
        }
        if (!cutText.isEmpty())
            url += "&excludeTerms=" + cutText;
        if (!incText.isEmpty())
            url += "&hq=" + incText;

        Log.e("MARJAN BUILED URL IS", url);
        return url;

//        return baseUrl + "?q="+q+ "&key=" + key +"&num="+itemCount + "&cx="+ cx +
//                "&hq="+incText+ "&siteSearch="+ siteText+ "&siteSearchFilter="+ siteFilter +
//                "&exactTerms=" + equalSearch +"&excludeTerms=" + cutText +"&orTerms="+
//                orText+ "&linkSite="+urlText+"&title="+titleText ;
    }
}
