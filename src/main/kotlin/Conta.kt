class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set // não se pode setar saldo

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
        // transformando em método

    }

    fun saque(valor: Double) {
        if (this.saldo >= valor) {
            println("Operação de saque selecionada...")
            this.saldo -= valor
            println("Saldo atual $saldo")
            if (saldo == 0.0) {
                println("Seu saldo está zerado")
            }
        }
        return println("Saldo insuficiente")//else desnecessário
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            println("saldo atual: ${this.saldo}")
            println("transferindo: $valor")
            destino.saldo += valor
            return true
        }
        return false
    }
    fun geraConta(numero: Int) {
        for (i in 1..numero) {
            println(1235 + i)

        }
        println()
    }

}