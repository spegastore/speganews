package com.example.admin.spega_news;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class News_Description extends AppCompatActivity {

    TextView head,desc;
    ImageView img,icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news__description);
        getSupportActionBar().hide();
        head=(TextView)findViewById(R.id.head);
        desc=(TextView)findViewById(R.id.desc);
        img=(ImageView)findViewById(R.id.imageView_desc);
        icon=(ImageView)findViewById(R.id.imageView_icon) ;
        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Bundle extras=getIntent().getExtras();
        String heading=extras.getString("title");
        String image=extras.getString("thumbnail");
        String description=extras.getString("desc");
        head.setText(heading);
        Picasso.with(this).load(image).error(R.drawable.error_message).placeholder(R.drawable.loading).into(img);
        desc.setText(description);
    }
}
