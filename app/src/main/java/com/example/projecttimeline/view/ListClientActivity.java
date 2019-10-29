package com.example.projecttimeline.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projecttimeline.R;
import com.example.projecttimeline.adapter.RVAdapterListClient;
import com.example.projecttimeline.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ListClientActivity extends AppCompatActivity {

    private List<Client> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_client);


        data = new ArrayList<>();
        data.add(new Client("satrio budhi hutama","","","",""));
        data.add(new Client("hutama satrio budhi","","","",""));

        RecyclerView rvclient = (RecyclerView) findViewById(R.id.RVListClient);
        RVAdapterListClient mrvadapterclient = new RVAdapterListClient(this, data);
        rvclient.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        rvclient.setAdapter(mrvadapterclient);

    }
}
