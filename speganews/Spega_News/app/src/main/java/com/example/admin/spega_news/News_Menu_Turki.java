package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class News_Menu_Turki extends AppCompatActivity {

    TextView local,world,syria,culture,sana,spor,society,life,press,economics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu__turki);
        getSupportActionBar().hide();
        local =(TextView)findViewById(R.id.textView_local_turki);
        world =(TextView)findViewById(R.id.textView_world_turki);
        syria =(TextView)findViewById(R.id.textView_syria_turki);
        culture =(TextView)findViewById(R.id.textView_culture_turki);
        sana =(TextView)findViewById(R.id.textView_sana_turki);
        spor =(TextView)findViewById(R.id.textView_sport_turki);
        society =(TextView)findViewById(R.id.textView_society_turki);
        life =(TextView)findViewById(R.id.textView_life_turki);
        press =(TextView)findViewById(R.id.textView_press_turki);
        economics =(TextView)findViewById(R.id.textView_economics_turki);

        local.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/turki_sepcat.php?id=1&off=0";
                String head="Yerel";
                Intent intent=new Intent(News_Menu_Turki.this,News_FromTurki.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/turki_sepcat.php?id=2&off=0";
                String head="Dünya";
                Intent intent=new Intent(News_Menu_Turki.this,News_FromTurki.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        syria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/turki_sepcat.php?id=3&off=0";
                String head="Suriye ve türkiye";
                Intent intent=new Intent(News_Menu_Turki.this,News_FromTurki.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/turki_sepcat.php?id=4&off=0";
                String head="Kültür ve sanat";
                Intent intent=new Intent(News_Menu_Turki.this,News_FromTurki.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        sana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/turki_sepcat.php?id=5&off=0";
                String head="Sana photos";
                Intent intent=new Intent(News_Menu_Turki.this,News_FromTurki.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        spor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/turki_sepcat.php?id=6&off=0";
                String head="Spor";
                Intent intent=new Intent(News_Menu_Turki.this,News_FromTurki.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        society.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/turki_sepcat.php?id=7&off=0";
                String head="Toplum";
                Intent intent=new Intent(News_Menu_Turki.this,News_FromTurki.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        life.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/turki_sepcat.php?id=8&off=0";
                String head="hayat";
                Intent intent=new Intent(News_Menu_Turki.this,News_FromTurki.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/turki_sepcat.php?id=9&off=0";
                String head="Basın";
                Intent intent=new Intent(News_Menu_Turki.this,News_FromTurki.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        economics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/turki_sepcat.php?id=10&off=0";
                String head="Ekonomi bilimi";
                Intent intent=new Intent(News_Menu_Turki.this,News_FromTurki.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
    }
}

