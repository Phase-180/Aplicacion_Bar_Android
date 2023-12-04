package com.example.proyectobar

class Producto(val nombre: String, val precio: Double) {
    override fun toString(): String {
        return "$nombre - Precio: $precio €"
    }


}