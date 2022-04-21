package com.example.reponsi_bp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var layoutManager:RecyclerView.LayoutManager? = null
    private var adapter:RecyclerView.Adapter<CardAtasAdapter.ViewHolder>? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        layoutManager = LinearLayoutManager(this)

        var recyclerView:RecyclerView = findViewById(R.id.recyclerViewAtas)


        adapter= CardAtasAdapter()
        recyclerView.adapter = adapter
    }



}