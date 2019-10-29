package com.example.projecttimeline.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.projecttimeline.R;
import com.example.projecttimeline.adapter.RVAdapterListProject;
import com.example.projecttimeline.model.DataProject;
import com.example.projecttimeline.model.Project;
import com.example.projecttimeline.network.Api;
import com.example.projecttimeline.network.RetrofitService;
import com.example.projecttimeline.presenter.ListProjectPresenter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListProjectActivity extends AppCompatActivity implements DataView {

    private List<DataProject> data = new ArrayList<>();
    private RVAdapterListProject adapter;
    private RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_project);


        ListProjectPresenter listProjectPresenter = new ListProjectPresenter( this);
        listProjectPresenter.getdata();




//        init();
//        adapter();
        recyclerView = (RecyclerView) findViewById(R.id.RVListProject);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        adapter = new RVAdapterListProject(this);
        recyclerView.setAdapter(adapter);


    }


    @Override
    public void projectView(List<DataProject> project) {
        data.addAll(project);
        adapter.setdata(data);
        adapter.notifyDataSetChanged();
        for (DataProject cobaproject : project) {
            Log.i("RETROFIT", cobaproject.getIdProject() + "\n"
                    + " - Alpha4:  " + cobaproject.getNamaProject() + " \n"
                    + " - Alpha5: " + cobaproject.getTypeProject());
        }
    }


}
