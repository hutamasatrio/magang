package com.example.projecttimeline.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.projecttimeline.R;
import com.example.projecttimeline.adapter.TLAdapterTimeline;
import com.example.projecttimeline.view.timeline.DailyFragment;
import com.example.projecttimeline.view.timeline.MonthlyFragment;
import com.example.projecttimeline.view.timeline.WeeklyFragment;
import com.google.android.material.tabs.TabLayout;

public class TimeLineActivity extends AppCompatActivity {

    private TLAdapterTimeline adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_line);


        this.tabLayout = findViewById(R.id.tabLayout);
        this.viewPager = findViewById(R.id.VPTimeline);

        adapter = new TLAdapterTimeline (getSupportFragmentManager());
        adapter.addFragment(new DailyFragment(), "Daily");
        adapter.addFragment(new WeeklyFragment(), "Weekly");
        adapter.addFragment(new MonthlyFragment(), "Monthly");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

//        Fragment();
    }

//    private void Fragment() {
//
//        // Begin the transaction
//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//// Replace the contents of the container with the new fragment
//        ft.replace(R.id.VPTimeline, new DailyFragment());
//
//// or ft.add(R.id.your_placeholder, new FooFragment());
//
//// Complete the changes added above
//        ft.commit();
//    }
}
