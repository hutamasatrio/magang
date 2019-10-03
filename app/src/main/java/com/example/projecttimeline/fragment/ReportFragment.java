package com.example.projecttimeline.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projecttimeline.R;
import com.example.projecttimeline.adapter.RVAdapterHome;
import com.example.projecttimeline.adapter.RVAdapterReport;
import com.example.projecttimeline.model.HomeDasboard;
import com.example.projecttimeline.model.Report;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReportFragment extends Fragment {


    public ReportFragment() {
        // Required empty public constructor
    }

    private List<Report> data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_report, container, false);

        data = new ArrayList<>();
        data.add(new Report("satrio budhi hutama","dasd","wfaw","wfw","fwaf"));
        data.add(new Report("hutama satrio budhi","dasd","wfaw","wfw","fwaf"));

        RecyclerView rvreport = (RecyclerView) view.findViewById(R.id.rvReport);
        RVAdapterReport mrvadapterreport = new RVAdapterReport(getActivity(), data);
        rvreport.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        rvreport.setAdapter(mrvadapterreport);

        return view;
    }

}
