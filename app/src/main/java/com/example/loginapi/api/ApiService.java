package com.example.loginapi.api;

import com.example.loginapi.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    //Link Api: https://randomuser.me/api/

    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy--MM-dd HH:mm:ss")
            .create();
    ApiService apiService = new Retrofit.Builder()
            .baseUrl("https://randomuser.me/api")
            .build()
            .create(ApiService.class);
    @GET("/")
    Call<List<User>> getListUsers();
}
