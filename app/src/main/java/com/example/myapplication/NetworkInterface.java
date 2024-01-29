package com.example.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NetworkInterface {

    // @GET( EndPoint-자원위치(URI) )
    @GET("posts/{post}")
    Call<DataModel1> test_api_get(@Path("post") String id);

}