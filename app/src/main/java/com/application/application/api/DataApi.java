package com.application.application.api;


import com.application.application.api.objects.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataApi {

    String END_POINT = "https://api.flickr.com/services/rest/";

    /**
     * https://api.flickr.com/services/rest/?
     * method=flickr.photos.search
     */
    @GET("?method=flickr.photos.search&" +
            "api_key=949e98778755d1982f537d56236bbb42&" +
            "text=shark&" +
            "format=json&" +
            "nojsoncallback=1" +
            "&extras=url_t,url_c,url_l,url_o,url_q")
    Call<ApiResponse> getSharkImages(
            @Query("page") int page
    );

    /**
     * https://api.flickr.com/services/rest/?
     * method=flickr.photos.search
     */
    @GET("?method=flickr.photos.getInfo&" +
            "api_key=949e98778755d1982f537d56236bbb42&" +
            "format=json&" +
            "nojsoncallback=1")
    Call<ApiResponse> getImageDetails(
            @Query("photo_id") String photoId
    );

}
