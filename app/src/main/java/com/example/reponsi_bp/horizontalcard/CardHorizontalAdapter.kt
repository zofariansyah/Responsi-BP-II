package com.example.reponsi_bp.horizontalcard

import android.content.Intent
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.reponsi_bp.PenjelasanLayout
import com.example.reponsi_bp.recommend.CardViewHolder

class CardHorizontalAdapter (private val data: ArrayList<CardHorizontal>) : RecyclerView.Adapter<CardHorizontalViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHorizontalViewHolder {
        val inflatter = LayoutInflater.from(parent.context)
        return CardHorizontalViewHolder(inflatter,parent)
    }

    override fun onBindViewHolder(holder: CardHorizontalViewHolder, position: Int) {
        holder.itemView.setOnClickListener { v: View ->
            Toast.makeText(holder.itemView.context, "Click ${data[position].judul}", Toast.LENGTH_SHORT).show()
            val intent = Intent(holder.itemView.context, PenjelasanLayout::class.java)
            intent.putExtra("judul", data[position].judul)

            holder.itemView.context.startActivity(intent)
        }

        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}