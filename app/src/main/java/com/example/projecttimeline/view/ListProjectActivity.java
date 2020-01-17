package com.example.projecttimeline.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.projecttimeline.R;
import com.example.projecttimeline.adapter.RVAdapterListProject;
import com.example.projecttimeline.model.DataProject;
import com.example.projecttimeline.model.DataTimeline;
import com.example.projecttimeline.model.DataTimelineAll;
import com.example.projecttimeline.presenter.ListProjectPresenter;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public void timelineView(List<DataTimelineAll> timeline) {

    }


}
