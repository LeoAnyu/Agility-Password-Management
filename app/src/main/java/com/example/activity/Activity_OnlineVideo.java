package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_OnlineVideo extends AppCompatActivity {

    private EditText editText;
    private String url_vip = "https://vip.parwix.com:4433/player/?url=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_video);
        editText = (EditText)findViewById(R.id.activity_online_video_input);

        Button button1 = (Button) findViewById(R.id.activity_online_video_open);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_website = new Intent(Intent.ACTION_VIEW);
                String url_input = url_vip + editText.getText().toString();
                intent_website.setData(Uri.parse(url_input));
                startActivity(intent_website);
            }
        });
    }
}