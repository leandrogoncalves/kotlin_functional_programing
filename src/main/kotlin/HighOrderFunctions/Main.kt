package dev.leandro.HighOrderFunctions

fun criarMultiplicador(fator: Int): (Int) -> Int {
    // Retorna uma lambda que usa o fator capturado
    return { numero -> numero * fator }
}

// Uso:
fun main() {
    val multiplicarPor5 = criarMultiplicador(5)
    val resultado = multiplicarPor5(10)
    println(resultado) // Imprime 50

    val triplicar = criarMultiplicador(3)
    println(triplicar(7)) // Imprime 21

    val dobrar = criarMultiplicador(2)(100)
    println(dobrar)
}