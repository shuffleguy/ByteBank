fun testaLacos() {
    var i = 0

    while (i < 5) {
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
