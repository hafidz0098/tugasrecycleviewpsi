package com.example.tugasrecycleviewpsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var recyclerview: RecyclerView
    lateinit var adapter: MahasiswaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = adapter
    }

    private fun init(){
        recyclerview = findViewById(R.id.recyclerview)

        var data = ArrayList<Mahasiswa>()
        data.add(Mahasiswa(R.drawable.alfian, "Nama : Alfian Tri Wahyu","NIM : 205150201111049", "Prodi : Teknik Informatika"))
        data.add(Mahasiswa(R.drawable.alfian, "Nama : Hafidz","NIM : 205150201111064", "Prodi : Teknik Informatika"))
        data.add(Mahasiswa(R.drawable.alfian, "Nama : Patrick Juan","NIM : 20515020011106", "Prodi : Teknik Informatika"))

        adapter = MahasiswaAdapter(data)
    }
}