package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class News_Menu_China extends AppCompatActivity {

    TextView news,world,china,finance,technology,oversea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu__china);
        getSupportActionBar().hide();
        news=(TextView)findViewById(R.id.textView_latestnews);
        world=(TextView)findViewById(R.id.textView_world_china);
        china=(TextView)findViewById(R.id.textView_china);
        finance=(TextView)findViewById(R.id.textView_finance);
        technology=(TextView)findViewById(R.id.textView_Technology_china);
        oversea=(TextView)findViewById(R.id.textView_oversea);

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/china_sepcat.php?id=1&off=0";
                String head="最新消息";
                Intent intent=new Intent(News_Menu_China.this,News_FromChina.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/china_sepcat.php?id=2&off=0";
                String head="世界新闻";
                Intent intent=new Intent(News_Menu_China.this,News_FromChina.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        china.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/china_sepcat.php?id=3&off=0";
                String head="中国新闻";
                Intent intent=new Intent(News_Menu_China.this,News_FromChina.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/china_sepcat.php?id=4&off=0";
                String head="财务新闻";
                Intent intent=new Intent(News_Menu_China.this,News_FromChina.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        technology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/china_sepcat.php?id=5&off=0";
                String head="技术新闻";
                Intent intent=new Intent(News_Menu_China.this,News_FromChina.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        oversea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/china_sepcat.php?id=6&off=0";
                String head="海外";
                Intent intent=new Intent(News_Menu_China.this,News_FromChina.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
    }
}
