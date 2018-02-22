package com.example.admin.spega_news;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class News_Select_Language extends AppCompatActivity {

    Button arabic,english,hindi,malayalam,tamil,kannada,marati,bengali,telungu,french,japanese,chinese,spanish,russian,turkish,hebrue;

    int pid=android.os.Process.myPid();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__select__language);
        getSupportActionBar().hide();

        arabic=(Button)findViewById(R.id.button_arabic);
        hindi=(Button)findViewById(R.id.button_hindi);
        chinese=(Button)findViewById(R.id.button_chinese);
        malayalam=(Button)findViewById(R.id.button_malayalam);
        marati=(Button)findViewById(R.id.button_marati);
        tamil=(Button)findViewById(R.id.button_tamil);
        telungu=(Button)findViewById(R.id.button_telungu);
        french=(Button)findViewById(R.id.button_french);
        french=(Button)findViewById(R.id.button_french);
        bengali=(Button)findViewById(R.id.button_bengali);
        chinese=(Button)findViewById(R.id.button_chinese);
        english=(Button)findViewById(R.id.button_english);
        hebrue=(Button)findViewById(R.id.button_hebrew);
        japanese=(Button)findViewById(R.id.button_japanese);
        kannada =(Button)findViewById(R.id.button_kannada);
        russian =(Button)findViewById(R.id.button_russian);
        spanish =(Button)findViewById(R.id.button_spanish);
        turkish =(Button)findViewById(R.id.button_turkish);

        arabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(News_Select_Language.this, News_Arabi.class);
                // set the new task and clear flags
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
                // Intent intent=new Intent(News_Select_Language.this,News_Arabi.class);
             /*   intent.putExtra("api_key",url);*/
                //  startActivity(intent);
            }
        });
     hindi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_Hindi.class);
             //*   intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
        chinese.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_China.class);
             //*   intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
      malayalam.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_Malayalam.class);
             //*   intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
        marati.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_Marati.class);
             //*   intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
        tamil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_Tamil.class);
             //*   intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
        telungu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_Telungu.class);
             //*   intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
        french.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_French.class);
             //*   intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
        bengali.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_Bengali.class);
                 //  intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
        chinese.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_China.class);
                //  intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
        english.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_English.class);
                //  intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
        hebrue.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_Hebrew.class);
                //  intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
        japanese.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_Japanese.class);
                //  intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
        kannada.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_Kannada.class);
                //  intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
        russian.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_Russia.class);
                //  intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
        spanish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_Spanish.class);
                //  intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
        turkish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(News_Select_Language.this,News_Turki.class);
                //  intent.putExtra("api_key",url);*//*
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(2);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT)
        {
            Toast.makeText(getApplicationContext(),"Portrait Mode",Toast.LENGTH_SHORT).show();
        }else if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            Toast.makeText(getApplicationContext(),"Landscape Mode",Toast.LENGTH_SHORT).show();
        }
    }
}
