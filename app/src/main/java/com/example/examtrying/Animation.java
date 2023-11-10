package com.example.examtrying;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Animation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent Main = new Intent(Animation.this,MainActivity.class);
                startActivity(Main);
                finish();
            }
        },4000);
    }
}