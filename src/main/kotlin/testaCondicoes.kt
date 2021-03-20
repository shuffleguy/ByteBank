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
