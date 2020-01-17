package com.example.projecttimeline.view.timeline;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projecttimeline.R;
import com.example.projecttimeline.model.DataProject;
import com.example.projecttimeline.model.DataTimeline;
import com.example.projecttimeline.model.DataTimelineAll;
import com.example.projecttimeline.presenter.ListProjectPresenter;
import com.example.projecttimeline.presenter.TimelinePresenter;
import com.example.projecttimeline.view.DataView;
import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class OnlyTimelineActivity extends AppCompatActivity implements DataViewTimeline {
    private Toolbar toolbar;

    private static final String TAG = "MainActivity";
    private CompactCalendarView compactCalendar;
    private List<DataTimeline> data1 = new ArrayList<>();

    private SimpleDateFormat dateFormatForMonth = new SimpleDateFormat("MMM - yyyy", Locale.getDefault());
    private TimelinePresenter timelinePresenter;
    private SimpleDateFormat dateFormatForDisplaying = new SimpleDateFormat("dd-M-yyyy hh:mm:ss a", Locale.getDefault());
    private SimpleDateFormat dateFormatForDay = new SimpleDateFormat("dd", Locale.getDefault());
    final List<String> mutableBookings = new ArrayList<>();

    private ArrayAdapter adapter;
    private ListView bookingsListView;
    private Calendar currentCalender = Calendar.getInstance(Locale.getDefault());
    private ImageView addTimeline;
//    private DialogInputData showdialog;
    TextView tvTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_only_timeline);


        TimelinePresenter timelinePresenter = new TimelinePresenter(this);
        timelinePresenter.getdata();

        Intent intent = getIntent();
        Bundle b = intent.getExtras();


        if (b != null) {
            String idString = (String) b.get("id");
            Integer id = Integer.parseInt(idString);
            Toast.makeText(this, id.toString() , Toast.LENGTH_SHORT).show();

            timelinePresenter = new TimelinePresenter(this);
            timelinePresenter.setid(id);

        }
        Init();
        Listener();


    }

    private void Init() {
        toolbar =  (Toolbar)findViewById(R.id.toolbar);
        addTimeline = (ImageView) findViewById(R.id.addtimeline);
        tvTask = (TextView) findViewById(R.id.TVtask);
        compactCalendar = findViewById(R.id.compactcalendar_view);
        compactCalendar.setUseThreeLetterAbbreviation(true);
        bookingsListView = findViewById(R.id.bookings_listview);

        adapter = new ArrayAdapter<>(OnlyTimelineActivity.this, android.R.layout.simple_list_item_1, mutableBookings);
        bookingsListView.setAdapter(adapter);
    }


    private void Listener() {
        compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {
                toolbar.setTitle(dateFormatForMonth.format(dateClicked));
                List<Event> bookingsFromMap = compactCalendar.getEvents(dateClicked);
                Log.d(TAG, "inside onclick " + dateFormatForDisplaying.format(dateClicked));

                String dayString = dateFormatForDay.format(dateClicked);
                Integer day = Integer.parseInt(dayString);
                currentCalender.setTime(new Date());
                currentCalender.set(Calendar.DAY_OF_MONTH, day);



                long timeInMillis = currentCalender.getTimeInMillis();
                String strLong = Long.toString(timeInMillis);
                Toast.makeText(OnlyTimelineActivity.this,strLong,Toast.LENGTH_SHORT).show();

                if (bookingsFromMap != null) {
                    Log.d(TAG, bookingsFromMap.toString());
                    mutableBookings.clear();
                    for (Event booking : bookingsFromMap) {
                        mutableBookings.add((String) booking.getData());
                    }
                    adapter.notifyDataSetChanged();
                }


            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                toolbar.setTitle(dateFormatForMonth.format(firstDayOfNewMonth));
            }
        });

        addTimeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                dialog(OnlyTimelineActivity.this, tvTask);
            }
        });
    }
//    private void dialog(OnlyTimelineActivity activity, TextView input){
//        showdialog = new DialogInputData(activity, input);
//        showdialog.build();
//
//    }


    @Override
    public void timelineView(List<DataTimelineAll> timeline) {
        compactCalendar = findViewById(R.id.compactcalendar_view);
        compactCalendar.setUseThreeLetterAbbreviation(true);


        currentCalender.setTime(new Date());
        currentCalender.set(Calendar.DAY_OF_MONTH, 3);
        Date firstDayOfMonth = currentCalender.getTime();

        for (DataTimelineAll dataTimelineAll : timeline)
        {
            int i = (int) Long.parseLong(dataTimelineAll.getColor(), 16);

            long timeInMillis = currentCalender.getTimeInMillis();
            Event event = new Event(i,dataTimelineAll.getDateTimeline(),dataTimelineAll.getKeterangan());
            compactCalendar.addEvent(event);


        }


        for (DataTimelineAll cobaproject : timeline) {
           Toast.makeText(this,cobaproject.getColor() + cobaproject.getDateTimeline()  + cobaproject.getKeterangan(),Toast.LENGTH_SHORT).show();

        }
    }
}
