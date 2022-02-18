package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Button button3 = (Button) findViewById(R.id.activity_about_03);  //访问我们
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_website = new Intent(Intent.ACTION_VIEW);
                intent_website.setData(Uri.parse("http://192.168.0.107:8080/"));
                startActivity(intent_website);
            }
        });

        Button button4 = (Button) findViewById(R.id.activity_about_04);  //致电我们
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_website = new Intent(Intent.ACTION_VIEW);
                intent_website.setData(Uri.parse("https://github.com/LeoAnyu/Agility-Password-Management"));
                startActivity(intent_website);
            }
        });
    }
}