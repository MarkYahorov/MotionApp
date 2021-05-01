package com.example.motionapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SparesAdapter(private val spares: Array<Spares>) : RecyclerView.Adapter<SparesAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val photo = itemView.findViewById<ImageView>(R.id.imageView)
        private val name = itemView.findViewById<TextView>(R.id.textView)
        private val price = itemView.findViewById<TextView>(R.id.textView2)

        fun bind(sparesItem: Spares) {
            photo.setImageResource(sparesItem.image)
            name.text = sparesItem.name
            price.text = sparesItem.price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(spares[position])
    }

    override fun getItemCount(): Int = spares.size
}