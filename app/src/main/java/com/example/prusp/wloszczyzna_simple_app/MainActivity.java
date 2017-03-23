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


}
