fun main() {

    println("Bem vindo ao Bytebank")


//    var lista = arrayOf(geraConta(2))
//    println(lista)


    val contaAlex = Conta()
    contaAlex.titular = "lelek"
    contaAlex.numero = 1000
    contaAlex.saldo = 500.0
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    contaAlex.deposita(150.0)//chamando como objeto
    println("Saldo atual: ${contaAlex.saldo}")

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 230.0
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    contaFran.deposita( 15.0)



    println("Saldo atual: ${contaFran.saldo}")



    contaFran.saque(405.0)
}

class Conta(){

    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita (valor: Double){// transformando em método
        this.saldo += valor
    }
    fun saque (valor: Double){
        if (this.saldo>=valor){
            println("Operação de saque selecionada...")
            this.saldo-=valor
            println("Saldo atual $saldo")
            if (saldo == 0.0){
                println("Seu saldo está zerado")
            }
        }
            else{
                println("Saldo insuficiente")
            }


    }

}

fun geraConta(numero:Int) {
    for (i in 1..numero) {
        println(1235+i)

    }
    println()
}
fun testaLacos(){
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