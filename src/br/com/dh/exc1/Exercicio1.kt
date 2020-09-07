package br.com.dh.exc1

class Exercicio1 {

}

fun main() {
    val cliente1 = Cliente("Raul", "Andrade")
    val cliente2 = Cliente("Letícia", "Oliveira")
    val conta1 = Conta(1, 1000.0, cliente1)
    val conta2 = Conta(2, 1500.0, cliente2)

    conta1.deposito(500.0)
    conta1.saque(500.0)

    println("-----------------------------")

    conta2.deposito(500.0)
    conta2.saque(500.0)
}