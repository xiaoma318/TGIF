package com.cm.dub;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Charlie on 4/16/19.
 */

public interface ApiService {
    @GET("person/{person_id}")
    Single<Person> getPersonData(@Path("person_id") int personId,
                                 @Query("api_key") String apiKey);

    @GET("gallery/search/time/1")
    Observable<ImageData> getImages(@Header("Authorization") String header,
                                    @Query("q") String searchQuery);
}
