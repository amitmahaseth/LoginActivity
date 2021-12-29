package com.example.loginactivity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginactivity.databinding.ActivityChatBinding


class ChatActivity : AppCompatActivity() {
   private lateinit var binding: ActivityChatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnLogout.setOnClickListener {
            var preferences = getSharedPreferences("loginPrefs", Context.MODE_PRIVATE)
            var editor = preferences.edit()
            editor.clear()
            editor.commit()
            finish()

        }


    }
}