abstract class Conta(
        var titular: String,
        val numero: Int
    ) {
        var saldo = 0.0
            protected set//somente a classe e suas filhas conseguem setar

       fun deposita(valor: Double) {
            if (valor > 0) {
                this.saldo += valor
            }
        }

       abstract fun saca(valor: Double)
        //função geral, precisa ser implementada

       open fun transfere(valor: Double, destino: Conta): Boolean {

            if (this.saldo > 0 && saldo >= valor) {
                saldo -= valor
                destino.deposita(valor)//utilizando função para depósito
                return true
            }
            return false
        }
    }