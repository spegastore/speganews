package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class News_Menu_Russia extends AppCompatActivity {

    TextView locals,middle,sytia,section,art,provinces,printing,sport,capital,health,education,miscellaneous,tourism;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu__russia);
        getSupportActionBar().hide();
        locals =(TextView)findViewById(R.id.textView_local_russia);
        middle =(TextView)findViewById(R.id.textView_middle_russia);
        sytia =(TextView)findViewById(R.id.textView_siriya_russia);
        section =(TextView)findViewById(R.id.textView_section_russia);
        art =(TextView)findViewById(R.id.textView_art_russia);
        provinces =(TextView)findViewById(R.id.textView_provinces_russia);
        printing =(TextView)findViewById(R.id.textView_printing_russia);
        sport =(TextView)findViewById(R.id.textView_sport_russia);
        capital =(TextView)findViewById(R.id.textView_capital_russia);
        health =(TextView)findViewById(R.id.textView_health_russia);
        education =(TextView)findViewById(R.id.textView_education_russia);
        miscellaneous =(TextView)findViewById(R.id.textView_mis_russia);
        tourism =(TextView)findViewById(R.id.textView_toursim_russia);

        locals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/russia_sepcat.php?id=1&off=0";
                String head="Местный";
                Intent intent=new Intent(News_Menu_Russia.this,News_FromRussia.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/russia_sepcat.php?id=2&off=0";
                String head="Средний Восток";
                Intent intent=new Intent(News_Menu_Russia.this,News_FromRussia.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        sytia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/russia_sepcat.php?id=3&off=0";
                String head="Сирия и мир";
                Intent intent=new Intent(News_Menu_Russia.this,News_FromRussia.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        section.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/russia_sepcat.php?id=4&off=0";
                String head="Местный раздел";
                Intent intent=new Intent(News_Menu_Russia.this,News_FromRussia.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/russia_sepcat.php?id=5&off=0";
                String head="Культура и искусство";
                Intent intent=new Intent(News_Menu_Russia.this,News_FromRussia.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        provinces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/russia_sepcat.php?id=6&off=0";
                String head="провинция";
                Intent intent=new Intent(News_Menu_Russia.this,News_FromRussia.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        printing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/russia_sepcat.php?id=7&off=0";
                String head="печать";
                Intent intent=new Intent(News_Menu_Russia.this,News_FromRussia.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/russia_sepcat.php?id=8&off=0";
                String head="спорт";
                Intent intent=new Intent(News_Menu_Russia.this,News_FromRussia.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        capital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/russia_sepcat.php?id=9&off=0";
                String head="Капитал и бизнес";
                Intent intent=new Intent(News_Menu_Russia.this,News_FromRussia.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/russia_sepcat.php?id=10&off=0";
                String head="Здоровье и экология";
                Intent intent=new Intent(News_Menu_Russia.this,News_FromRussia.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/russia_sepcat.php?id=11&off=0";
                String head="образование";
                Intent intent=new Intent(News_Menu_Russia.this,News_FromRussia.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        miscellaneous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/russia_sepcat.php?id=12&off=0";
                String head="Разное";
                Intent intent=new Intent(News_Menu_Russia.this,News_FromRussia.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        tourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/russia_sepcat.php?id=13&off=0";
                String head="Туризм и общество";
                Intent intent=new Intent(News_Menu_Russia.this,News_FromRussia.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
    }
}
