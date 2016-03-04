package com.example.akshay.mysocialsites;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by akshay on 3/3/16.
 */
public class MainGridLayout extends MainActivity {

    String fontPath = "fonts/slabo.ttf";
    GridView gridView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),webParser.class);
                startActivity(intent);
            }
        });

    }
}
