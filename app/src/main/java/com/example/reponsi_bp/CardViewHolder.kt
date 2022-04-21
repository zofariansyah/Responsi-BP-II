package com.example.reponsi_bp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class CardViewHolder (inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(R.layout.card_layout,parent,false)){
    private var imgView:ImageView? = null
    private var txtTitle:TextView? = null
    private var color:LinearLayout? = null


    init {
        imgView = itemView.findViewById(R.id.itemImage)
        txtTitle = itemView.findViewById(R.id.itemNama)

        itemView.setOnClickListener { v: View ->
            val positition : Int = adapterPosition
            Toast.makeText(itemView.context, "Click ${positition + 1}", Toast.LENGTH_SHORT).show()
            val intent = Intent(itemView.context, PenjelasanLayout::class.java)
            intent.putExtra("judul", positition)
            itemView.context.startActivity(intent)
        }
    }

    fun bind(data: CardAtas){
        imgView?.setImageResource(data.image)
        txtTitle?.text = data.judul
    }
}