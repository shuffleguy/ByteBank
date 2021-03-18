class ContaExemplo() {

    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double) {
        if (valor >= 0.0) {
            this.saldo = valor
        } else {
            println("Não se pode setar negativo")

        }
    }
}