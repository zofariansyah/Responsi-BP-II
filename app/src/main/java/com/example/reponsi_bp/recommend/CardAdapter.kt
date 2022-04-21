package com.example.reponsi_bp.recommend

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.reponsi_bp.PenjelasanLayout

class CardAdapter (private val data: ArrayList<CardAtas>) : RecyclerView.Adapter<CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return CardViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
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