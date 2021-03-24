fun testaComportamentosConta() {
    val contaAlex = ContaCorrente(titular = "Alex", numero = 1000)

    contaAlex.deposita(valor = 200.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    val contaFran = ContaPoupanca(titular = "Fran", numero = 1001)

    contaFran.deposita(valor = 300.0)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    val contaJoao = ContaCorrente(titular = "joao", numero = 1002)
    val contaMaria = ContaPoupanca(titular = "Maria", numero = 1003)
}
