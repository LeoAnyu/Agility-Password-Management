package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);
        Button button = (Button) findViewById(R.id.activity_main_layout_button_manage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity_Main.this, "功能尚未实现！", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {

            case R.id.activity_main_layout_menu_add:
                Toast.makeText(Activity_Main.this, "添加功能尚未实现！", Toast.LENGTH_SHORT).show();
                break;
            case R.id.activity_main_layout_menu_delete:
                // Toast.makeText(Activity_Main.this, "删除功能尚未实现！", Toast.LENGTH_SHORT).show();
                Intent intent_delete = new Intent("activity_delete_layout");
                intent_delete.addCategory("android.intent.category.DEFAULT");
                startActivity(intent_delete);
                break;
            case R.id.activity_main_layout_menu_onlineVideo:
                Intent intent_onlineVideo = new Intent(Activity_Main.this, Activity_OnlineVideo.class);
                startActivity(intent_onlineVideo);
                break;
            case R.id.activity_main_layout_menu_about:
                Intent intent_about = new Intent(Activity_Main.this, Activity_About.class);
                startActivity(intent_about);
                break;

            default:
        }
        return true;
    }
}