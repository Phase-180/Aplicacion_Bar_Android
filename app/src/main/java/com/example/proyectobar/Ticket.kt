package com.example.proyectobar

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class Ticket  : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_ticket)




        val listaProductos: List<Producto> = listOf(
            Producto("FOIE DE OCA",45.5),
            Producto("PROVOLONE",45.5),
            Producto("QUESO ROMERO",45.5),
            Producto("SALMÓN Y GAMBAS",45.5),
            Producto("AJETES",45.5)
        )
        val arrayMesas = listOf(
            Mesa(1,4),
            Mesa(2,5),
            Mesa(3,5)
        )




        arrayMesas[0].productos.addAll(listaProductos)
        arrayMesas[1].productos.addAll(listaProductos)
        arrayMesas[2].productos.addAll(listaProductos)

        val spinnerMesas: Spinner = findViewById(R.id.spinnerMesas)
        val adapterDos = ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayMesas)
        adapterDos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerMesas.adapter = adapterDos



        val btnticketicket: Button = findViewById(R.id.btnSacarTicket)
        btnticketicket.setOnClickListener {
            val selectedMesa = spinnerMesas.selectedItem as? Mesa
            selectedMesa?.let {
                val numeroMesa = it.numeroMesa
                val numeroComensales = it.numeroComensales
                val productos = it.productos.joinToString(", ") { producto -> producto.nombre }


                AlertDialog.Builder(this)
                    .setTitle("Detalles de la mesa")
                    .setMessage("Mesa seleccionada: $numeroMesa - Comensales: $numeroComensales - Productos: $productos")
                    .setPositiveButton("Aceptar") { dialog, _ ->
                        dialog.dismiss()
                    }
                    .show()
            } ?: run {
                Toast.makeText(this, "Por favor, selecciona una mesa", Toast.LENGTH_SHORT).show()
            }

        }
        }
    }

