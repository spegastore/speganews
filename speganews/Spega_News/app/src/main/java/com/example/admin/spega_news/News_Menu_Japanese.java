package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class News_Menu_Japanese extends AppCompatActivity {

    TextView toyama,ishikawa,fukui,nagano,shikuoko,shiga,mie,gifu,aichi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu_);
        getSupportActionBar().hide();
        toyama = (TextView)findViewById(R.id.textView_toyama_japan);
        ishikawa  = (TextView)findViewById(R.id.textView_ish_japan);
        fukui  = (TextView)findViewById(R.id.textView_fuki_japan);
        nagano = (TextView)findViewById(R.id.textView_nagano_japan);
        shikuoko  = (TextView)findViewById(R.id.textView_shikuok_japan);
        shiga = (TextView)findViewById(R.id.textView_shiga_japan);
        //mie  = (TextView)findViewById(R.id.textView_mie_japan);
        //gifu  = (TextView)findViewById(R.id.textView_gifu_japan);
       // aichi   = (TextView)findViewById(R.id.textView_aichi_japan);

        toyama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/japanese_sepcat.php?id=1&off=0";
                String head= "富山";
                Intent intent=new Intent(News_Menu_Japanese.this,News_FromJapanese.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        ishikawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/japanese_sepcat.php?id=2&off=0";
                String head= "石川";
                Intent intent=new Intent(News_Menu_Japanese.this,News_FromJapanese.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        fukui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/japanese_sepcat.php?id=3&off=0";
                String head= "福井";
                Intent intent=new Intent(News_Menu_Japanese.this,News_FromJapanese.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        nagano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/japanese_sepcat.php?id=4&off=0";
                String head= "永野";
                Intent intent=new Intent(News_Menu_Japanese.this,News_FromJapanese.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        shikuoko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/japanese_sepcat.php?id=5&off=0";
                String head= "シクオコ";
                Intent intent=new Intent(News_Menu_Japanese.this,News_FromJapanese.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        shiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/japanese_sepcat.php?id=6&off=0";
                String head= "滋賀県";
                Intent intent=new Intent(News_Menu_Japanese.this,News_FromJapanese.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
      /*  mie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/japanese_sepcat.php?id=7&off=0";
                String head= "三重";
                Intent intent=new Intent(News_Menu_Japanese.this,News_FromJapanese.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        gifu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/japanese_sepcat.php?id=8&off=0";
                String head= "岐阜";
                Intent intent=new Intent(News_Menu_Japanese.this,News_FromJapanese.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        aichi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/japanese_sepcat.php?id=9&off=0";
                String head= "愛知";
                Intent intent=new Intent(News_Menu_Japanese.this,News_FromJapanese.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });*/

    }
}
