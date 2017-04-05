package com.example.prusp.wloszczyzna_simple_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTheCollapsingToolbarTitle();
    }

    private void setTheCollapsingToolbarTitle() {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.collapsing);
        collapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.CustomTitleStyle);
    }

    public void contactOnClick(View view) {
        Intent contactIntent = new Intent(Intent.ACTION_DIAL);
        contactIntent.setData(Uri.parse("tel:"+getString(R.string.telephone_number)));
        startActivity(contactIntent);
    }

    public void facebookOnClick(View view){
        Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
        facebookIntent.setData(Uri.parse("https://www."+getString(R.string.facebook_adress)));
        startActivity(facebookIntent);
    }

    public void localizationOnClick(View view){
        Uri gmmIntentUri = Uri.parse("geo:0, 0?q=Myczkowskiego 1, Gdansk, Wloszczyzna");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

}
