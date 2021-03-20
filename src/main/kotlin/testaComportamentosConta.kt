fun testaComportamentosConta() {

//    var lista = arrayOf(geraConta(2))
//    println(lista)


    val contaAlex = Conta(titular = "Alex", numero = 1000)// pode ser feito por labels

    contaAlex.deposita(500.0)
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

//    contaAlex.deposita(150.0)//chamando como objeto
//    println("Saldo atual: ${contaAlex.saldo}")


    val contaFran = Conta("Fran", 1001)
    contaFran.deposita(230.0)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

//    contaFran.deposita( 15.0)
//    println("Saldo atual: ${contaFran.saldo}")
//
//    contaFran.saque(405.0)
//
//    if (contaAlex.transfere(100.0,contaFran)){
//        println("Transferencia sucessida")
//        }else
//            println("saldo insuficiente")
}