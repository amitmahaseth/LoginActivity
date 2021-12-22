package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashScreen extends AppCompatActivity {
    private Button btnEnglish,btnArabic,btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        btnEnglish=findViewById(R.id.btn_english);
        btnArabic=findViewById(R.id.btn_arabic);
        btnNext=findViewById(R.id.btn_next);

        selectEnglishTab();
        btnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectEnglishTab();
            }
        });

        btnArabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnEnglish.setBackgroundColor(Color.WHITE);
                btnArabic.setBackgroundResource(R.drawable.btn_blue_back);
                btnArabic.setTextColor(Color.WHITE);
                btnEnglish.setTextColor(Color.BLACK);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }

    private void selectEnglishTab()
    {
        btnArabic.setBackgroundColor(Color.WHITE);
        btnEnglish.setBackgroundResource(R.drawable.btn_blue_back);
        btnEnglish.setTextColor(Color.WHITE);
        btnArabic.setTextColor(Color.BLACK);
    }
}