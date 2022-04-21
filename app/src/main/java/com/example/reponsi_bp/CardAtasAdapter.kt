package com.example.reponsi_bp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CardAtasAdapter : RecyclerView.Adapter<CardAtasAdapter.ViewHolder>() {
    private var nama = arrayOf("Math", "Ipa", "IPAA")
    private var color = intArrayOf(R.color.black, R.color.black, R.color.black)
    private val images = intArrayOf(R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background)



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemName.text = nama[position]
        holder.bgColor.setCardBackgroundColor(color[position])
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return nama.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemName : TextView
        var bgColor: CardView

        init {
            itemImage = itemView.findViewById(R.id.imageView)
            itemName = itemView.findViewById(R.id.textItem)
            bgColor = itemView.findViewById(R.id.cardItem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(v)
    }


}

