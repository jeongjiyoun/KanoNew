package com.mynote.kano;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goCommit(View V){
        Intent intent2 = new Intent(this, CommitActivity.class);
        startActivityForResult(intent2,1001);
        finish();
    }
    public void goDatepick(View v) {
        Intent intent = new Intent(this, calendarActivity.class);
        startActivity(intent);
        finish();
    }

    public void goLogin(View v){
        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);
        finish();
    }
}
