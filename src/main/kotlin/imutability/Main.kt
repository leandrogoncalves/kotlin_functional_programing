package dev.leandro.imutability

fun main() {
    val user = User(1, "João", "RJ")
    val updatedUser = user.copy(state = "MG")

    println(user)
    println(updatedUser)
}

data class User(var id: Int, var name: String, var state: String)