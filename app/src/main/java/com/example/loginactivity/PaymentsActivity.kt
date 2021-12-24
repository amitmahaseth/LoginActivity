package com.example.loginactivity

import adapter.PaymentAdapter
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.loginactivity.databinding.ActivityPaymentsBinding

class PaymentsActivity : AppCompatActivity() {
        private lateinit var binding: ActivityPaymentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPaymentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerPayment.layoutManager=LinearLayoutManager(this)
        val adapeter=PaymentAdapter(this)
        binding.recyclerPayment.adapter=adapeter

    }
}