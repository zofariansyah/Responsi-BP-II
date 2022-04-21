package com.example.reponsi_bp

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reponsi_bp.horizontalcard.CardHorizontal
import com.example.reponsi_bp.horizontalcard.CardHorizontalAdapter
import com.example.reponsi_bp.recommend.CardAdapter
import com.example.reponsi_bp.recommend.CardAtas

class MainActivity : AppCompatActivity() {
//    private var layoutManager:RecyclerView.LayoutManager? = null
//    private var adapter:RecyclerView.Adapter<CardAtasAdapter.ViewHolder>? =null

    lateinit var recyclerView: RecyclerView
    lateinit var recyclerViewHorizontal: RecyclerView
    lateinit var adapter: CardAdapter
    lateinit var adapterHorizontal: CardHorizontalAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportActionBar?.hide()
         recyclerInit()
        recyclerHorizonInit()

//
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        recyclerViewHorizontal.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewHorizontal.adapter = adapterHorizontal

    }

    private fun recyclerInit(){
        recyclerView = findViewById(R.id.recyclerViewAtas)
        var data = ArrayList<CardAtas>()
        data.add(CardAtas("Guru Matematika", "Deskripsi Matematika",R.drawable.boy1, R.color.black))
        data.add(CardAtas("Guru IPA", "Deskripsi IPA",R.drawable.boy1, R.color.black))
        data.add(CardAtas("Guru B Indo", "Deskripsi B Indo\"",R.drawable.girl, R.color.black))
        data.add(CardAtas("Gurumuuu", "Deskripsi Gurumuuu",R.drawable.boy2, R.color.black))

        adapter = CardAdapter(data)


    }

    private fun recyclerHorizonInit(){
        recyclerViewHorizontal = findViewById(R.id.recyclerViewAtasHorizontal)
        var data = ArrayList<CardHorizontal>()
        data.add(CardHorizontal("Math", applicationContext.getString(R.string.lorem)  ,R.drawable.icon1, R.color.lightBlue))
        data.add(CardHorizontal("Fisika", applicationContext.getString(R.string.lorem) ,R.drawable.icon2, R.color.yellow))
        data.add(CardHorizontal("IPA",  applicationContext.getString(R.string.lorem) ,R.drawable.icon3, R.color.pink))
        data.add(CardHorizontal("Baper II",  applicationContext.getString(R.string.lorem) ,R.drawable.icon1, R.color.yellow))

        adapterHorizontal = CardHorizontalAdapter(data)


    }


}