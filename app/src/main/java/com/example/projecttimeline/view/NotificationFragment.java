package com.example.projecttimeline.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projecttimeline.R;
import com.example.projecttimeline.adapter.RVAdapterNotif;
import com.example.projecttimeline.model.Notification;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {

    private List<Notification> data;
    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notification, container, false);



        // Inflate the layout for this fragment
        data = new ArrayList<>();
        data.add(new Notification("satrio budhi hutama","dasd","wfaw"));
        data.add(new Notification("hutama satrio budhi","dasd","wfaw"));

        RecyclerView rvnotif = (RecyclerView) view.findViewById(R.id.rvNotif);
        RVAdapterNotif mrvadapternotif= new RVAdapterNotif(getActivity(), data);
        rvnotif.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        rvnotif.setAdapter(mrvadapternotif);




        return view;
    }

}
