fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {

        println("saldo positivo: $saldo")
    } else if (saldo == 0.0) {
        println("Saldo zerado")
    } else {
        println("saldo negativo")
    }


    when {
        saldo > 0.0 -> {

            println("saldo positivo: $saldo")
        }
        saldo == 0.0 -> {
            println("Saldo zerado")
        }
        else -> {
            println("saldo negativo")
        }
    }
    when {
        saldo > 0.0 -> println("saldo positivo: $saldo")
        saldo == 0.0 -> println("Saldo zerado")
        else -> println("saldo negativo")
    }



    fun testaGetESet(saldo: Double) {
        fun getSaldo(): Double {
            return saldo //retorno somente de uma informação
        }

        fun setSaldo(valor: Double) {
            if (valor > 0) {
                val saldo = valor
            }
        }
    }
}
