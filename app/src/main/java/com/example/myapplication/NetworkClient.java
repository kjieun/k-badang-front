package com.example.myapplication;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkClient {
    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    private static final String SUB_URL = "https://6hmib39k54.execute-api.ap-northeast-2.amazonaws.com";


    public static NetworkInterface getApiService(){return getInstance().create(NetworkInterface.class);}

    private static Retrofit getInstance(){
        Gson gson = new GsonBuilder().setLenient().create();
        return new Retrofit.Builder()
                .baseUrl(SUB_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }
}