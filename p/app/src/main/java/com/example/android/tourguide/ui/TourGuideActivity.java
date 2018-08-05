package com.example.android.tourguide.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.android.tourguide.R;
import com.example.android.tourguide.data.Location;

public class TourGuideActivity extends AppCompatActivity implements TourGuideFragment.listener {
    public static final String LOCATION_SELECTED = "location";
    public static int LOCATION_ID;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_guide);

    }

    @Override
    public void clicked(int i) {
        Intent intent = new Intent(this, LocationDescriptionActivity.class);
        LOCATION_ID = i;
        switch (i) {
            case 0:
                intent.putExtra(LOCATION_SELECTED, new Location(getString(R.string.amsterdam), R.drawable.amsterdam, getString(R.string.amsterdam_coordinates), getString(R.string.about_amsterdam)));
                break;
            case 1:
                intent.putExtra(LOCATION_SELECTED, new Location(getString(R.string.barcelona), R.drawable.barcelona, getString(R.string.barcelona_coordinates), getString(R.string.about_barcelona)));
                break;
            case 2:
                intent.putExtra(LOCATION_SELECTED, new Location(getString(R.string.paris), R.drawable.paris, getString(R.string.paris_coordinates), getString(R.string.about_paris)));
                break;
            default:
                break;
        }
        startActivity(intent);
    }
}
