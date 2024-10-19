package com.example.glem_ramos_parcial.ui.Equipos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.glem_ramos_parcial.R
import com.example.glem_ramos_parcial.ui.adapter.EquipoAdapter
import com.example.glem_ramos_parcial.ui.model.EquipoModel


class EquiposFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_equipos, container,false)
        val rvEquipos = view.findViewById<RecyclerView>(R.id.rvEquipos   )
        rvEquipos.layoutManager = LinearLayoutManager(requireContext())
        rvEquipos.adapter = EquipoAdapter(getEquipos())
        return view

    }
    private fun getEquipos(): List<EquipoModel>{
        val lstEquipo: ArrayList<EquipoModel> = ArrayList()
        lstEquipo.add(EquipoModel(1, R.drawable.laptop, "HP", "fdl008LA", "$3999"))
                lstEquipo.add(EquipoModel(2, R.drawable.laptop2, "Lenovo", "ideaPad 0x1", "$2999"
        ))
        lstEquipo.add(EquipoModel(2, R.drawable.asus, "Asus", "M415", "$4999"
        ))
        return lstEquipo
    }



}