package com.example.reponsi_bp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class PenjelasanLayout : AppCompatActivity() {
    private lateinit var  txtJudul:TextView
    private lateinit var txtDesk:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penjelasan_layout)

        getSupportActionBar()!!.setDisplayHomeAsUpEnabled(true);
        txtJudul = findViewById(R.id.txtnama)
        txtDesk = findViewById(R.id.txtDeskGuru)




        txtJudul.text = intent.getStringExtra("judul")
        txtDesk.text = intent.getStringExtra("desk")
    }
}