package com.example.testivacc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testivacc.Activities.Login;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH=5000;
    //variables
    Animation top,bottom;
    ImageView image;
    TextView text;
    TextView motto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle(getResources().getString(R.string.app_name));
        top = AnimationUtils.loadAnimation(this, R.anim.top_animat);
        bottom = AnimationUtils.loadAnimation(this, R.anim.bottom_animat);
        image = findViewById(R.id.imageView);
        text = findViewById(R.id.tvsplash);
        motto = findViewById(R.id.tvmotto);


        image.setAnimation(top);
        text.setAnimation(bottom);
        motto.setAnimation(bottom);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreen.this, Login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH);
    }

}

