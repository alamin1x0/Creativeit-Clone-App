package com.example.it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SlapScreen extends AppCompatActivity {

    ImageView imagview;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slap_screen);

        imagview = findViewById(R.id.imagview);

        animation = AnimationUtils.loadAnimation(this,R.anim.animation);

        imagview.setAnimation(animation);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SlapScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }
}