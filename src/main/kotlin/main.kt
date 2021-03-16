fun main(){

    println("Bem vindo ao Bytebank")

    val titular: String
    val numeroConta: Int = 1000
    var saldo: Double = 0.0

//    saldo = 100.toDouble()//conversão para double
//
//    saldo +=200
    saldo = -1.0

    titular = "Alex 'lelek' Felipe"

    println("Titular $titular")//String Template
    println("numero da conta $numeroConta")
    println("saldo da conta $saldo")

    if (saldo > 0.0){
        println("Conta está positiva")

    }else if (saldo == 0.0){

        println("Conta está zerada")

    }else{

        println("Está negativada")
    }

}