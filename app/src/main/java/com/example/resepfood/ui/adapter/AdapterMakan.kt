package com.example.resepfood.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.resepfood.R
import com.example.resepfood.ui.model.Makanan

class AdapterMakan(var data:ArrayList<Makanan>):RecyclerView.Adapter<AdapterMakan.Holder>() {

    var onItemClick :  ((Makanan) -> Unit)? = null

    class Holder (view: View):RecyclerView.ViewHolder(view){
        val tv_nama = view.findViewById<TextView>(R.id.tv_nama)
        val tv_item = view.findViewById<TextView>(R.id.tv_item)
        val img_makan = view.findViewById<ImageView>(R.id.img_makan)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.item_makan, parent, false)

        return Holder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder.tv_nama.text = data[position].nama
        holder.tv_item.text = data[position].desc
        holder.img_makan.setImageResource(data[position].gambar)

    }
}