fun main() {

    println("Bem vindo ao Bytebank")


//    var lista = arrayOf(geraConta(2))
//    println(lista)

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = contaJoao //copia a referencia do local e não os métodos
    contaMaria.titular = "Maria"

    println("Conta João = ${contaJoao.titular}")
    println("Conta João = ${contaMaria.titular}")

    println(contaJoao == contaMaria)





    val contaAlex = Conta()
    contaAlex.titular = "lelek"
    contaAlex.numero = 1000
    contaAlex.saldo = 500.0
    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 230.0
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
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