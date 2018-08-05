package com.example.android.tourguide.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.android.tourguide.MyListener;
import com.example.android.tourguide.R;
import com.example.android.tourguide.adapter.CategoryAdapter;
import com.example.android.tourguide.data.Location;

public class ExploreActivity extends AppCompatActivity implements MyListener {
    int selected = TourGuideActivity.LOCATION_ID;
    static final String IMAGE = "img";
    static final String DESCRPTION = "desc";
    static final String CATEGORY = "category";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        ViewPager viewPager = findViewById(R.id.viewpager);

        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }


    @Override
    public void clicked(int img, String description, String url) {
        Intent i = new Intent(ExploreActivity.this, EndingActivity.class);
        i.putExtra(TourGuideActivity.LOCATION_SELECTED, new Location(description, img, url));
        startActivity(i);
    }
}
