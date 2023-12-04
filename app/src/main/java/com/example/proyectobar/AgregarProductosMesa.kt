package com.example.proyectobar

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AgregarProductosMesa  : AppCompatActivity() {

    private lateinit var spinnerMesas: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_productos)
        val listaProductos: List<Producto> = listOf(
            Producto("FOIE DE OCA",9.75),
            Producto("PROVOLONE",10.2),
            Producto("QUESO ROMERO",12.6),
            Producto("SALMÓN Y GAMBAS",8.3),
            Producto("AJETES",4.75)
        )

        val arrayMesas = listOf(
            Mesa(1,4),
            Mesa(2,5),
            Mesa(3,5)

        )



        val spinnerProductos: Spinner = findViewById(R.id.spinnerProductos)
        val adapterProductos = ArrayAdapter(this, android.R.layout.simple_spinner_item, listaProductos)
        adapterProductos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerProductos.adapter = adapterProductos

        val spinnerMesa: Spinner = findViewById(R.id.spinnerMesas)
            val adapterMesa = ArrayAdapter(this, android.R.layout.simple_spinner_item, arrayMesas)
        adapterMesa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerMesa.adapter = adapterMesa

        val btnAnadir: Button = findViewById(R.id.btnAnadir)
        btnAnadir.setOnClickListener {

            Toast.makeText(this, "Producto añadido a la cuenta", Toast.LENGTH_LONG).show()
        }

        val btnTerminarComanda: Button = findViewById(R.id.btnTerminarComanda)
        btnTerminarComanda.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}