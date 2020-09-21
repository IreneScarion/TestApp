package com.test.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class SixthActivity extends AppCompatActivity {
    Button meme30;
    private AppCompatActivity packageContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        meme30=findViewById(R.id.meme30);
        meme30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (SixthActivity.this,HealthMenu.class);
                startActivity(intent);
            }
        });
    }
}