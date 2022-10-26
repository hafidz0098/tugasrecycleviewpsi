package com.example.tugasrecycleviewpsi

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.card_view, parent, false)){

    private var foto: ImageView? = null
    private var nama: TextView? = null
    private var nim: TextView? = null
    private var prodi: TextView? = null

    init {
        foto = itemView.findViewById(R.id.foto)
        nama = itemView.findViewById(R.id.nama)
        nim = itemView.findViewById(R.id.nim)
        prodi = itemView.findViewById(R.id.prodi)
    }

    fun bind(data: Mahasiswa){
        foto?.setImageResource(data.foto)
        nama?.text = data.nama
        nim?.text = data.nim
        prodi?.text = data.prodi
    }
}