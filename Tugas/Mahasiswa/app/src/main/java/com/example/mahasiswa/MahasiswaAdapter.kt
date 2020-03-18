package com.example.mahasiswa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MahasiswaAdapter(val slideList: ArrayList<Mahasiswa>):
    RecyclerView.Adapter<MahasiswaAdapter.ViewHolder>() {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user: Mahasiswa = slideList[position]
        holder.textViewName.text = user.nama
        holder.textViewNumber.text = user.nomor
        holder.textViewAddress.text = user.alamat
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.list_mahasiswa, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return slideList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
        val textViewName = itemView.findViewById(R.id.textViewName) as TextView
        val textViewNumber = itemView.findViewById(R.id.textViewNumber) as TextView
        val textViewAddress = itemView.findViewById(R.id.textViewAddress) as TextView
    }
}