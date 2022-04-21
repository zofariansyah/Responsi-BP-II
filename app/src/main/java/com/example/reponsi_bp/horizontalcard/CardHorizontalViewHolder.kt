package com.example.reponsi_bp.horizontalcard

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.reponsi_bp.PenjelasanLayout
import com.example.reponsi_bp.R
import com.example.reponsi_bp.recommend.CardAtas

class CardHorizontalViewHolder (inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(
    R.layout.cardhorizontal,parent,false)){
    private var imgView: ImageView? = null
    private var txtTitle: TextView? = null
    private var color: CardView? = null

    init {
        imgView = itemView.findViewById(R.id.itemImage)
        txtTitle = itemView.findViewById(R.id.itemNama)


    }

    fun bind(data: CardHorizontal){
        imgView?.setImageResource(data.image)
        txtTitle?.text = data.judul
        color?.setCardBackgroundColor(data.color)
    }

}
