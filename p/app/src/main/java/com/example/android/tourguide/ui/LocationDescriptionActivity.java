package com.example.android.tourguide.ui;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.tourguide.R;
import com.example.android.tourguide.data.Location;

public class LocationDescriptionActivity extends AppCompatActivity {
    TextView name;
    TextView description;
    ImageView img;
    Button button;
    Intent intent;
    Bundle b;
    Button showMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_description);
        name = findViewById(R.id.tv_location_selected_heading);
        description = findViewById(R.id.tv_location_selected_description);
        img = findViewById(R.id.location_selected_image);
        showMap = findViewById(R.id.btn_show_map);
        button = findViewById(R.id.btn_explore);
        if (savedInstanceState == null) {
            b = getIntent().getExtras();
        }
        final Location l = (Location) b.getParcelable(TourGuideActivity.LOCATION_SELECTED);
        name.setText(l.getPlaceName());
        img.setImageResource(l.getPlaceImage());
        description.setText(l.getDescription());
        intent = new Intent(LocationDescriptionActivity.this, ExploreActivity.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);

            }
        });
        showMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(l.getUrl());
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(uri);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

                    if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                            connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
                        startActivity(intent);
                    } else {
                        Toast.makeText(LocationDescriptionActivity.this, getString(R.string.check_connection), Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(b);
    }
}
