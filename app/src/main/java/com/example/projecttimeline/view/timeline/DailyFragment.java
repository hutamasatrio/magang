package com.example.projecttimeline.view.timeline;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.projecttimeline.R;
import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.util.Date;
import java.util.EventListener;

/**
 * A simple {@link Fragment} subclass.
 */
public class DailyFragment extends Fragment {


    CompactCalendarView compactCalendar;

    public DailyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v = inflater.inflate(R.layout.fragment_daily, container, false);

        compactCalendar = v.findViewById(R.id.compactcalendar_view);
        compactCalendar.setUseThreeLetterAbbreviation(true);

        Init(v);
        Event();
        Listener();

        return v;

    }

    private void Init(View v) {
        compactCalendar = v.findViewById(R.id.compactcalendar_view);
        compactCalendar.setUseThreeLetterAbbreviation(true);
    }

    private void Event() {

        Event event = new Event(Color.RED,1571936400000L, "jdjsh" );
        compactCalendar.addEvent(event);
    }


    private void Listener() {
        compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                Context context = getActivity().getApplicationContext();

                if (dateClicked.toString().compareTo("Fri Oct 25 00:00:00 GMT+07:00 2019") == 0) {
                    Toast.makeText(context, dateClicked.toString(), Toast.LENGTH_SHORT).show();

                }else {

                    Toast.makeText(context, dateClicked.toString(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {

            }
        });
    }



}
