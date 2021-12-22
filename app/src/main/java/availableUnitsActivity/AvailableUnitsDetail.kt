package availableUnitsActivity

import adapter.CustomHomeAdapeter
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.example.loginactivity.ProjectManagerActivity
import com.example.loginactivity.R
import com.example.loginactivity.databinding.ActivityAvailableUnitsBinding
import com.example.loginactivity.databinding.ActivityAvailableUnitsDetailBinding
import com.google.android.material.tabs.TabLayout
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator


class AvailableUnitsDetail : AppCompatActivity() {
    private lateinit var  binding: ActivityAvailableUnitsDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAvailableUnitsDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var adapter=CustomHomeAdapeter(this)
        binding.viewPager.adapter=adapter
        binding.viewPager.currentItem=1

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        var tabLayout = findViewById<DotsIndicator>(R.id.tabLayout)


        viewPager.adapter = adapter
        tabLayout.setViewPager(viewPager)

        binding.btnContactPropertyManager.setOnClickListener(View.OnClickListener {
          val intent=Intent(this,ProjectManagerActivity::class.java)
            startActivity(intent)
            finish()
        })



    }
}