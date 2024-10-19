package com.example.glem_ramos_parcial.ui.Gastos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.glem_ramos_parcial.R

class GastosFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_gastos,container, false)
        val etIF = rootView.findViewById<EditText>(R.id.etIF)
        val etGF = rootView.findViewById<EditText>(R.id.etGF)
        val etGV = rootView.findViewById<EditText>(R.id.etGV)
        val tvSaldo = rootView.findViewById<TextView>(R.id.tvSaldo)
        val btnCalcular = rootView.findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener{
            val ingresoFijo = etIF.text.toString()
            val gastoFijo = etGF.text.toString()
            val gastoVariable = etGV.text.toString()

            if(ingresoFijo.isNotEmpty() && gastoFijo.isNotEmpty() && gastoVariable.isNotEmpty()){
                val ingresof = ingresoFijo.toDouble()
                val gastof = gastoFijo.toDouble()
                val gastov = gastoVariable.toDouble()

                if(ingresof>0 && gastof >0 && gastov >0){
                    val saldo = ingresof - (gastof + gastov)
                    tvSaldo.text = "$saldo"
                }else{
                    tvSaldo.text = "Ingrese valores validos"

                }

            }

        }
        return rootView

    }


}