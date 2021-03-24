fun testaLacos() {
    var i = 0
    while (i < 5) { //enquanto i for menor que 5 ele roda tudo

        //var titular pode mudar
        val titular: String = "Alex $i" // não pode mudar
        val numeroConta: Int = 1000 + i
        //var saldo: Double = 0.0 pode ser feito decalrando o tipo ou não
        var saldo = i + 10.0

        println("titular  $titular") //string template
        println("Numero da conta $numeroConta")
        println("Saldo:   $saldo")
        println()

        i++

    }

    for (i in 5 downTo 1) {

        if (i == 4) {
            continue
        }
        //var titular pode mudar
        val titular: String = "Alex $i" // não pode mudar
        val numeroConta: Int = 1000 + i
        //var saldo: Double = 0.0 pode ser feito decalrando o tipo ou não
        var saldo = i + 10.0

        println("titular  $titular") //string template
        println("Numero da conta $numeroConta")
        println("Saldo:   $saldo")
        println()

    }
}
