package com.example.VideoProject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Find the view pager that will allow the user to swipe between fragment
        ViewPager samplePager = findViewById(R.id.viewPager);

        //  Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter sampleAdapter = new CategoryAdapter(getSupportFragmentManager());

        //  Set the adapter onto the view pager
        samplePager.setAdapter(sampleAdapter);

        //  Find the tab layout that shows the tabs
        TabLayout sampleLayout = findViewById(R.id.tabs);

        //  Connect the tab layout with the view pager. This will
        //  1. Update the tab layout when the view pager is swiped
        //  2. Update the view pager when a tab is selected
        //  3. Set the tab layout's tab names with the view pager's adapter
        //  by calling on PageTitle()
        sampleLayout.setupWithViewPager(samplePager);
    }
}
