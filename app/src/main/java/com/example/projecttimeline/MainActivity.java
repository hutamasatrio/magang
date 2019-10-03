package com.example.projecttimeline;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.example.projecttimeline.adapter.VPAdapter;
import com.example.projecttimeline.fragment.HomeFragment;
import com.example.projecttimeline.fragment.NotificationFragment;
import com.example.projecttimeline.fragment.ReportFragment;
import com.example.projecttimeline.fragment.UserFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private BottomNavigationView bottomNavigationView;

    HomeFragment home;
    ReportFragment report;
    NotificationFragment notif;
    UserFragment user;

    MenuItem prevMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.VPHome);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.btmNavView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.report:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.notif:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.user:
                        viewPager.setCurrentItem(3);
                        break;
                }
                return false;
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                } else {
                    bottomNavigationView.getMenu().getItem(0).setChecked(false);
                }
                Log.d("page", "onPageSelected: " + position);
                bottomNavigationView.getMenu().getItem(position).setChecked(true);
                prevMenuItem = bottomNavigationView.getMenu().getItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

       /*  //Disable ViewPager Swipe
       viewPager.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                return true;
            }
        });
        */

        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        VPAdapter adapter = new VPAdapter(getSupportFragmentManager());
        home = new HomeFragment();
        report = new ReportFragment();
        notif = new NotificationFragment();
        user = new UserFragment();
        adapter.addFragment(home);
        adapter.addFragment(report);
        adapter.addFragment(notif);
        adapter.addFragment(user);
        viewPager.setAdapter(adapter);
    }
}




