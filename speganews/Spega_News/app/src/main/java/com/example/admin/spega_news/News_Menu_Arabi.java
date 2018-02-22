package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class News_Menu_Arabi extends AppCompatActivity {

    TextView home,world,uae,economy,sports,book,culture,cinema,eastwest,health,smartclinic,smarthealth,healthandhappy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu__arabi);
        getSupportActionBar().hide();
       // home=(TextView)findViewById(R.id.textView_home);
        world=(TextView)findViewById(R.id.textView_world);
        uae=(TextView)findViewById(R.id.textView_UAE);
        economy=(TextView)findViewById(R.id.textView_economy);
        sports=(TextView)findViewById(R.id.textView_Sports);
        book=(TextView)findViewById(R.id.textView_Books);
        culture=(TextView)findViewById(R.id.textView_culture);
        cinema=(TextView)findViewById(R.id.textView_cinema);
        eastwest=(TextView)findViewById(R.id.textView_eastwest);
        health=(TextView)findViewById(R.id.textView_health);
        smartclinic=(TextView)findViewById(R.id.textView_healthclinic);
        smarthealth=(TextView)findViewById(R.id.textView_healthsmart);
        healthandhappy=(TextView)findViewById(R.id.textView_healthhappines);
/*
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
/*
       DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width=dm.widthPixels;
        int height=dm.heightPixels;
        getWindow().setLayout((int)(width*.8), (int)(height));*/
        world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/arbi_sepcat.php?id=1&off=0";
                String head="اخبار العالم";
                Intent intent=new Intent(News_Menu_Arabi.this,News_FromArabi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        uae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/arbi_sepcat.php?id=2&off=0";
                String head="أخبار الإمارات";
                Intent intent=new Intent(News_Menu_Arabi.this,News_FromArabi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        economy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/arbi_sepcat.php?id=3&off=0";
                String head="الاقتصاد الأخبار";
                Intent intent=new Intent(News_Menu_Arabi.this,News_FromArabi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/arbi_sepcat.php?id=4&off=0";
                String head="الأخبار الرياضية";
                Intent intent=new Intent(News_Menu_Arabi.this,News_FromArabi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/arbi_sepcat.php?id=6&off=0";
                String head="الكتب";
                Intent intent=new Intent(News_Menu_Arabi.this,News_FromArabi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/arbi_sepcat.php?id=8&off=0";
                String head="حضاره";
                Intent intent=new Intent(News_Menu_Arabi.this,News_FromArabi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        cinema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/arbi_sepcat.php?id=9&off=0";
                String head="سينما";
                Intent intent=new Intent(News_Menu_Arabi.this,News_FromArabi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        eastwest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/arbi_sepcat.php?id=7&off=0";
                String head="شرق و غرب";
                Intent intent=new Intent(News_Menu_Arabi.this,News_FromArabi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/arbi_sepcat.php?id=5&off=0";
                String head="الصحة";
                Intent intent=new Intent(News_Menu_Arabi.this,News_FromArabi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        smartclinic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/arbi_sepcat.php?id=10&off=0";
                String head="العيادة الذكية";
                Intent intent=new Intent(News_Menu_Arabi.this,News_FromArabi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        smarthealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/arbi_sepcat.php?id=11&off=0";
                String head="الصحة الذكية";
                Intent intent=new Intent(News_Menu_Arabi.this,News_FromArabi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        healthandhappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/arbi_sepcat.php?id=12&off=0";
                String head="الصحة والسعادة";
                Intent intent=new Intent(News_Menu_Arabi.this,News_FromArabi.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
    }

}
