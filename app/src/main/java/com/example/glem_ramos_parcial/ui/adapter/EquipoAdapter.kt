package com.example.glem_ramos_parcial.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.glem_ramos_parcial.R
import com.example.glem_ramos_parcial.ui.model.EquipoModel

class EquipoAdapter(private var lstEquipos: List<EquipoModel>):
        RecyclerView.Adapter<EquipoAdapter.ViewHolder>(){
            class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
                val ivEquipo = itemView.findViewById<ImageView>(R.id.ivEquipo)
                val tvMarca = itemView.findViewById<TextView>(R.id.tvMarca)
                val tvModelo = itemView.findViewById<TextView>(R.id.tvModelo)
                val tvPrecio = itemView.findViewById<TextView>(R.id.tvPrecio)


            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_equipos,parent,false))

    }

    override fun getItemCount(): Int {
        return lstEquipos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val equipo = lstEquipos[position]
        holder.ivEquipo.setImageResource(equipo.image)
        holder.tvMarca.text = equipo.marca
        holder.tvModelo.text = equipo.modelo
        holder.tvPrecio.text = equipo.precio
            }


}