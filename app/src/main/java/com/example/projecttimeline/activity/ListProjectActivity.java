package com.example.projecttimeline.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projecttimeline.R;
import com.example.projecttimeline.adapter.RVAdapterListClient;
import com.example.projecttimeline.adapter.RVAdapterListProject;
import com.example.projecttimeline.model.Client;
import com.example.projecttimeline.model.Project;

import java.util.ArrayList;
import java.util.List;

public class ListProjectActivity extends AppCompatActivity {

    private List<Project> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_project);


        data = new ArrayList<>();
        data.add(new Project("satrio budhi hutama","","","",""));
        data.add(new Project("hutama satrio budhi","","","",""));

        RecyclerView rvproject = (RecyclerView) findViewById(R.id.RVListProject);
        RVAdapterListProject mrvadapterproject = new RVAdapterListProject(this, data);
        rvproject.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        rvproject.setAdapter(mrvadapterproject);
    }
}
