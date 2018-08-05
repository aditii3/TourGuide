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

public class EndingActivity extends AppCompatActivity {
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        ImageView img = findViewById(R.id.img);
        TextView tv = findViewById(R.id.tv_desc);
        Button b = findViewById(R.id.btn_open_map);
        if (savedInstanceState == null) {
            bundle = getIntent().getExtras();
        }
        final Location l = (Location) bundle.getParcelable(TourGuideActivity.LOCATION_SELECTED);
        img.setImageResource(l.getPlaceImage());
        tv.setText(l.getPlaceName());
        b.setOnClickListener(new View.OnClickListener() {
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
                        Toast.makeText(EndingActivity.this, getString(R.string.check_connection), Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(bundle);
    }
}
