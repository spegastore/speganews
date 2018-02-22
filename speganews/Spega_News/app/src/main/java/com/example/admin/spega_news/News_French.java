package com.example.admin.spega_news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class News_French extends AppCompatActivity {

    RecyclerView recyclerView_french;
    List<Dataclass_News> datahindi;
    ImageView icon;
    ImageView chooseicon;
    ProgressBar bar;
    private static final String TAG = News_French.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__french);
        getSupportActionBar().hide();
        chooseicon = (ImageView)findViewById(R.id.new_right_menu);
        chooseicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News_French.this,News_Choose_Language.class);
                startActivity(intent);

            }
        });
        bar=(ProgressBar)findViewById(R.id.progressBar);
        icon = (ImageView) findViewById(R.id.imageView_icon);
        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(News_French.this,News_Menu_French.class);
                startActivity(intent);

            }
        });

        recyclerView_french = (RecyclerView) findViewById(R.id.recycler_news);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext());
        recyclerView_french.setLayoutManager(llm);
        recyclerView_french.setHasFixedSize(true);
        initialize();
        Recycler_News adapter=new Recycler_News(News_French.this,datahindi);
        recyclerView_french.setAdapter(adapter);
        //String url ="http://speganews.com/api/hindi_sepcat.php?id=1&off=0";
        newsFeed();
    }
    public void newsFeed(){


        String url ="http://speganews.com/api/french_sepcat.php?id=1&off=0";
        com.android.volley.Cache cache = AppController.getInstance().getRequestQueue().getCache();
        com.android.volley.Cache.Entry entry = cache.get(url);

        StringRequest stringRequest = new StringRequest(Request.Method.GET,

                url


                ,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("Volleyresponse", response.toString());
                        try {
                            JSONObject Jobject = (JSONObject) new JSONTokener(response).nextValue();
                            parseResult(Jobject);
                        } catch (Exception e) {

                        }


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //dialog.hide();
                        Toast.makeText(News_French.this, error.toString(), Toast.LENGTH_LONG).show();
                    }
                }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("id", "1");


                return params;
            }

        };

//Adding the string request to the queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

        stringRequest.setRetryPolicy(new DefaultRetryPolicy(5000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));




    }
    private void initialize() {

        datahindi=new ArrayList<>();
        //  datanews.add(new Dataclass_News("News",R.drawable.star));
        //  datanews.add(new Dataclass_News("News",R.drawable.star));
    }


    public void parseResult(JSONObject arabiNews) {
        datahindi=new ArrayList<>();
        try {

            JSONArray array=arabiNews.getJSONArray("result");
            for(int i=0;i<array.length();i++)
            {
                JSONObject datalist=array.getJSONObject(i);
                Dataclass_News dc=new Dataclass_News();
                dc.setTitle(datalist.getString("title"));
                dc.setDesc(datalist.getString("description"));
                dc.setImage(datalist.getString("image"));
                datahindi.add(dc);

            }
            Recycler_News adapter=new Recycler_News(News_French.this,datahindi);
            recyclerView_french.setAdapter(adapter);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
