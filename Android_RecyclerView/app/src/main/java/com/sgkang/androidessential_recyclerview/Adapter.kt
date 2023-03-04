package com.sgkang.androidessential_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val items: ArrayList<Data>): RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.id.text = item.id
        holder.name.text = item.name
        holder.profile_image.setImageDrawable(item.image)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(inflatedView)
    }

    inner class ViewHolder(v: View): RecyclerView.ViewHolder(v){
        private var view: View = v
        val name = view.findViewById<TextView>(R.id.name)
        val id = view.findViewById<TextView>(R.id.id)
        val profile_image = view.findViewById<ImageView>(R.id.profile_image)
    }
}