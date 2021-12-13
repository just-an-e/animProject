package com.example.animproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView rocketImage = findViewById(R.id.rocket);
        rocketImage.setBackgroundResource(R.drawable.rocket_anim);
        AnimationDrawable rocketAnimation = (AnimationDrawable) rocketImage.getBackground();

        rocketImage.setOnClickListener(view -> {
            if (rocketAnimation.isRunning()) {
                rocketAnimation.stop();
            }
            else {
                rocketAnimation.start();
            }
        });
    }
}