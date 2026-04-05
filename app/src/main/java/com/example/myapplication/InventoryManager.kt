package com.example.myapplication

fun main() {
    // 1. Definición de variables de producto
    val productId: Int = 101 // ID inmutable (no cambia)
    val productName: String = "Smartphone X1" // Nombre obligatorio (no nulo)
    var productDescription: String? = null // ? permite que sea nulo
    var stockQuantity: Int = 25 // Cantidad mutable (cambia con ventas)
    val unitPrice: Double = 599.99 // Precio base inmutable

    println("--- Datos Iniciales Cargados ---")

    // 2. Lógica de Impuestos + Desafío 2: validador de precio dinámico
    val TAX_RATE = 0.15 // IVA del 15%
    // Entrada simulada (pantalla del celular o API). Prueba B: "No quiero pagar"
    val inputUsuario: String? = "No quiero pagar"
    // Conversión segura: si falla (texto inválido, null, etc.) → 0.0 (la app no se cae)
    val precioDesdeEntrada = inputUsuario?.toDoubleOrNull() ?: 0.0
    val totalPriceWithTax = precioDesdeEntrada * (1 + TAX_RATE)
    println(
        "(Desafío 2) Entrada: \"${inputUsuario ?: "null"}\" → precio validado: " +
            "$precioDesdeEntrada | Total con IVA: $${String.format("%.2f", totalPriceWithTax)}"
    )


    // 3. Uso del Operador Elvis (?:)
    // Si productDescription es null, se asigna el texto de la derecha.
    val descriptionToShow = productDescription ?: "Sin descripción disponible"
    println("Producto: $productName")
    println("Descripción: $descriptionToShow")

    // 4. Simulación de Venta
    val itemsSold = 5
    stockQuantity -= itemsSold // Actualización de variable mutable

    // 5. Generación de Reporte con Plantilla de Cadena
    val report = """
        --- REPORTE DE INVENTARIO ---
        ID: $productId | Nombre: $productName
        Precio Final: $${String.format("%.2f", totalPriceWithTax)}
        Stock Actual: $stockQuantity
        Estado: ${if (stockQuantity > 10) "Suficiente" else "Crítico"}
        -----------------------------
    """.trimIndent()
    println(report)
}
