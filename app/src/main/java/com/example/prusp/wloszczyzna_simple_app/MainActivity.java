package com.example.prusp.wloszczyzna_simple_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void contactOnClick(View view) {
        Intent contactIntent = new Intent(Intent.ACTION_DIAL);
        contactIntent.setData(Uri.parse("tel:"+getString(R.string.telephone_number)));
        startActivity(contactIntent);
    }
}
