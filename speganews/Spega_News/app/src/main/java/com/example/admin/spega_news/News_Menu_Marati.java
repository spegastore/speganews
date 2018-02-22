package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class News_Menu_Marati extends AppCompatActivity {

    TextView mumbai,world,maharastra,india,sports,entertainment,women,health,education,tech,spirit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu__marati);
        getSupportActionBar().hide();
        mumbai=(TextView)findViewById(R.id.textView_mumbai);
        maharastra=(TextView)findViewById(R.id.textView_maharastra);
        india=(TextView)findViewById(R.id.textView_india);
        world=(TextView)findViewById(R.id.textView_World_);
        sports=(TextView)findViewById(R.id.textView_sport);
        entertainment=(TextView)findViewById(R.id.textView_enter);
        women=(TextView)findViewById(R.id.textView_women);
        health=(TextView)findViewById(R.id.textView_health_);
        education=(TextView)findViewById(R.id.textView_edu);
        tech=(TextView)findViewById(R.id.textView_tech);
        spirit=(TextView)findViewById(R.id.textView_spirit);


        mumbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/marathi_sepcat.php?id=1&off=0";
                String head="मुंबई";
                Intent intent=new Intent(News_Menu_Marati.this,News_FromMarati.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        maharastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/marathi_sepcat.php?id=2&off=0";
                String head="महाराष्ट्र";
                Intent intent=new Intent(News_Menu_Marati.this,News_FromMarati.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        india.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/marathi_sepcat.php?id=3&off=0";
                String head="भारत";
                Intent intent=new Intent(News_Menu_Marati.this,News_FromMarati.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/marathi_sepcat.php?id=4&off=0";
                String head="विश्व समाचार";
                Intent intent=new Intent(News_Menu_Marati.this,News_FromMarati.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/marathi_sepcat.php?id=5&off=0";
                String head="क्रीडा बातम्या";
                Intent intent=new Intent(News_Menu_Marati.this,News_FromMarati.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/marathi_sepcat.php?id=6&off=0";
                String head="मनोरंजन";
                Intent intent=new Intent(News_Menu_Marati.this,News_FromMarati.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/marathi_sepcat.php?id=7&off=0";
                String head="आरोग्य";
                Intent intent=new Intent(News_Menu_Marati.this,News_FromMarati.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/marathi_sepcat.php?id=8&off=0";
                String head="महिला बातम्या";
                Intent intent=new Intent(News_Menu_Marati.this,News_FromMarati.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/marathi_sepcat.php?id=10&off=0";
                String head="शिक्षण";
                Intent intent=new Intent(News_Menu_Marati.this,News_FromMarati.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/marathi_sepcat.php?id=11&off=0";
                String head="तंत्रज्ञान";
                Intent intent=new Intent(News_Menu_Marati.this,News_FromMarati.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        spirit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/marathi_sepcat.php?id=12&off=0";
                String head="अध्यात्म";
                Intent intent=new Intent(News_Menu_Marati.this,News_FromMarati.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
    }
}
