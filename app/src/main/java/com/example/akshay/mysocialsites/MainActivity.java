package com.example.akshay.mysocialsites;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    String fontPath = "fonts/slabo.ttf";
    TextView textView;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.a1);
        Typeface typeface = Typeface.createFromAsset(getAssets(), fontPath);

        textView.setTypeface(typeface);

        b1 = (Button) findViewById(R.id.button);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intentSending();
            }
        });


    }

    private void intentSending() {
        String t = "http://google.com";
        Intent webUrlIntent = new Intent(getApplicationContext(), webParser.class);
        webUrlIntent.setType("text/html");
        Bundle b = new Bundle();
        b.putString("URI", t);
        webUrlIntent.putExtras(b);

        startActivity(webUrlIntent);
    }


}
