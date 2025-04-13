package dev.leandro.pureFunctions

fun main() {
    val shape = Shape(10f, 10f)

    shape.slice(2) // 50.0

    shape.width = 3f
    shape.height = 4f

    shape.slice(2) // 6.0
}


data class Shape(var width: Float, var height: Float) {
    fun slice(times: Int): Float {
        return (this.width * this.height) / times
    }
}