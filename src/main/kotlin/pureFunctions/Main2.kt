package dev.leandro.pureFunctions

fun main() {
    val shape = Shape2(10f, 10f)

    slice(shape.width, shape.height, 2) // 50.0

    shape.width = 3f
    shape.height = 4f

    slice(shape.width, shape.height, 2) // 6.0
}

data class Shape2(var width: Float, var height: Float)

fun slice(width: Float, height: Float, times: Int): Float {
    return (width * height) / times
}