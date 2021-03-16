fun main() {

//cria 5 contas
    for (i in 1..5) {
        println(i)

    }
    println()
//cria 5 contas na ordem decrescente
    for (i in 5 downTo 1) {
        println(i)

    }
    println()

//cria 3 contas de 2 em 2
    for (i in 1..5 step 2) {
        println(i)
    }
    println()
    for (i in 1 until 5) {
        println(i)
    }
    println()


    loop@ for (i in 1..100) {
        println("i $i")
        println("*")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
}