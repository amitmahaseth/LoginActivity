package com.example.loginactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.loginactivity.databinding.ActivitySubscribeBinding
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.ktx.messaging

class SubscribeActivity : AppCompatActivity() {
    lateinit var binding: ActivitySubscribeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubscribeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSubscribed.setOnClickListener {
            Log.d("Subscribed", "Subscribing to weather topic")
            // [START subscribe_topics]
            Firebase.messaging.subscribeToTopic("abc")
                .addOnCompleteListener { task ->
                    var msg = getString(R.string.msg_subscribed)
                    if (!task.isSuccessful) {
                        msg = getString(R.string.msg_subscribe_failed)
                    }
                    Log.d("Subscribe", "msg")
                    Toast.makeText(baseContext, "Successful", Toast.LENGTH_SHORT).show()
                }
        }
    }
}