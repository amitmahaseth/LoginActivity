package com.example.loginactivity.adapter

import com.example.loginactivity.model.ClickListener
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.loginactivity.R
import kotlin.collections.ArrayList

class HomeAdapter(private val items: ArrayList<String>?, private val listener: ClickListener)
    : RecyclerView.Adapter<HomeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_home, parent, false)
        return HomeViewHolder(view)

    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {

        holder.img_home.setOnClickListener {
            listener.onClickListener()
        }
    }

    override fun getItemCount(): Int {
        return 11
    }

}


class HomeViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
  var  img_home=itemView.findViewById<ImageView>(R.id.img_home)
}

