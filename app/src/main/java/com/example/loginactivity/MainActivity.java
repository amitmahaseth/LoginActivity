package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.example.loginactivity.BaseData.BaseActivity;

public class MainActivity extends BaseActivity {

    Boolean save=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (isLoggedIn()){
                    Intent intent= new Intent(MainActivity.this,ChatActivity.class);
                    startActivity(intent);
                    finish();
                  //  Toast.makeText(MainActivity.this, "thanks", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent goLogin=new Intent(MainActivity.this,SplashScreen.class);
                    startActivity(goLogin);
                    finish();
                }
            }
        },3000);
    }
}