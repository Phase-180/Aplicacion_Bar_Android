package com.example.proyectobar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_inicio)


        val btnComandas: Button = findViewById(R.id.btnComandas)
        btnComandas.setOnClickListener {

            val intent = Intent(this, AgregarProductosMesa::class.java)
            startActivity(intent)

        }
        val btnNuevoCliente: Button = findViewById(R.id.btnNuevoCliente)
        btnNuevoCliente.setOnClickListener {

            val intent = Intent(this, NuevoClient::class.java)
            startActivity(intent)

        }

        val btnMenu: Button = findViewById(R.id.btnMenu)
        btnMenu.setOnClickListener {

            val intent = Intent(this, Menus::class.java)
            startActivity(intent)

        }
        val btnTicketCliente: Button = findViewById(R.id.btnTicketCliente)
        btnTicketCliente.setOnClickListener {

            val intent = Intent(this, Ticket::class.java)
            startActivity(intent)

        }


    }
}