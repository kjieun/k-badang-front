package com.example.myapplication;

import static com.example.myapplication.Utils.getAssetJsonData;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface NetworkInterface {
    // @GET( EndPoint-자원위치(URI) )
    @GET("/default/test2")
    @Headers({""})
    Call<DataModel3> test_2(
            @Query("id") String id,
            @Query("type") String type
    );
    @GET("/default/test2")
    @Headers({""})
    Call<List<DataModelNews>> test_3(
            @Query("id") String id,
            @Query("type") String type
    );

    @GET("/default/test2")
    @Headers({""})
    Call<DataModelNews> test_4(
            @Query("id") String id,
            @Query("type") String type
    );

    @GET("/posts/{id}")
    Call<DataModel1> test_api_get(
            @Query("id") String id
    );

}