package com.lsukev.showmethebios;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView bachImage;
    private ImageView mozartImage;

    private String bachBio = "Bach was born in";
    private String mozartBio = "Mozart was born in";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bachImage = (ImageView)findViewById(R.id.bachImage);
        mozartImage=(ImageView)findViewById(R.id.mozartImage);

        bachImage.setOnClickListener(this);
        mozartImage.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bachImage:
                Intent bachIntent = new Intent(MainActivity.this, DetailsActivity.class);
                bachIntent.putExtra("Bach", bachBio);
                bachIntent.putExtra("name", "Bach");
                startActivity(bachIntent);
                break;
            case R.id.mozartImage:
                Intent mozartIntent = new Intent(MainActivity.this, DetailsActivity.class);
                mozartIntent.putExtra("Mozart", mozartBio);
                mozartIntent.putExtra("name","Mozart");
                startActivity(mozartIntent);
                break;
        }
    }
}
