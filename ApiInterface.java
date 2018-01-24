package saiinfotech.network;

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Harish Penta on 21-8-2017.
 */
public interface ApiInterface {

    //Get Base Url
    @POST("Api/getSMSList")
    Observable<String> sendSmsListToServer(@Query("status") int status, @Query("data") String version);
}
