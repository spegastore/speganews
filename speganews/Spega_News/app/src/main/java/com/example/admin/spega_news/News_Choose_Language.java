package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class News_Choose_Language extends AppCompatActivity {

    TextView hindi,arabi,china,malayalam,tamil,telungu,marati,french,bengali,english,hebrew,japan,russia,spanish,turki,kannada;
    ImageView icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__choose__language);
        getSupportActionBar().hide();
        icon=(ImageView)findViewById(R.id.new_right_menu);
        hindi = (TextView)findViewById(R.id.textview_lng_hindi);
        arabi =(TextView)findViewById(R.id.textview_lng_arabic);
        china =(TextView)findViewById(R.id.textview_lng_chinese);
        malayalam =(TextView)findViewById(R.id.textview_lng_malayalam);
        tamil =(TextView)findViewById(R.id.textview_lng_tamil);
       telungu =(TextView)findViewById(R.id.textview_lng_telugu);
        marati =(TextView)findViewById(R.id.textview_lng_marati);
        french =(TextView)findViewById(R.id.textview_lng_french);
        bengali =(TextView)findViewById(R.id.textview_lng_bengali);
        english =(TextView)findViewById(R.id.textview_lng_english);
        hebrew =(TextView)findViewById(R.id.textview_lng_hebrew);
        kannada =(TextView)findViewById(R.id.textview_lng_kannada);
        russia =(TextView)findViewById(R.id.textview_lng_russian);
        spanish =(TextView)findViewById(R.id.textview_lng_spanish);
        turki =(TextView)findViewById(R.id.textview_lng_turkish);
        japan =(TextView)findViewById(R.id.textview_lng_japanese);


        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_Hindi.class);
                startActivity(intent);

            }
        });
        arabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_Arabi.class);
                startActivity(intent);

            }
        });
    china.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_China.class);
                startActivity(intent);

            }
        });
    malayalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_Malayalam.class);
                startActivity(intent);

            }
        });
                tamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_Tamil.class);
                startActivity(intent);

            }
        });
        telungu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_Telungu.class);
                startActivity(intent);

            }
        });
        marati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_Marati.class);
                startActivity(intent);

            }
        });
        french.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_French.class);
                startActivity(intent);

            }
        });
        bengali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_Bengali.class);
                startActivity(intent);

            }
        });
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_English.class);
                startActivity(intent);

            }
        });
        hebrew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_Hebrew.class);
                startActivity(intent);

            }
        });
        japan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_Japanese.class);
                startActivity(intent);

            }
        });
        kannada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_Kannada.class);
                startActivity(intent);

            }
        });
        russia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_Russia.class);
                startActivity(intent);

            }
        });
        spanish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_Spanish.class);
                startActivity(intent);

            }
        });
        turki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_Choose_Language.this,News_Turki.class);
                startActivity(intent);

            }
        });
    }
}
