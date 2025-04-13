package dev.leandro.declarativeness

fun main() {
    val userOne = User(1, "João", "RJ")
    val userTwo = User(2, "Maria", "MG")
    val userThree = User(3, "José", "SP")
    val userFour = User(4, "Marta", "RJ")

    val users = listOf(userOne, userTwo, userThree, userFour)

    val usersFromRJ = users.filter { it.state == "RJ" }
    println(usersFromRJ)

    val usersGroupedByState = users.groupBy { it.state }
    println(usersGroupedByState)
}


data class User(var id: Int, var name: String, var state: String)