package com.lsukev.showmethebios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class DetailsActivity extends AppCompatActivity {
    private ImageView detailsImage;
    private TextView txtBio;
    private TextView txtName;
    private Bundle extras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        detailsImage = (ImageView)findViewById(R.id.detailsImage);
        txtBio = (TextView) findViewById(R.id.txtBio);
        txtName = (TextView)findViewById(R.id.txtName);

        extras = getIntent().getExtras();
        if (extras != null){

            String name = extras.getString("name");
            showDetails(name);
        }


    }

    public void showDetails (String mName){
        if (mName.equals("Bach")){
            detailsImage.setImageResource(R.drawable.bach_profile);
            String bio = extras.getString(mName);
            txtBio.setText(bio);
            txtName.setText(mName);
        } else if (mName.equals("Mozart")){
            detailsImage.setImageResource(R.drawable.mozart_profile);
            String bio = extras.getString(mName);
            txtBio.setText(bio);
            txtName.setText(mName);
        }
    }
}
