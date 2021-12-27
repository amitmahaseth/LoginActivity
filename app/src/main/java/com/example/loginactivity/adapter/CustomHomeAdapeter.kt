package com.example.loginactivity.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.loginactivity.R

class CustomHomeAdapeter (private var mContext:Context): PagerAdapter() {
    override fun getCount(): Int {
        return 10
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {

        return view==`object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        var view=LayoutInflater.from(mContext).inflate(R.layout.views_home,container,false)

//        var img_home2=view.findViewById<ImageView>(R.id.img_home2)
//        img_home2.setImageResource(R.drawable.home)
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object1`: Any) {
        container.removeView(object1 as View?)
    }
}