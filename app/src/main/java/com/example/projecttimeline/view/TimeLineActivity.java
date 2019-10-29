package com.example.projecttimeline.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.projecttimeline.R;
import com.google.android.material.tabs.TabLayout;

public class TimeLineActivity extends AppCompatActivity {

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_line);


        this.tabLayout = findViewById(R.id.tabLayout);

        tabLayout.addTab(tabLayout.newTab().setText("First"));
        tabLayout.addTab(tabLayout.newTab().setText("Second"));
        tabLayout.addTab(tabLayout.newTab().setText("Third"));
       Fragment();
    }

    private void Fragment() {

        // Begin the transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
// Replace the contents of the container with the new fragment
        ft.replace(R.id.frameTimeLine, new DailyFragment());

// or ft.add(R.id.your_placeholder, new FooFragment());

// Complete the changes added above
        ft.commit();
    }
}
