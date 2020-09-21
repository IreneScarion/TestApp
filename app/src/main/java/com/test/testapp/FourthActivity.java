package com.test.testapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


public class FourthActivity extends AppCompatActivity {
    Button meme28;
    private AppCompatActivity packageContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        meme28 = findViewById(R.id.meme28);
         meme28.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(FourthActivity.this, Computeractivity.class);

              }
         });
    }
}