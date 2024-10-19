package com.example.glem_ramos_parcial.ui.Tareas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.glem_ramos_parcial.R


class TareasFragment : Fragment() {

    var arrSo = arrayOf(
        "Salir a pasear", "Caminar", "Hacer las compras", "Ir a la universidad",
        "Lavar el auto"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_tareas, container, false)
        val lstTareas: ListView = view.findViewById(R.id.lstTareas)
        val adaptador = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1, arrSo )

        lstTareas.adapter =adaptador
        return view
    }


}