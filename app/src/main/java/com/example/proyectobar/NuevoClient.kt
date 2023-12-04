package com.example.proyectobar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NuevoClient : AppCompatActivity() {

    val mesas = mutableListOf<Mesa>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_nuevo_cliente)

        // Obtener referencias a los EditText y al Button dentro del método onCreate
        val editTextNumeroMesa: EditText = findViewById(R.id.textNumeroMesa)
        val editTextNumeroComensales: EditText = findViewById(R.id.textNumeroComensales)
        val btnAgregarMesa: Button = findViewById(R.id.btnAgregarMesa)

        // Configurar el OnClickListener para el botón
        btnAgregarMesa.setOnClickListener {
            // Obtener el texto ingresado en los EditText
            val numeroMesaString = editTextNumeroMesa.text.toString()
            val numeroComensalesString = editTextNumeroComensales.text.toString()

            // Verificar si los campos no están vacíos
            if (numeroMesaString.isNotEmpty() && numeroComensalesString.isNotEmpty()) {
                // Convertir los textos a números enteros
                val numeroMesa = numeroMesaString.toInt()
                val numeroComensales = numeroComensalesString.toInt()

                // Crear una nueva mesa y agregarla al array
                val nuevaMesa = Mesa(numeroMesa, numeroComensales )

                mesas.add(nuevaMesa)

                // Limpiar los EditText después de agregar la mesa
                editTextNumeroMesa.text.clear()
                editTextNumeroComensales.text.clear()

                // Mostrar algún mensaje o actualizar la UI si es necesario
                // Por ejemplo:
                Toast.makeText(this, "Mesa agregada correctamente", Toast.LENGTH_SHORT).show()


            } else {
                // Mostrar un mensaje si algún campo está vacío
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
            }



            val btnComandas: Button = findViewById(R.id.btnComandas)
            btnComandas.setOnClickListener {

                val intent = Intent(this, AgregarProductosMesa::class.java)
                startActivity(intent)

            }

        }
    }

}
