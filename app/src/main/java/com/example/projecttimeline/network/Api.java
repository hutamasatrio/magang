package com.example.projecttimeline.network;

import com.example.projecttimeline.model.ResponseProject;
import com.example.projecttimeline.model.ResponseStaff;
import com.example.projecttimeline.model.ResponseTimeline;
import com.example.projecttimeline.model.ResponseTimelineAll;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {
    @GET("project")
    Call<ResponseProject> getData();

    @GET("timeline")
    Call<ResponseTimelineAll> getTimeline(@Query("idProject") Integer id);

    @GET("timeline")
    Call<ResponseTimeline> getDataTimeline();

    @GET("staff")
    Call<ResponseStaff> getStaff();


}
