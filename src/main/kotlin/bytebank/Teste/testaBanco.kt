package main.kotlin.bytebank

import main.kotlin.bytebank.Modelo.Banco


fun testaBanco(){

    val banco = Banco(
        nome = "ByteBank",

        numero = 1333
    )
    println(banco.nome)



}