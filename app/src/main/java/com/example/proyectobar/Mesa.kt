package com.example.proyectobar


class Mesa(val numeroMesa: Int, val numeroComensales: Int ,  val productos: MutableList<Producto> = mutableListOf()){



    override fun toString(): String {

        return "Número de mesa $numeroMesa "
    }
}
