package com.example.myapplication;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NetworkInterface {
    // @GET( EndPoint-자원위치(URI) )
    @GET("/default/test2")
    @Headers({"x-api-key: UqORjPGp5uacblhwUdL117r05fzlLa9B7TAU9tNi"})
    Call<DataModel3> test_2(
            @Query("id") String id,
            @Query("type") String type
    );


    @GET("/posts/{id}")
    Call<DataModel1> test_api_get(
            @Query("id") String id
    );

}