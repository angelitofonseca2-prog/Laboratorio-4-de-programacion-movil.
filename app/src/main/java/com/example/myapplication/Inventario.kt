package com.example.myapplication

import java.util.Scanner

data class Producto(val id: String, val nombre: String, val precio: Double)

fun main() {
    val lector = Scanner(System.`in`)
    println("--- Registro de inventario Kotlin ---")
    print("Ingrese ID del producto: ")
    val idInput = lector.next()
    print("Ingrese Nombre del producto: ")
    val nombreInput = readLine()!!

    print("Ingrese el precio: ")
    val precioInput = lector.nextDouble()
    val p1 = Producto(idInput, nombreInput, precioInput)
    val categoria = when {
        p1.precio > 500.0 -> "Premium"
        p1.precio in 100.0..500.0 -> "Estandar"
        else -> "Economico"
    }
    println("\nProducto Registrado con exito:")
    println(p1)
    println("Categoria asignada: $categoria")
    val p2 = Producto(idInput, nombreInput, precioInput)
    println("\n¿Contenido indentido?: ${p1 == p2}")
}
