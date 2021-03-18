fun main(){
val contaJoao = Conta("João", 1003)
    contaJoao.titular = "João"
    var contaMaria = contaJoao //copia a referencia do local e não os métodos
    contaMaria.titular = "Maria"

    println("Conta João = ${contaJoao.titular}")
    println("Conta João = ${contaMaria.titular}")

    println(contaJoao == contaMaria)



}