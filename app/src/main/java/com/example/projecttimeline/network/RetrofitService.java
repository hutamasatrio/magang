package com.example.projecttimeline.network;

import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {


    private static retrofit2.Retrofit retrofit;
    private static final String BASE_URL = "http://localhost/magang/timeline2/api/";

    public static retrofit2.Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
