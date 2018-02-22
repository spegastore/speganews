package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class News_Menu_Hindi extends AppCompatActivity {

    TextView country,world,region,business,sports,bollywood,techno,science,spcl,astro,health;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu__hindi);
        getSupportActionBar().hide();
        country=(TextView)findViewById(R.id.textView_cntry);
        world=(TextView)findViewById(R.id.textView_World_hindi);
        region=(TextView)findViewById(R.id.textView_region);
        business=(TextView)findViewById(R.id.textView_business);
        sports=(TextView)findViewById(R.id.textView_sport_hindi);
        bollywood=(TextView)findViewById(R.id.textView_bollywood);
        techno=(TextView)findViewById(R.id.textView_techno);
        science=(TextView)findViewById(R.id.textView_Science);
        spcl=(TextView)findViewById(R.id.textView_spcl);
        astro=(TextView)findViewById(R.id.textView_astro);
        health=(TextView)findViewById(R.id.textView_health_hindi);


        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hindi_sepcat.php?id=1&off=0";
                String head="देश समाचार";
                Intent intent=new Intent(News_Menu_Hindi.this,News_FromHindi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });

        region.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hindi_sepcat.php?id=2&off=0";
                String head="क्षेत्र  समाचार";
                Intent intent=new Intent(News_Menu_Hindi.this,News_FromHindi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });

        world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hindi_sepcat.php?id=3&off=0";
                String head="विश्व  समाचार";
                Intent intent=new Intent(News_Menu_Hindi.this,News_FromHindi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });

        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hindi_sepcat.php?id=4&off=0";
                String head="खेल समाचार";
                Intent intent=new Intent(News_Menu_Hindi.this,News_FromHindi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hindi_sepcat.php?id=5&off=0";
                String head="व्यापार समाचार";
                Intent intent=new Intent(News_Menu_Hindi.this,News_FromHindi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        bollywood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hindi_sepcat.php?id=6&off=0";
                String head="बॉलीवुड समाचार";
                Intent intent=new Intent(News_Menu_Hindi.this,News_FromHindi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });

        techno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hindi_sepcat.php?id=7&off=0";
                String head="प्रौद्योगिकी";
                Intent intent=new Intent(News_Menu_Hindi.this,News_FromHindi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hindi_sepcat.php?id=8&off=0";
                String head="विज्ञान";
                Intent intent=new Intent(News_Menu_Hindi.this,News_FromHindi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hindi_sepcat.php?id=9&off=0";
                String head="स्वास्थ्य";
                Intent intent=new Intent(News_Menu_Hindi.this,News_FromHindi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        spcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hindi_sepcat.php?id=10&off=0";
                String head="विशेष";
                Intent intent=new Intent(News_Menu_Hindi.this,News_FromHindi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        astro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hindi_sepcat.php?id=11&off=0";
                String head="ज्योतिष";
                Intent intent=new Intent(News_Menu_Hindi.this,News_FromHindi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
    }
}
