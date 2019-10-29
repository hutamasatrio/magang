package com.example.projecttimeline.network;

import com.example.projecttimeline.model.ResponseProject;


import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("project")
    Call<ResponseProject> getData();
}
