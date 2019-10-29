package com.example.projecttimeline.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.projecttimeline.R;
import com.example.projecttimeline.adapter.RVAdapterHome;
import com.example.projecttimeline.adapter.RVAdapterListClient;
import com.example.projecttimeline.adapter.RVAdapterListProject;
import com.example.projecttimeline.model.Client;
import com.example.projecttimeline.model.DataProject;
import com.example.projecttimeline.model.Home;
import com.example.projecttimeline.model.Project;
import com.example.projecttimeline.network.Api;
import com.example.projecttimeline.network.Retrofit;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListProjectActivity extends AppCompatActivity {

    private List<Project> data;
    private RVAdapterListProject adapter;
    ProgressDialog progressDoalog;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_project);


//        data = new ArrayList<>();
//        data.add(new Project("satrio budhi hutama","","",""));
//        data.add(new Project("hutama satrio budhi","","",""));
//
//        RecyclerView rvproject = (RecyclerView) findViewById(R.id.RVListProject);
//        RVAdapterListProject mrvadapterproject = new RVAdapterListProject(this, data);
//        rvproject.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
//        rvproject.setAdapter(mrvadapterproject);


//        Data();

        Progressdialog();

        GetData();

        RecyclerView recyclerView = findViewById(R.id.RVListProject);
    }

    private void Progressdialog() {
        progressDoalog = new ProgressDialog(ListProjectActivity.this);
        progressDoalog.setMessage("Loading....");
        progressDoalog.show();
    }

    private void GetData() {
        Api service = Retrofit.getRetrofitInstance().create(Api.class);

        Call<List<DataProject>> call = service.getData();
        call.enqueue(new Callback<List<DataProject>>() {

            @Override
            public void onResponse(Call<List<DataProject>> call, Response<List<DataProject>> response) {
                progressDoalog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<DataProject>> call, Throwable t) {
                progressDoalog.dismiss();
                Toast.makeText(ListProjectActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateDataList(List<DataProject> listdata) {

        RVAdapterListProject mrvadapterproject = new RVAdapterListProject(this, listdata);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        recyclerView.setAdapter(mrvadapterproject);

//        adapter = new RVAdapterListProject(this,listdata);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ListProjectActivity.this);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(adapter);
    }



}
