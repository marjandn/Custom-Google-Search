package dnejad.marjan.customgooglesearch.Server;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.io.IOException;

import okhttp3.OkHttpClient;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by M.DN
 * On 08/01/2018
 *
 *
 * this static class is for create service of each request to server
 */
public class ServiceGenerator {

    private static final String BASE_URL = "https://www.googleapis.com/customsearch/";
    TaskService taskService;

    public ServiceGenerator() throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .setLenient()
                .create();

        retrofit2.Retrofit retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build();

        taskService = retrofit.create(TaskService.class);
    }

    public TaskService getService() {
        return taskService;
    }
}
