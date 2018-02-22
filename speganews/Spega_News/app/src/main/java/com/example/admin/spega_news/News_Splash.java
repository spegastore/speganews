package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class News_Splash extends AppCompatActivity {
    long Delay=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__splash);
        getSupportActionBar().hide();
        Timer Runsplash=new Timer();
        TimerTask Showsplash= new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent intent = new Intent(getApplicationContext(),News_Select_Language.class);
                startActivity(intent);
            }
        };
        Runsplash.schedule(Showsplash,Delay);
    }
}
