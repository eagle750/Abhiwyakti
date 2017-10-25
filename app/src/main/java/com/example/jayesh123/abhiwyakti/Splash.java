package com.example.jayesh123.abhiwyakti;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {


    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView t1=(ImageView)findViewById(R.id.i1);
        ImageView t2=(ImageView)findViewById(R.id.i2);
        Animation a1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
       Animation a2= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        t1.startAnimation(a1);
        t2.startAnimation(a2);
        new Handler().postDelayed(new Runnable()
        {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Splash.this,MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}
