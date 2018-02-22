package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class News_Menu_Kannada extends AppCompatActivity {

    TextView nation,karnataka,kannadasports,cricket,science,business,movie,health,lifestyle,astrology,travel,agriculture,special;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu__kannada);
        getSupportActionBar().hide();

        nation =(TextView)findViewById(R.id.textView_nation_kannada);
        karnataka =(TextView)findViewById(R.id.textView_karntaka_kannada);
        kannadasports =(TextView)findViewById(R.id.textView_sports_kannada);
        cricket =(TextView)findViewById(R.id.textView_cricket_kannada);
        science =(TextView)findViewById(R.id.textView_science_kannada);
        business =(TextView)findViewById(R.id.textView_business_kannada);
        movie =(TextView)findViewById(R.id.textView_movie_kannada);
        health =(TextView)findViewById(R.id.textView_health_kannada);
        lifestyle =(TextView)findViewById(R.id.textView_lifestyle_kannada);
        astrology =(TextView)findViewById(R.id.textView_astrology_kannada);
        travel =(TextView)findViewById(R.id.textView_travel_kannada);
        agriculture =(TextView)findViewById(R.id.textView_agri_kannada);
        special =(TextView)findViewById(R.id.textView_special_kannada);

        nation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/kannada_sepcat.php?id=1&off=0";
                String head="ನೇಷನ್";
                Intent intent=new Intent(News_Menu_Kannada.this,News_FromKannada.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        karnataka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url2 ="http://speganews.com/api/kannada_sepcat.php?id=2&off=0";
                String head2="ಕರ್ನಾಟಕ";
                Intent intent=new Intent(News_Menu_Kannada.this,News_FromKannada.class);
                intent.putExtra("api",url2);
                intent.putExtra("title",head2);
                startActivity(intent);
            }
        });
        kannadasports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url8 ="http://speganews.com/api/kannada_sepcat.php?id=8&off=0";
                String head8="ಕ್ರೀಡೆ";
                Intent intent=new Intent(News_Menu_Kannada.this,News_FromKannada.class);
                intent.putExtra("api",url8);
                intent.putExtra("title",head8);
                startActivity(intent);
            }
        });
        cricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url12 ="http://speganews.com/api/kannada_sepcat.php?id=12&off=0";
                String head12="ಕ್ರಿಕೆಟ್";
                Intent intent=new Intent(News_Menu_Kannada.this,News_FromKannada.class);
                intent.putExtra("api",url12);
                intent.putExtra("title",head12);
                startActivity(intent);
            }
        });
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url20 ="http://speganews.com/api/kannada_sepcat.php?id=20&off=0";
                String head20="ವಿಜ್ಞಾನ";
                Intent intent=new Intent(News_Menu_Kannada.this,News_FromKannada.class);
                intent.putExtra("api",url20);
                intent.putExtra("title",head20);
                startActivity(intent);
            }
        });
        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url31 ="http://speganews.com/api/kannada_sepcat.php?id=31&off=0";
                String head31="ವ್ಯಾಪಾರ";
                Intent intent=new Intent(News_Menu_Kannada.this,News_FromKannada.class);
                intent.putExtra("api",url31);
                intent.putExtra("title",head31);
                startActivity(intent);
            }
        });
        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url59 ="http://speganews.com/api/kannada_sepcat.php?id=59&off=0";
                String head59="ಸಿನಿಮಾ";
                Intent intent=new Intent(News_Menu_Kannada.this,News_FromKannada.class);
                intent.putExtra("api",url59);
                intent.putExtra("title",head59);
                startActivity(intent);
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url62 ="http://speganews.com/api/kannada_sepcat.php?id=62&off=0";
                String head62="ಆರೋಗ್ಯ";
                Intent intent=new Intent(News_Menu_Kannada.this,News_FromKannada.class);
                intent.putExtra("api",url62);
                intent.putExtra("title",head62);
                startActivity(intent);
            }
        });
        lifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url63 ="http://speganews.com/api/kannada_sepcat.php?id=63&off=0";
                String head63="ಜೀವನ ಶೈಲಿ";
                Intent intent=new Intent(News_Menu_Kannada.this,News_FromKannada.class);
                intent.putExtra("api",url63);
                intent.putExtra("title",head63);
                startActivity(intent);
            }
        });
        astrology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url65 ="http://speganews.com/api/kannada_sepcat.php?id=65&off=0";
                String head65="ಜ್ಯೋತಿಷ್ಯ";
                Intent intent=new Intent(News_Menu_Kannada.this,News_FromKannada.class);
                intent.putExtra("api",url65);
                intent.putExtra("title",head65);
                startActivity(intent);
            }
        });
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url66 ="http://speganews.com/api/kannada_sepcat.php?id=66&off=0";
                String head66="ಪ್ರಯಾಣ ವಾಹನ";
                Intent intent=new Intent(News_Menu_Kannada.this,News_FromKannada.class);
                intent.putExtra("api",url66);
                intent.putExtra("title",head66);
                startActivity(intent);
            }
        });
        agriculture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url67 ="http://speganews.com/api/kannada_sepcat.php?id=67&off=0";
                String head67="ಕೃಷಿ ಪರಿಸರ";
                Intent intent=new Intent(News_Menu_Kannada.this,News_FromKannada.class);
                intent.putExtra("api",url67);
                intent.putExtra("title",head67);
                startActivity(intent);
            }
        });
        special.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url68 ="http://speganews.com/api/kannada_sepcat.php?id=68&off=0";
                String head68="ವಿಶೇಷ";
                Intent intent=new Intent(News_Menu_Kannada.this,News_FromKannada.class);
                intent.putExtra("api",url68);
                intent.putExtra("title",head68);
                startActivity(intent);
            }
        });






    }
}
