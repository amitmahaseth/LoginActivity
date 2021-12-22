package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.loginactivity.databinding.ActivityVerifyingBinding;

public class VerifyingActivity extends AppCompatActivity {

    private ActivityVerifyingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityVerifyingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(VerifyingActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}