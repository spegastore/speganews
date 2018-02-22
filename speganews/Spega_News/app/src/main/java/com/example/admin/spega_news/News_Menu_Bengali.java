package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class News_Menu_Bengali extends AppCompatActivity {

    TextView kolkata,state,nation,world,sports,entertainment,lifestyle,health,latest,technology;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu__bengali);
        getSupportActionBar().hide();

        kolkata = (TextView)findViewById(R.id.textView_kolkata);
        state = (TextView)findViewById(R.id.textView_state);
        nation = (TextView)findViewById(R.id.textView_nation);
        world = (TextView)findViewById(R.id.textView_World_);
        sports = (TextView)findViewById(R.id.textView_sport);
        entertainment=(TextView)findViewById(R.id.textView_enter);
        lifestyle =(TextView)findViewById(R.id.textView_life);
        health =(TextView)findViewById(R.id.textView_health_);
       // latest =(TextView)findViewById(R.id.textView_home);
        technology =(TextView)findViewById(R.id.textView_tech);

        kolkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/bengali_sepcat.php?id=1&off=0";
                String head="কলকাতা সংবাদ";
                Intent intent=new Intent(News_Menu_Bengali.this,News_FromBengali.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        state.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/bengali_sepcat.php?id=2&off=0";
                String head="রাজ্য সংবাদ";
                Intent intent=new Intent(News_Menu_Bengali.this,News_FromBengali.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        nation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/bengali_sepcat.php?id=3&off=0";
                String head= "জাতি সংবাদ";
                Intent intent=new Intent(News_Menu_Bengali.this,News_FromBengali.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });



        world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/bengali_sepcat.php?id=4&off=0";
                String head="বিশ্বের খবর";
                Intent intent=new Intent(News_Menu_Bengali.this,News_FromBengali.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/bengali_sepcat.php?id=5&off=0";
                String head="খেলার খবর";
                Intent intent=new Intent(News_Menu_Bengali.this,News_FromBengali.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/bengali_sepcat.php?id=6&off=0";
                String head="বিনোদনের খবর";
                Intent intent=new Intent(News_Menu_Bengali.this,News_FromBengali.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        lifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/bengali_sepcat.php?id=7&off=0";
                String head= "জীবনযাত্রার খবর";
                Intent intent=new Intent(News_Menu_Bengali.this,News_FromBengali.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });


        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/bengali_sepcat.php?id=8&off=0";
                String head="आरोग्य";
                Intent intent=new Intent(News_Menu_Bengali.this,News_FromBengali.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
     /*   latest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/bengali_sepcat.php?id=9&off=0";
                String head="সর্বশেষ সংবাদ";
                Intent intent=new Intent(News_Menu_Bengali.this,News_FromBengali.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });*/
        technology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/bengali_sepcat.php?id=10&off=0";
                String head="প্রযুক্তি সংবাদ";
                Intent intent=new Intent(News_Menu_Bengali.this,News_FromBengali.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });


    }
}
