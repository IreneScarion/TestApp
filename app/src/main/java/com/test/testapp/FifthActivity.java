package com.test.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class FifthActivity extends AppCompatActivity {
    Button meme29;
    private AppCompatActivity packageContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        meme29 = findViewById(R.id.meme29);
        meme29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (FifthActivity.this,Ninthactivity.class);
            }
        });
    }
}