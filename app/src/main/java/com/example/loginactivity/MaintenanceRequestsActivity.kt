package com.example.loginactivity

import BaseData.BaseActivity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch
import com.example.loginactivity.databinding.ActivityMaintenanceRequestsBinding
import com.example.loginactivity.databinding.FragmentCanceledBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import fragment.CanceledFragment
import fragment.ClosedFragment
import fragment.CurrentFragment


class MaintenanceRequestsActivity : BaseActivity() {
    private lateinit var binding: ActivityMaintenanceRequestsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMaintenanceRequestsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragmentMethod(CanceledFragment())
        binding.tabLayout.setOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(tab?.position){
                    0->replaceFragmentMethod(CanceledFragment())
                    1->replaceFragmentMethod(ClosedFragment())
                    2->replaceFragmentMethod(CurrentFragment())


                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })


    }


}