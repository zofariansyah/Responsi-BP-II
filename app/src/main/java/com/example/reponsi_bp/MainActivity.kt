package com.example.reponsi_bp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
//    private var layoutManager:RecyclerView.LayoutManager? = null
//    private var adapter:RecyclerView.Adapter<CardAtasAdapter.ViewHolder>? =null

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: CardAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        recyclerInit()

//        layoutManager = LinearLayoutManager(this)
//
//        var recyclerView:RecyclerView = findViewById(R.id.recyclerViewAtas)
//        recyclerView.LayoutManager = layoutManager
//
//        adapter= CardAtasAdapter()
//        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }

    private fun recyclerInit(){
        recyclerView = findViewById(R.id.recyclerViewAtas)
        var data = ArrayList<CardAtas>()
        data.add(CardAtas("Math", R.drawable.ic_launcher_background, R.color.black))
        data.add(CardAtas("Math", R.drawable.ic_launcher_background, R.color.black))
        data.add(CardAtas("Math", R.drawable.ic_launcher_background, R.color.black))
        data.add(CardAtas("Math", R.drawable.ic_launcher_background, R.color.black))

        adapter = CardAdapter(data)


    }



}