fun main() {

    println("Bem vindo ao Bytebank")
    var i = 0

    while ( i < 5){
        val titular: String = "$i"
        val numeroConta: Int = 0 + i
        var saldo: Double = 0.0
        println("Titular $titular")//String Template
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }
    }




//    for (i in 1 .. 10) {//for (i in 5 downTo 1 step 2) {para criar decrescente
//
//        if (i==5){
//            break
//        }
//
//        val titular: String = "$i"
//        val numeroConta: Int = 0 + i
//        var saldo: Double = 0.0
//
////        saldo = 100.toDouble()//conversão para double
////        saldo += 200
////        saldo = -1.0
//
//
//
//        println("Titular $titular")//String Template
//        println("numero da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//
//}
//
//
////        testaCondicoes(saldo)
//
//    }

    fun testaCondicoes(saldo: Double) {//aplicação do paramentro
// utilizar variável pois if e when chamam

        if (saldo > 0.0) {
            println("Conta está positiva")

        } else if (saldo == 0.0) {

            println("Conta está zerada")

        } else {

            println("Está negativada")
        }
        when {
            saldo > 0.0 -> println("Conta está positiva")
            saldo == 0.0 -> println("Conta está zerada")
            else -> println("Está negativada")
        }

    }