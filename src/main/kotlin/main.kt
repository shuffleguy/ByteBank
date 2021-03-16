fun main() {

    println("Bem vindo ao Bytebank")

    geraConta(2)


    val contaAlex = Conta()
    contaAlex.titular = "lelek"
    contaAlex.numero = 1000
    println(contaAlex.titular)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    println(contaFran.titular)
}

class Conta(){

    var titular = ""
    var numero = 0
    var saldo = 0.0

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