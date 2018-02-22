package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

public class News_Menu_Tamil extends AppCompatActivity {

    TextView tamil,world,business,india,sports,cinema;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu__tamil);
        getSupportActionBar().hide();

        DisplayMetrics dm= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

       getWindow().setLayout((int)(width*6),(int)(height*2));

        tamil=(TextView)findViewById(R.id.textView_tamil);
        india=(TextView)findViewById(R.id.textView_india_t);
        world=(TextView)findViewById(R.id.textView_World_t);
        business=(TextView)findViewById(R.id.textView_bus);
        sports=(TextView)findViewById(R.id.textView_sport_t);
     //   cinema=(TextView)findViewById(R.id.textView_cinema);

        tamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/tamil_sepcat.php?id=1&off=0";
                String head="தமிழ்நாடு";
                Intent intent=new Intent(News_Menu_Tamil.this,News_FromTamil.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });

        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/tamil_sepcat.php?id=2&off=0";
                String head="இந்திய செய்தி";
                Intent intent=new Intent(News_Menu_Tamil.this,News_FromTamil.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });

        world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/tamil_sepcat.php?id=3&off=0";
                String head="உலக செய்தி";
                Intent intent=new Intent(News_Menu_Tamil.this,News_FromTamil.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });

        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/tamil_sepcat.php?id=4&off=0";
                String head="உலக செய்தி";
                Intent intent=new Intent(News_Menu_Tamil.this,News_FromTamil.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/tamil_sepcat.php?id=5&off=0";
                String head="விளையாட்டு செய்திகள்";
                Intent intent=new Intent(News_Menu_Tamil.this,News_FromTamil.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
       /* cinema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/tamil_sepcat.php?id=6&off=0";
                String head="சினிமா";
                Intent intent=new Intent(News_Menu_Tamil.this,News_FromTamil.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });*/
    }
}
