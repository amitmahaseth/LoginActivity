package com.example.loginactivity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.loginactivity.databinding.ActivityMaintenanceRequestsBinding
import com.google.android.material.tabs.TabLayout


class MaintenanceRequestsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMaintenanceRequestsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMaintenanceRequestsBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        binding.tabLayout.setOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
//            override fun onTabSelected(tab: TabLayout.Tab?) {
//                if (tab.position==0)
//                {
//
//                }
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab?) {
//
//            }
//
//            override fun onTabReselected(tab: TabLayout.Tab?) {
//
//            }
//
//        })
        selectableChat()
        binding.btnChat.setOnClickListener(View.OnClickListener {
            selectableChat()

        })
        binding.btnCancelRequest.setOnClickListener(View.OnClickListener {
            selectableCancelRequest()
        })
    }

    private  fun selectableChat(){
        binding.btnCancelRequest.setBackgroundColor(Color.WHITE)
        binding.btnChat.setBackgroundResource(R.drawable.btn_blue_back)
        binding.btnChat.setTextColor(Color.WHITE)
        binding.btnCancelRequest.setTextColor(Color.BLACK)
        binding.btnCancelRequest.setBackgroundResource(R.drawable.btn_round_eng)
    }
    private fun selectableCancelRequest(){
        binding.btnChat.setBackgroundColor(Color.WHITE)
        binding.btnCancelRequest.setBackgroundResource(R.drawable.btn_blue_back)
        binding.btnCancelRequest.setTextColor(Color.WHITE)
        binding.btnChat.setTextColor(Color.BLACK)
        binding.btnChat.setBackgroundResource(R.drawable.btn_round_eng)
    }
}