package com.example.projecttimeline;


import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    List<HomeDasboard> data ;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        // Inflate the layout for this fragment
        data = new ArrayList<>();
        data.add(new HomeDasboard("satrio budhi hutama","dasd","wfaw","wfw","fwaf","wfwa"));
        data.add(new HomeDasboard("hutama satrio budhi","dasd","wfaw","wfw","fwaf","wfwa"));

        RecyclerView rvhome = (RecyclerView) view.findViewById(R.id.rvHomeFrag);
        RVAdapterHome mrvadapterhome = new RVAdapterHome(getActivity(), data);
        rvhome.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        rvhome.setAdapter(mrvadapterhome);
        return view;
    }

}
