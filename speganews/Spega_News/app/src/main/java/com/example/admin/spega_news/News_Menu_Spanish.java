package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class News_Menu_Spanish extends AppCompatActivity {

    TextView politica, arbe,siria,locales,foto,video,deportes,provincias,finazas,cultura,education;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu__spanish);
        getSupportActionBar().hide();
        politica =(TextView)findViewById(R.id.textView_politica_spanish);
        arbe =(TextView)findViewById(R.id.textView_arbe_spanish);
        siria =(TextView)findViewById(R.id.textView_siriya_spanish);
        locales =(TextView)findViewById(R.id.textView_locales_spanish);
        foto =(TextView)findViewById(R.id.textView_foto_spanish);
        video =(TextView)findViewById(R.id.textView_video_spanish);
        deportes  =(TextView)findViewById(R.id.textView_deportes_spanish);
        provincias  =(TextView)findViewById(R.id.textView_provincias_spanish);
        finazas  =(TextView)findViewById(R.id.textView_negocios_spanish);
        cultura  =(TextView)findViewById(R.id.textView_arte_spanish);
        education  =(TextView)findViewById(R.id.textView_education_spanish);

        politica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/spanish_sepcat.php?id=1&off=0";
                String head="Local politica";
                Intent intent=new Intent(News_Menu_Spanish.this,News_FromSpanish.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        arbe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/spanish_sepcat.php?id=2&off=0";
                String head="Arbe international";
                Intent intent=new Intent(News_Menu_Spanish.this,News_FromSpanish.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        siria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/spanish_sepcat.php?id=3&off=0";
                String head="Siria yel mundo";
                Intent intent=new Intent(News_Menu_Spanish.this,News_FromSpanish.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        locales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/spanish_sepcat.php?id=4&off=0";
                String head="Locales";
                Intent intent=new Intent(News_Menu_Spanish.this,News_FromSpanish.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/spanish_sepcat.php?id=5&off=0";
                String head="Foto sana";
                Intent intent=new Intent(News_Menu_Spanish.this,News_FromSpanish.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/spanish_sepcat.php?id=6&off=0";
                String head="Video sana";
                Intent intent=new Intent(News_Menu_Spanish.this,News_FromSpanish.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        deportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/spanish_sepcat.php?id=7&off=0";
                String head="Deportes";
                Intent intent=new Intent(News_Menu_Spanish.this,News_FromSpanish.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        provincias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/spanish_sepcat.php?id=8&off=0";
                String head="Provincias";
                Intent intent=new Intent(News_Menu_Spanish.this,News_FromSpanish.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        finazas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/spanish_sepcat.php?id=9&off=0";
                String head="Negocias finazas";
                Intent intent=new Intent(News_Menu_Spanish.this,News_FromSpanish.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        cultura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/spanish_sepcat.php?id=10&off=0";
                String head="Arte Y cultura";
                Intent intent=new Intent(News_Menu_Spanish.this,News_FromSpanish.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/spanish_sepcat.php?id=11&off=0";
                String head="Education";
                Intent intent=new Intent(News_Menu_Spanish.this,News_FromSpanish.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
    }
}
