fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(valor = 1000.0)
    contaPoupanca.deposita(valor = 1000.0)

    contaCorrente.saca(valor = 100.0)
    contaPoupanca.saca(valor = 100.0)

    println(contaCorrente.saldo)
    println(contaPoupanca.saldo)

    contaCorrente.transfere(valor = 100.0, destino = contaPoupanca)

    println(contaCorrente.saldo)
    println(contaPoupanca.saldo)

    contaPoupanca.transfere(valor = 100.0, destino = contaCorrente)

    println(contaCorrente.saldo)
    println(contaPoupanca.saldo)
}
