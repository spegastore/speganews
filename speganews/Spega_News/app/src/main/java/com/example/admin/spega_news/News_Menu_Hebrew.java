package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class News_Menu_Hebrew extends AppCompatActivity {

    TextView picture,morenews,business,local,syria,news,politics,dinosana,culture,sports,health;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu__hebrew);
        getSupportActionBar().hide();

        picture =(TextView)findViewById(R.id.textView_picture_hebrew);
        morenews =(TextView)findViewById(R.id.textView_morenews_hebrew);
        business =(TextView)findViewById(R.id.textView_Economie_hebrew);
        local =(TextView)findViewById(R.id.textView_localnews_hebrew);
        syria =(TextView)findViewById(R.id.textView_syria_hebrew);
        politics =(TextView)findViewById(R.id.textView_Politique);
        dinosana =(TextView)findViewById(R.id.textView_dino_hebrew);
        culture =(TextView)findViewById(R.id.textView_culture_hebrew);
        sports =(TextView)findViewById(R.id.textView_sport_hebrew);
        health =(TextView)findViewById(R.id.textView_health_hebrew);
        news =( TextView)findViewById(R.id.textView_news_hebrew);

        picture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hebrew_sepcat.php?id=1&off=0";
                String head="תמונות של סאנה";
                Intent intent=new Intent(News_Menu_Hebrew.this,News_FromHebrew.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        morenews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hebrew_sepcat.php?id=2&off=0";
                String head="עוד חדשות";
                Intent intent=new Intent(News_Menu_Hebrew.this,News_FromHebrew.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hebrew_sepcat.php?id=3&off=0";
                String head="עסקים וכלכלה";
                Intent intent=new Intent(News_Menu_Hebrew.this,News_FromHebrew.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hebrew_sepcat.php?id=4&off=0";
                String head="חדשות מקומיות";
                Intent intent=new Intent(News_Menu_Hebrew.this,News_FromHebrew.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        syria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hebrew_sepcat.php?id=5&off=0";
                String head="סוריה והעולם";
                Intent intent=new Intent(News_Menu_Hebrew.this,News_FromHebrew.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hebrew_sepcat.php?id=6&off=0";
                String head="חֲדָשׁוֹת";
                Intent intent=new Intent(News_Menu_Hebrew.this,News_FromHebrew.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        politics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hebrew_sepcat.php?id=7&off=0";
                String head="פּוֹלִיטִי";
                Intent intent=new Intent(News_Menu_Hebrew.this,News_FromHebrew.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        dinosana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hebrew_sepcat.php?id=8&off=0";
                String head="דינוזאנה";
                Intent intent=new Intent(News_Menu_Hebrew.this,News_FromHebrew.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hebrew_sepcat.php?id=9&off=0";
                String head="תַרְבּוּת";
                Intent intent=new Intent(News_Menu_Hebrew.this,News_FromHebrew.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hebrew_sepcat.php?id=10&off=0";
                String head="ספורט";
                Intent intent=new Intent(News_Menu_Hebrew.this,News_FromHebrew.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/hebrew_sepcat.php?id=11&off=0";
                String head="בְּרִיאוּת";
                Intent intent=new Intent(News_Menu_Hebrew.this,News_FromHebrew.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });



    }
    }

