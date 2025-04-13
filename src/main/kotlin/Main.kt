package dev.leandro

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val lista = listOf<Int>(1,3,5)
    println(lista.all{ it%2==1 })

    val lista2 = listOf<Int>(2,4,5)
    println(lista2.any{ it%2==1 })

    val lista3 = listOf<Int>(2,3,5)
    println(lista3.count{ it%2==1 })

    val lista4 = listOf<String>("abc","ids","cavalo")
    println(lista4.distinctBy{ it.length })

    val lista5 = listOf<Int>(1,2,3,5)
    println(lista5.filter{ it%2==1 })

    val lista6 = listOf<Int>(0,2,10)
    val soma = lista6.
    fold(0, {acc, i -> acc + i})
    println(soma)

    val lista7 = listOf<String>("abc","ids","cavalo")
    println(lista7.groupBy{ it.length })

    val lista8 = listOf<String>("abc","ids","cavalo")
    println(lista8.map{ it+"!" })

    val lista9 = listOf<String>("abc","ids","cavalo")
    println(lista9.partition {it.length % 2 == 0})

    val lista10 = listOf<Int>(2,10)
    val somasParciais = lista10.
    scan(0, {acc, i -> acc + i})
    println(somasParciais)

    val lista11 = listOf<Int>(-1,2,-3)
    println(lista11.sortedBy{ if (it<0) it else -it })

    val listaString = listOf<String>("abc", "paulo", "ids", "cavalo")
    val listaInt = listOf<Int>(2,1,3)
    val listaCombinada = listaString.zip(listaInt) { str, i ->
        str + i.toString()
    }
    println(listaCombinada)

    val nomes = listOf<String>("paulo", "caio", "outro nome")
    nomes.forEach {
        println("Oi, $it!")
    }
}