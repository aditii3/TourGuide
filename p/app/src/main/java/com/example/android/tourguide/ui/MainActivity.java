package com.example.android.tourguide.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.android.tourguide.R;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Animation fromTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.img_logo);
        fromTop = AnimationUtils.loadAnimation(this, R.anim.from_top);
        img.setAnimation(fromTop);
        fromTop.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(MainActivity.this, TourGuideActivity.class));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

}
