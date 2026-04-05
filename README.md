# Laboratorio 4 — Inventario seguro (Programación móvil)

Proyecto Android (Kotlin) del **Grupo 1**: práctica de **tipos seguros**, **`val` / `var`**, **nulidad (`?`)**, **operador Elvis (`?:`)**, **plantillas de cadena**, **validación de entradas** (`toDoubleOrNull()`) y registro por consola con **`data class`** y **`when`**.

**Repositorio:** [Laboratorio-4-de-programacion-movil.](https://github.com/angelitofonseca2-prog/Laboratorio-4-de-programacion-movil.)

---

## Requisitos

- [Android Studio](https://developer.android.com/studio) (recomendado: versión reciente compatible con el proyecto)
- **JDK 21** (según configuración Gradle del módulo `app`)
- Conexión a Internet la primera vez para **Sync Project with Gradle Files**

---

## Estructura relevante

| Ruta | Descripción |
|------|-------------|
| `app/src/main/java/com/example/myapplication/InventoryManager.kt` | Inventario simulado: producto, IVA, Elvis en descripción, venta, reporte multilínea y **validador de precio dinámico** (entrada texto → `toDoubleOrNull()` + `?: 0.0`). |
| `app/src/main/java/com/example/myapplication/Inventario.kt` | Registro interactivo por consola: `Scanner`, `data class Producto`, categoría **Premium / Estandar / Economico** con **`when`**, comparación de instancias. |
| `settings.gradle.kts` | Nombre del proyecto Gradle: **InventarioSeguro**. |

---

## Cómo ejecutar la lógica Kotlin (consola)

En este laboratorio hay **dos** funciones `main()` en el mismo paquete. Cada una se ejecuta por separado:

1. Abre el archivo **`.kt`** en el editor.
2. Haz clic en el **triángulo verde** del margen izquierdo, **en la línea** de `fun main() {`.
3. Elige **Run 'InventoryManagerKt'** o **Run 'InventarioKt'** (no uses solo el botón **Run** grande de la barra si lo que quieres es la salida por **println** en la pestaña **Run** inferior; el Run global suele lanzar la app en el emulador).

### `InventoryManager.kt`

- Muestra datos de carga, producto, descripción sustituida si es `null`, línea del desafío 2 y el **reporte de inventario** (precio con IVA, stock, estado Suficiente/Crítico).
- Para probar el validador: cambia `inputUsuario` entre un número en texto (ej. `"650.50"`) y un texto no numérico (ej. `"No quiero pagar"`) y vuelve a ejecutar.

### `Inventario.kt`

- Pide por teclado **ID**, **nombre** y **precio**; crea un `Producto` y muestra la **categoría** según el precio.
- La ejecución es interactiva: escribe los valores en la pestaña **Run** cuando el programa los solicite.
---
