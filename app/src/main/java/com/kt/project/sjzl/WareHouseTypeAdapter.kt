package com.kt.project.sjzl

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kt.project.R


class WareHouseTypeAdapter : RecyclerView.Adapter<WareHouseTypeAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.tv_title)
        val textView2: TextView = view.findViewById(R.id.tv_time)
        val imageView: ImageView = view.findViewById(R.id.iv_canvas)

    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.item_ware_house_type, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.textView.text = "万里江山图"
        viewHolder.textView2.text = "2022-04-09 13:20上传"
        viewHolder.imageView.setBackgroundResource(R.mipmap.img_canvas)

    }


    override fun getItemCount(): Int {
        return 5
    }

}