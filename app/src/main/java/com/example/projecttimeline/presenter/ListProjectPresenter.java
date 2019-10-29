package com.example.projecttimeline.presenter;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.projecttimeline.model.DataProject;
import com.example.projecttimeline.model.ResponseProject;
import com.example.projecttimeline.network.RetrofitService;

import com.example.projecttimeline.view.DataView;
import com.example.projecttimeline.view.ListProjectActivity;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ListProjectPresenter {


    private DataView projectView;
    private RetrofitService projectService;

    public ListProjectPresenter (DataView view) {
        this.projectView = view;

        if (this.projectService == null) {
            this.projectService = new RetrofitService();
        }
    }

    public void getdata() {
        projectService
                .getAPI()
                .getData()
                .enqueue(new Callback<ResponseProject>() {
                    @Override
                    public void onResponse(Call<ResponseProject> call, Response<ResponseProject> response) {
                        ResponseProject data = response.body();

                        if (data != null && data.getData() != null) {
                            List<DataProject> result = data.getData();
                            projectView.projectView(result);
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseProject> call, Throwable t) {

                        Log.d("krlkjf","fefef");

                    }


                });
    }
}
