package com.example.proyectobar

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectobar.databinding.ActivityMainBinding

class Menus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycle.adapter = MenuAdaptar(
            listOf(
                Menu("CROQUETAS VARIADAS", "https://www.bodeguitasantonioromero.com/wp-content/uploads/2019/09/croquetas-1200x800.jpg"),
                Menu("BUÑUELOS DE CHORIZO", "https://www.bodeguitasantonioromero.com/wp-content/uploads/2019/09/Bunuelos_de_chorizo-1200x800.jpg"),
                Menu("CALABACÍN RELLENO", "https://www.bodeguitasantonioromero.com/wp-content/uploads/2019/09/calabacin-relleno-1200x800.jpg"),
                Menu("PECHUGA BECHAMEL", "https://www.bodeguitasantonioromero.com/wp-content/uploads/2019/09/pechuga-bechamel-1200x800.jpg"),
                Menu("PAVÍAS DE BACALAO", "https://www.bodeguitasantonioromero.com/wp-content/uploads/2019/09/pavia.bacalao-1200x800.jpg"),
                Menu("BACALAO FRITO", "https://www.bodeguitasantonioromero.com/wp-content/uploads/2019/09/bacalao-frito-1200x800.jpg"),
                Menu("CHOCOS FRITOS", "https://www.bodeguitasantonioromero.com/wp-content/uploads/2019/09/chocofrito-1200x800.jpg"),
                Menu("QUESO VIEJO", "https://www.bodeguitasantonioromero.com/wp-content/uploads/2019/09/queso-1200x800.jpg"),
                Menu("SALCHICHÓN", "https://www.bodeguitasantonioromero.com/wp-content/uploads/2019/09/salchichon-de-vic-1200x800.jpg"),
                Menu("FOIE DE OCA", "https://www.bodeguitasantonioromero.com/wp-content/uploads/2019/09/foie-de-oca-1200x800.jpg"),
                Menu("PROVOLONE", "https://www.bodeguitasantonioromero.com/wp-content/uploads/2019/09/provolone-1200x800.jpg"),
                Menu("DEL CHEF", "https://www.bodeguitasantonioromero.com/wp-content/uploads/2019/09/revuelto-del-chef-1200x800.jpg")

            ),
            object : MenuClickedListener{
                override fun onMovieClick(menu: Menu) {
                    Toast.makeText(this@Menus, menu.title, Toast.LENGTH_SHORT).show()
                }
            }
        )
    }

    override fun onDestroy() {
        super.onDestroy()


        Log.d("MainActivity", "onCreate")
    }
}