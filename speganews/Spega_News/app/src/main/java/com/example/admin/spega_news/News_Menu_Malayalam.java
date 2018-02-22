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

public class News_Menu_Malayalam extends AppCompatActivity {

    List<String> ChildList;
    Map<String, List<String>> ParentListItems;
    ExpandableListView expandablelistView;

    // Assign Parent list items here.
    List<String> ParentList = new ArrayList<String>();
    {    ParentList.add("News");
        ParentList.add("Sports");
        ParentList.add("Business");
        ParentList.add("Technology");
        ParentList.add("Social Media");
        ParentList.add("Music");
        ParentList.add("Interview Tips");
        ParentList.add("Extra");
        ParentList.add("Features");
        ParentList.add("Application");
        ParentList.add("Games");
       // ParentList.add("Agriculture");
       // ParentList.add("Animal Husbandry");
        //ParentList.add("Success Story");
    }
    // Assign children list element using string array.
    String[] NewsName = {"News","Kerala","India","World","GD News","Indeapth","Crime"};
    String[] MusicName = {"Music", "Music News", "Music Features", "Music Interview", "Music Review", "Music Preview", "Music Trivia"};
    String[] SocialmediaName = {"Social Media", "Gossip","Flashback"};
    String[] SportsName = {"Sports", "Cricket", "Football", "Tennis","Athlet"};
    String[] TechnologyName = {"Technology", "Tech News", "Mobile", "Telecom", "Web"};
    String[] BusinessName = {"New Business", "Stock Market", "Mutual Fund", "Money"};
    //String[] AgriName = {"Agriculture", "Farmer Technology", "Agriculture News", "Agri Features", "Agri soil for Life", "Organic Farming", "Cash Crop", "Medicine Plant", "Aqua Culture", "Coconut", "Gardening", "Farmcare", "Cultivision"};
    String[] InterviewName = {"Interview"};
    String[] ExtraName = {"Motor","Gadget"};
    String[] featureName = {"Features","Features_one"};
    String[] AppName = {"Applications"};
    String[] GameName = {"Gaming"};
    //String[] animalName = {"Animal Husbandry"};
   // String[] storyName = {"Success Story"};
    String[] ByDefalutMessage = {"Items Loading"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__menu__malayalam);
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
            else if (HoldItem.equals("Social Media"))
                loadChild(SocialmediaName);
            else if (HoldItem.equals("Music"))
                loadChild(MusicName);
            else if (HoldItem.equals("Interview Tips"))
                loadChild(InterviewName);
            else if (HoldItem.equals("Extra"))
                loadChild(ExtraName);
            else if (HoldItem.equals("Features"))
                loadChild(featureName);
            else if (HoldItem.equals("Application"))
                loadChild(AppName);
            else if (HoldItem.equals("Games"))
                loadChild(GameName);
           /* else if (HoldItem.equals("Agriculture"))
                loadChild(AgriName);*/
           /* else if (HoldItem.equals("Animal Husbandry"))
                loadChild(animalName);
            else if (HoldItem.equals("Success Story"))
                loadChild(storyName);*/
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
                        String url1 ="http://speganews.com/api/malayalam_sepcat.php?id=1&off=0";
                        String head1="വാർത്തകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url1);
                        intent.putExtra("title",head1);
                        startActivity(intent);
                        break;
                    case "Kerala":
                        String url2 ="http://speganews.com/api/malayalam_sepcat.php?id=2&off=0";
                        String head2="കേരളം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url2);
                        intent.putExtra("title",head2);
                        startActivity(intent);
                        break;
                    case "India":
                        String url3 ="http://speganews.com/api/malayalam_sepcat.php?id=3&off=0";
                        String head3="ദേശ വാർത്തകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url3);
                        intent.putExtra("title",head3);
                        startActivity(intent);
                        break;
                    case "World":
                        String url4 ="http://speganews.com/api/malayalam_sepcat.php?id=4&off=0";
                        String head4="ലോക വാർത്തകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url4);
                        intent.putExtra("title",head4);
                        startActivity(intent);
                        break;
                    case "GD News":
                        String url6 ="http://speganews.com/api/malayalam_sepcat.php?id=6&off=0";
                        String head6=" വാർത്തകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url6);
                        intent.putExtra("title",head6);
                        startActivity(intent);
                        break;
                    case "Indeapth":
                        String url5 ="http://speganews.com/api/malayalam_sepcat.php?id=5&off=0";
                        String head5=" വാർത്തകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url5);
                        intent.putExtra("title",head5);
                        startActivity(intent);
                        break;
                    case "Crime":
                        String url7 ="http://speganews.com/api/malayalam_sepcat.php?id=7&off=0";
                        String head7=" കുറ്റകൃത്യ വാർത്തകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url7);
                        intent.putExtra("title",head7);
                        startActivity(intent);
                        break;

                    case "Sports":
                        String url8 ="http://speganews.com/api/malayalam_sepcat.php?id=8&off=0";
                        String head8=" സ്പോർട്സ്";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url8);
                        intent.putExtra("title",head8);
                        startActivity(intent);
                        break;
                   /* case "Music":
                        String url9 ="http://speganews.com/api/malayalam_sepcat.php?id=9&off=0";
                        String head9=" സംഗീതം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url9);
                        intent.putExtra("title",head9);
                        startActivity(intent);
                        break;*/
                    case "Interview":
                        String url10 ="http://speganews.com/api/malayalam_sepcat.php?id=10&off=0";
                        String head10="അഭിമുഖം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url10);
                        intent.putExtra("title",head10);
                        startActivity(intent);
                        break;
                   /* case "Extra":
                        String url11 ="http://speganews.com/api/malayalam_sepcat.php?id=11&off=0";
                        String head11=" വാർത്തകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url11);
                        intent.putExtra("title",head11);
                        startActivity(intent);
                        break;*/
                    case "Cricket":
                        String url12 ="http://speganews.com/api/malayalam_sepcat.php?id=12&off=0";
                        String head12="സ്പോർട്സ്";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url12);
                        intent.putExtra("title",head12);
                        startActivity(intent);
                        break;
                    case "Football":
                        String url13 ="http://speganews.com/api/malayalam_sepcat.php?id=13&off=0";
                        String head13=" സ്പോർട്സ്";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url13);
                        intent.putExtra("title",head13);
                        startActivity(intent);
                        break;
                    case "Tennis":
                        String url14 ="http://speganews.com/api/malayalam_sepcat.php?id=14&off=0";
                        String head14=" സ്പോർട്സ്";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url14);
                        intent.putExtra("title",head14);
                        startActivity(intent);
                        break;
                   /* case "Batminton":
                        String url15 ="http://speganews.com/api/malayalam_sepcat.php?id=15&off=0";
                        String head15=" സ്പോർട്സ്";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url15);
                        intent.putExtra("title",head15);
                        startActivity(intent);
                        break;*/
                    case "Athlet":
                        String url16 ="http://speganews.com/api/malayalam_sepcat.php?id=16&off=0";
                        String head16=" സ്പോർട്സ്";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url16);
                        intent.putExtra("title",head16);
                        startActivity(intent);
                        break;
                    case "Motor":
                        String url17 ="http://speganews.com/api/malayalam_sepcat.php?id=17&off=0";
                        String head17=" മോട്ടോർ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url17);
                        intent.putExtra("title",head17);
                        startActivity(intent);
                        break;
                  /*  case "Others":
                        String url18 ="http://speganews.com/api/malayalam_sepcat.php?id=18&off=0";
                        String head18=" വാർത്തകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url18);
                        intent.putExtra("title",head18);
                        startActivity(intent);
                        break;*/
                    case "Features":
                        String url19 ="http://speganews.com/api/malayalam_sepcat.php?id=19&off=0";
                        String head19=" സവിശേഷതകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url19);
                        intent.putExtra("title",head19);
                        startActivity(intent);
                        break;
                    case "Technology":
                        String url20 ="http://speganews.com/api/malayalam_sepcat.php?id=20&off=0";
                        String head20=" സാങ്കേതികവിദ്യ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url20);
                        intent.putExtra("title",head20);
                        startActivity(intent);
                        break;
                    case "Tech News":
                        String url21 ="http://speganews.com/api/malayalam_sepcat.php?id=21&off=0";
                        String head21=" സാങ്കേതിക വാർത്തകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url21);
                        intent.putExtra("title",head21);
                        startActivity(intent);
                        break;
                    case "Features_one":
                        String url22 ="http://speganews.com/api/malayalam_sepcat.php?id=22&off=0";
                        String head22=" സവിശേഷതകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url22);
                        intent.putExtra("title",head22);
                        startActivity(intent);
                        break;
                    case "Mobile":
                        String url23 ="http://speganews.com/api/malayalam_sepcat.php?id=23&off=0";
                        String head23="മൊബൈൽ വാർത്ത";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url23);
                        intent.putExtra("title",head23);
                        startActivity(intent);
                        break;
                    case "Telecom":
                        String url24 ="http://speganews.com/api/malayalam_sepcat.php?id=24&off=0";
                        String head24=" ടെലികോം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url24);
                        intent.putExtra("title",head24);
                        startActivity(intent);
                        break;
                    case "Applications":
                        String url25 ="http://speganews.com/api/malayalam_sepcat.php?id=25&off=0";
                        String head25=" അപ്ലിക്കേഷൻ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url25);
                        intent.putExtra("title",head25);
                        startActivity(intent);
                        break;
                    case "Social Media":
                        String url26 ="http://speganews.com/api/malayalam_sepcat.php?id=26&off=0";
                        String head26=" സോഷ്യൽ മീഡിയ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url26);
                        intent.putExtra("title",head26);
                        startActivity(intent);
                        break;
                    case "Gadget":
                        String url27 ="http://speganews.com/api/malayalam_sepcat.php?id=27&off=0";
                        String head27=" ഗാഡ്ജെറ്റ്";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url27);
                        intent.putExtra("title",head27);
                        startActivity(intent);
                        break;
                    case "Web":
                        String url28 ="http://speganews.com/api/malayalam_sepcat.php?id=28&off=0";
                        String head28=" വെബ്";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url28);
                        intent.putExtra("title",head28);
                        startActivity(intent);
                        break;
                    case "Gaming":
                        String url29 ="http://speganews.com/api/malayalam_sepcat.php?id=29&off=0";
                        String head29=" ഗെയിമിംഗ്";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url29);
                        intent.putExtra("title",head29);
                        startActivity(intent);
                        break;
                   /* case "Science":
                        String url30 ="http://speganews.com/api/malayalam_sepcat.php?id=30&off=0";
                        String head30=" ശാസ്ത്രം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url30);
                        intent.putExtra("title",head30);
                        startActivity(intent);
                        break;*/
                    case "Money":
                        String url31 ="http://speganews.com/api/malayalam_sepcat.php?id=31&off=0";
                        String head31=" വാർത്തകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url31);
                        intent.putExtra("title",head31);
                        startActivity(intent);
                        break;
                    case "New Business":
                        String url32 ="http://speganews.com/api/malayalam_sepcat.php?id=32&off=0";
                        String head32=" ബിസിനസ്സ് വാർത്തകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url32);
                        intent.putExtra("title",head32);
                        startActivity(intent);
                        break;
                    case "Stock Market":
                        String url33 ="http://speganews.com/api/malayalam_sepcat.php?id=33&off=0";
                        String head33="ഓഹരി വിപണി വാർത്തകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url33);
                        intent.putExtra("title",head33);
                        startActivity(intent);
                        break;
                    case "Mutual Fund":
                        String url34 ="http://speganews.com/api/malayalam_sepcat.php?id=34&off=0";
                        String head34=" മ്യൂച്വൽ ഫണ്ട് ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url34);
                        intent.putExtra("title",head34);
                        startActivity(intent);
                        break;
                    case "Music News":
                        String url35 ="http://speganews.com/api/malayalam_sepcat.php?id=35&off=0";
                        String head35=" സംഗീതം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url35);
                        intent.putExtra("title",head35);
                        startActivity(intent);
                        break;
                    case "Music Features":
                        String url36 ="http://speganews.com/api/malayalam_sepcat.php?id=36&off=0";
                        String head36=" സംഗീതം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url36);
                        intent.putExtra("title",head36);
                        startActivity(intent);
                        break;
                    case "Music Interview":
                        String url37 ="http://speganews.com/api/malayalam_sepcat.php?id=37&off=0";
                        String head37=" സംഗീതം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url37);
                        intent.putExtra("title",head37);
                        startActivity(intent);
                        break;
                    case "Music Review":
                        String url38 ="http://speganews.com/api/malayalam_sepcat.php?id=38&off=0";
                        String head38=" സംഗീതം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url38);
                        intent.putExtra("title",head38);
                        startActivity(intent);
                        break;
                    case "Music Preview":
                        String url39 ="http://speganews.com/api/malayalam_sepcat.php?id=39&off=0";
                        String head39=" സംഗീതം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url39);
                        intent.putExtra("title",head39);
                        startActivity(intent);
                        break;
                    case "Music Trivia":
                        String url40 ="http://speganews.com/api/malayalam_sepcat.php?id=40&off=0";
                        String head40=" സംഗീതം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url40);
                        intent.putExtra("title",head40);
                        startActivity(intent);
                        break;
                    case "Music":
                        String url41 ="http://speganews.com/api/malayalam_sepcat.php?id=41&off=0";
                        String head41=" സംഗീതം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url41);
                        intent.putExtra("title",head41);
                        startActivity(intent);
                        break;
                    case "Gossip":
                        String url42 ="http://speganews.com/api/malayalam_sepcat.php?id=42&off=0";
                        String head42=" ഗോസിപ്പ്";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url42);
                        intent.putExtra("title",head42);
                        startActivity(intent);
                        break;
                    case "Flashback":
                        String url43 ="http://speganews.com/api/malayalam_sepcat.php?id=43&off=0";
                        String head43=" ഫ്ലാഷ്ബാക്ക്";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url43);
                        intent.putExtra("title",head43);
                        startActivity(intent);
                   /*     break;
                    case "Agriculture":
                        String url44 ="http://speganews.com/api/malayalam_sepcat.php?id=44&off=0";
                        String head44=" കൃഷി";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url44);
                        intent.putExtra("title",head44);
                        startActivity(intent);
                        break;
                    case "Farmer Technology":
                        String url45 ="http://speganews.com/api/malayalam_sepcat.php?id=45&off=0";
                        String head45=" കൃഷി സാങ്കേതിക വിദ്യ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url45);
                        intent.putExtra("title",head45);
                        startActivity(intent);
                        break;
                    case "Agriculture News":
                        String url46 ="http://speganews.com/api/malayalam_sepcat.php?id=46&off=0";
                        String head46=" കൃഷി";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url46);
                        intent.putExtra("title",head46);
                        startActivity(intent);
                        break;
                    case "Agri Features":
                        String url47 ="http://speganews.com/api/malayalam_sepcat.php?id=47&off=0";
                        String head47=" അഗ്രി ഫീച്ചറുകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url47);
                        intent.putExtra("title",head47);
                        startActivity(intent);
                        break;
                    case "Agri soil for Life":
                        String url48 ="http://speganews.com/api/malayalam_sepcat.php?id=48&off=0";
                        String head48=" കൃഷി";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url48);
                        intent.putExtra("title",head48);
                        startActivity(intent);
                        break;
                    case "Animal Husbandry":
                        String url49 ="http://speganews.com/api/malayalam_sepcat.php?id=49&off=0";
                        String head49=" മൃഗസംരക്ഷണം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url49);
                        intent.putExtra("title",head49);
                        startActivity(intent);
                        break;
                    case "Organic Farming":
                        String url50 ="http://speganews.com/api/malayalam_sepcat.php?id=50&off=0";
                        String head50=" ജൈവകൃഷി";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url50);
                        intent.putExtra("title",head50);
                        startActivity(intent);
                        break;
                    case "Cash Crop":
                        String url51 ="http://speganews.com/api/malayalam_sepcat.php?id=51&off=0";
                        String head51=" നാണ്യ വിള";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url51);
                        intent.putExtra("title",head51);
                        startActivity(intent);
                        break;
                    case "Medicine Plant":
                        String url52 ="http://speganews.com/api/malayalam_sepcat.php?id=52&off=0";
                        String head52=" ഔഷധ ചെടികൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url52);
                        intent.putExtra("title",head52);
                        startActivity(intent);
                        break;
                    case "Aqua Culture":
                        String url53 ="http://speganews.com/api/malayalam_sepcat.php?id=53&off=0";
                        String head53=" അക്വാ സംസ്കാരം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url53);
                        intent.putExtra("title",head53);
                        startActivity(intent);
                        break;
                    case "Success Story":
                        String url54 ="http://speganews.com/api/malayalam_sepcat.php?id=54&off=0";
                        String head54=" വിജയ കഥകൾ";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url54);
                        intent.putExtra("title",head54);
                        startActivity(intent);
                        break;
                    case "Coconut":
                        String url55 ="http://speganews.com/api/malayalam_sepcat.php?id=55&off=0";
                        String head55=" നാളികേരം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url55);
                        intent.putExtra("title",head55);
                        startActivity(intent);
                        break;
                    case "Gardening":
                        String url56 ="http://speganews.com/api/malayalam_sepcat.php?id=56&off=0";
                        String head56=" ഉദ്യാനം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url56);
                        intent.putExtra("title",head56);
                        startActivity(intent);
                        break;
                    case "Farmcare":
                        String url57 ="http://speganews.com/api/malayalam_sepcat.php?id=57&off=0";
                        String head57=" കൃഷി സംരക്ഷണം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url57);
                        intent.putExtra("title",head57);
                        startActivity(intent);
                        break;
                    case "Cultivision":
                        String url58 ="http://speganews.com/api/malayalam_sepcat.php?id=58&off=0";
                        String head58=" സാംസ്കാരിക ദർശനം";
                        intent = new Intent(News_Menu_Malayalam.this, News_FromMalayalam.class);
                        intent.putExtra("api",url58);
                        intent.putExtra("title",head58);
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

