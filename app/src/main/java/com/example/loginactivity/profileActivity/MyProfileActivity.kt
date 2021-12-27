package com.example.loginactivity.profileActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.loginactivity.databinding.ActivityMyProfileBinding

class MyProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMyProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMyProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEditProfile.setOnClickListener(View.OnClickListener {
            val intent=Intent(this,EditProfileActivity::class.java)
            startActivity(intent)
            finish()
        })

        binding.btnEditChangePassword.setOnClickListener(View.OnClickListener {
            val intent=Intent(this,ChangePasswordActivity::class.java)
            startActivity(intent)
            finish()
        })
    }
}