package com.example.projecttimeline.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.projecttimeline.R;
import com.example.projecttimeline.fragment.DailyFragment;
import com.example.projecttimeline.fragment.WeeklyFragment;

public class TimeLineActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_line);

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
