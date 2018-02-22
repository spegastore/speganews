package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class News_Menu_English extends AppCompatActivity {

    List<String> ChildList;
    Map<String, List<String>> ParentListItems;
    ExpandableListView expandablelistView;

    // Assign Parent list items here.
    List<String> ParentList = new ArrayList<String>();

    {
        ParentList.add("News");
        ParentList.add("Sports");
        ParentList.add("Business");
        ParentList.add("Technology");
       // ParentList.add("Social Media");
        ParentList.add("Movie");
       // ParentList.add("Music");
    }
    // Assign children list element using string array.
    String[] NewsName = {"News","Kerala","India","World","Crime"};
   // String[] MusicName = {"Music"};
   // String[] SocialmediaName = {"Social Media"};
    String[] SportsName = {"Sports", "Cricket", "Football", "Tennis", "Others"};
    String[] TechnologyName = {"Tech News", "Mobile","Science"};
    String[] BusinessName = {"New Business","Stock Market","New Product","Money"};
    String[] MovieName = {"Movie", "Movie News","Movie Review"};
    String[] ByDefalutMessage = {"Items Loading"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu__english);
        getSupportActionBar().hide();
        ParentListItems = new LinkedHashMap<String, List<String>>();

        for (String HoldItem : ParentList) {
            if (HoldItem.equals("News")) {
                loadChild(NewsName);
            } else if (HoldItem.equals("Sports"))
                loadChild(SportsName);
            else if (HoldItem.equals("Business"))
                loadChild(BusinessName);
            else if (HoldItem.equals("Technology"))
                loadChild(TechnologyName);
          /*  else if (HoldItem.equals("Social Media"))
                loadChild(SocialmediaName);*/
            else if (HoldItem.equals("Movie"))
                loadChild(MovieName);
           /* else if (HoldItem.equals("Music"))
                loadChild(MusicName);*/
            else
                loadChild(ByDefalutMessage);
            ParentListItems.put(HoldItem, ChildList);
        }
        expandablelistView = (ExpandableListView) findViewById(R.id.expandableListView1);
        final ExpandableListAdapter expListAdapter = new ListMenuAdapter(
                this, ParentList, ParentListItems);
        expandablelistView.setAdapter(expListAdapter);
        expandablelistView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub

                final String selected = (String) expListAdapter.getChild(
                        groupPosition, childPosition);
                // Switch case to open selected child element activity on child element selection.
                Intent intent;
                switch (selected) {
                    case "News":
                        String url1 ="http://speganews.com/api/english_sepcat.php?id=1&off=0";
                        String head1="News";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url1);
                        intent.putExtra("title",head1);
                        startActivity(intent);
                        break;
                    case "Kerala":
                        String url2 ="http://speganews.com/api/english_sepcat.php?id=2&off=0";
                        String head2="Kerala News";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url2);
                        intent.putExtra("title",head2);
                        startActivity(intent);
                        break;
                    case "India":
                        String url3 ="http://speganews.com/api/english_sepcat.php?id=3&off=0";
                        String head3="India News";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url3);
                        intent.putExtra("title",head3);
                        startActivity(intent);
                        break;
                    case "World":
                        String url4 ="http://speganews.com/api/english_sepcat.php?id=4&off=0";
                        String head4="World News";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url4);
                        intent.putExtra("title",head4);
                        startActivity(intent);
                        break;
                   /* case "GD News":
                        String url6 ="http://speganews.com/api/english_sepcat.php?id=6&off=0";
                        String head6="News";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url6);
                        intent.putExtra("title",head6);
                        startActivity(intent);
                        break;*/
                    case "Crime":
                        String url7 ="http://speganews.com/api/english_sepcat.php?id=7&off=0";
                        String head7="Crime News";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url7);
                        intent.putExtra("title",head7);
                        startActivity(intent);
                        break;
                    case "Sports":
                        String url8 ="http://speganews.com/api/english_sepcat.php?id=8&off=0";
                        String head8="Sports News";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url8);
                        intent.putExtra("title",head8);
                        startActivity(intent);
                        break;
              /*      case "Music":
                        String url9 ="http://speganews.com/api/english_sepcat.php?id=9&off=0";
                        String head9="Music";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url9);
                        intent.putExtra("title",head9);
                        startActivity(intent);
                        break;*/
                    case "Cricket":
                        String url12 ="http://speganews.com/api/english_sepcat.php?id=12&off=0";
                        String head12="Cricket";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url12);
                        intent.putExtra("title",head12);
                        startActivity(intent);
                        break;
                    case "Football":
                        String url13 ="http://speganews.com/api/english_sepcat.php?id=13&off=0";
                        String head13="Football";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url13);
                        intent.putExtra("title",head13);
                        startActivity(intent);
                        break;
                    case "Tennis":
                        String url14 ="http://speganews.com/api/english_sepcat.php?id=14&off=0";
                        String head14="Tennis";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url14);
                        intent.putExtra("title",head14);
                        startActivity(intent);
                        break;
                  /*  case "Athlet":
                        String url16 ="http://speganews.com/api/english_sepcat.php?id=16&off=0";
                        String head16="Athlet";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url16);
                        intent.putExtra("title",head16);
                        startActivity(intent);
                        break;*/
                    case "Others":
                        String url18 ="http://speganews.com/api/english_sepcat.php?id=18&off=0";
                        String head18="Others";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url18);
                        intent.putExtra("title",head18);
                        startActivity(intent);
                        break;
                    case "Tech News":
                        String url21 ="http://speganews.com/api/english_sepcat.php?id=21&off=0";
                        String head21="Tech News";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url21);
                        intent.putExtra("title",head21);
                        startActivity(intent);
                        break;
                    case "Mobile":
                        String url23 ="http://speganews.com/api/english_sepcat.php?id=23&off=0";
                        String head23="Mobile News";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url23);
                        intent.putExtra("title",head23);
                        startActivity(intent);
                        break;
                    case "Science":
                        String url25 ="http://speganews.com/api/english_sepcat.php?id=25&off=0";
                        String head25="Science";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url25);
                        intent.putExtra("title",head25);
                        startActivity(intent);
                        break;
                    case "New Business":
                        String url32 ="http://speganews.com/api/english_sepcat.php?id=32&off=0";
                        String head32="New Business";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url32);
                        intent.putExtra("title",head32);
                        startActivity(intent);
                        break;
                    case "Stock Market":
                        String url33 ="http://speganews.com/api/english_sepcat.php?id=33&off=0";
                        String head33="Stock Market";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url33);
                        intent.putExtra("title",head33);
                        startActivity(intent);
                        break;
                    case "Money":
                        String url31 ="http://speganews.com/api/english_sepcat.php?id=31&off=0";
                        String head31="Money";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url31);
                        intent.putExtra("title",head31);
                        startActivity(intent);
                        break;
                    case "New Product":
                        String url34 ="http://speganews.com/api/english_sepcat.php?id=34&off=0";
                        String head34=" New Product";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url34);
                        intent.putExtra("title",head34);
                        startActivity(intent);
                        break;
                    case "Movie":
                        String url40 ="http://speganews.com/api/english_sepcat.php?id=40&off=0";
                        String head40="Movie";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url40);
                        intent.putExtra("title",head40);
                        startActivity(intent);
                        break;
                    case "Movie News":
                        String url35 ="http://speganews.com/api/english_sepcat.php?id=35&off=0";
                        String head35=" Movie News";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url35);
                        intent.putExtra("title",head35);
                        startActivity(intent);
                        break;
                    case "Movie Review":
                        String url38 ="http://speganews.com/api/english_sepcat.php?id=38&off=0";
                        String head38="Movie Review";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url38);
                        intent.putExtra("title",head38);
                        startActivity(intent);
                        break;
                   /* case "Social Media":
                        String url24 ="http://speganews.com/api/english_sepcat.php?id=24&off=0";
                        String head24="Social Media";
                        intent = new Intent(News_Menu_English.this, News_FromEnglish.class);
                        intent.putExtra("api",url24);
                        intent.putExtra("title",head24);
                        startActivity(intent);
                        break;*/
                }
                return true;
            }

        });
    }
    private void loadChild(String[] ParentElementsName) {
        ChildList = new ArrayList<String>();
        for (String model : ParentElementsName)
            ChildList.add(model);
    }
    }

