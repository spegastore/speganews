package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class News_Menu_Telungu extends AppCompatActivity {

    TextView national,world,andra,telengana,sports;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu__telungu);
        getSupportActionBar().hide();
        national=(TextView)findViewById(R.id.textView_national);
        andra=(TextView)findViewById(R.id.textView_andra_t);
        world=(TextView)findViewById(R.id.textView_World_te);
        telengana=(TextView)findViewById(R.id.textView_telengana);
        sports=(TextView)findViewById(R.id.textView_sport_te);

        national.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/tamil_sepcat.php?id=2&off=0";
                String head="జాతీయ వార్తలు";
                Intent intent=new Intent(News_Menu_Telungu.this,News_FromTelungu.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });

        andra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/tamil_sepcat.php?id=3&off=0";
                String head="ఆంధ్ర వార్తలు";
                Intent intent=new Intent(News_Menu_Telungu.this,News_FromTelungu.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });

        world.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/tamil_sepcat.php?id=1&off=0";
                String head="ప్రపంచ వార్తలు";
                Intent intent=new Intent(News_Menu_Telungu.this,News_FromTelungu.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });


        telengana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/tamil_sepcat.php?id=4&off=0";
                String head="తెలంగాణ వార్తలు";
                Intent intent=new Intent(News_Menu_Telungu.this,News_FromTelungu.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });

        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/tamil_sepcat.php?id=5&off=0";
                String head="క్రీడా వార్తలు";
                Intent intent=new Intent(News_Menu_Telungu.this,News_FromTelungu.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
    }
}
