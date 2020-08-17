package com.example.buyauto.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.buyauto.R
import kotlinx.android.synthetic.main.list_view.view.*


class SliderAdapter : RecyclerView.Adapter<SliderAdapter.ViewHolder>() {
    val items = listOf(R.drawable.img_car,R.drawable.img_car,R.drawable.img_car,R.drawable.img_car)

    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.list_view, parent, false)
        return ViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items.get(position)

        holder.itemView.sliderImage.setOnClickListener {
            //handle click event on image
        }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}