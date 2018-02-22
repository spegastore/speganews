package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class News_Menu_French extends AppCompatActivity {

    TextView Laune,Pays,Politique,Economie,Sport,evenementslocaux,gouvernorates,presse,culture,sante,Environments,Enseignment,Tourisme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu__french);
        getSupportActionBar().hide();
        Laune=(TextView)findViewById(R.id.textView_laune);
        Pays=(TextView)findViewById(R.id.textView_pays);
        Politique=(TextView)findViewById(R.id.textView_Politique);
        Economie=(TextView)findViewById(R.id.textView_Economie);
        Sport=(TextView)findViewById(R.id.textView_sport_french);
        evenementslocaux=(TextView)findViewById(R.id.textView_evenementslocaux);
        gouvernorates=(TextView)findViewById(R.id.textView_gouvernorates);
        presse=(TextView)findViewById(R.id.textView_presse);
        culture=(TextView)findViewById(R.id.textView_cultureetarts);
        sante=(TextView)findViewById(R.id.textView_santeet);
        Environments=(TextView)findViewById(R.id.textView_Environments);
        Enseignment=(TextView)findViewById(R.id.textView_Enseignment);
        Tourisme=(TextView)findViewById(R.id.textView_Tourismeetsocieties);

        Laune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/french_sepcat.php?id=1&off=0";
                String head="La une";
                Intent intent=new Intent(News_Menu_French.this,News_FromFrench.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        Pays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/french_sepcat.php?id=2&off=0";
                String head="Pays";
                Intent intent=new Intent(News_Menu_French.this,News_FromFrench.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        Politique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/french_sepcat.php?id=3&off=0";
                String head="Politique";
                Intent intent=new Intent(News_Menu_French.this,News_FromFrench.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        Economie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/french_sepcat.php?id=4&off=0";
                String head="Economie";
                Intent intent=new Intent(News_Menu_French.this,News_FromFrench.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        Sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/french_sepcat.php?id=5&off=0";
                String head="Sport";
                Intent intent=new Intent(News_Menu_French.this,News_FromFrench.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        evenementslocaux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/french_sepcat.php?id=6&off=0";
                String head="evenements locaux";
                Intent intent=new Intent(News_Menu_French.this,News_FromFrench.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        gouvernorates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/french_sepcat.php?id=7&off=0";
                String head="gouvernorates";
                Intent intent=new Intent(News_Menu_French.this,News_FromFrench.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        presse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/french_sepcat.php?id=8&off=0";
                String head="presse";
                Intent intent=new Intent(News_Menu_French.this,News_FromFrench.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });

        culture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/french_sepcat.php?id=9&off=0";
                String head="culture et arts";
                Intent intent=new Intent(News_Menu_French.this,News_FromFrench.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        sante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/french_sepcat.php?id=10&off=0";
                String head="sante et";
                Intent intent=new Intent(News_Menu_French.this,News_FromFrench.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        Environments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/french_sepcat.php?id=11&off=0";
                String head="Environments";
                Intent intent=new Intent(News_Menu_French.this,News_FromFrench.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        Enseignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/french_sepcat.php?id=12&off=0";
                String head="Enseignment";
                Intent intent=new Intent(News_Menu_French.this,News_FromFrench.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
        Tourisme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="http://speganews.com/api/french_sepcat.php?id=13&off=0";
                String head="Tourisme et societies";
                Intent intent=new Intent(News_Menu_French.this,News_FromFrench.class);
                intent.putExtra("api",url);
                intent.putExtra("title",head);
                startActivity(intent);
            }
        });
    }
}
