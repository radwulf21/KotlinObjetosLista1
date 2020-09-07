package br.com.dh.exc3

class Exercicio3 {

}

fun main() {
    val atleta1 = Atleta("Raul", 8, 70)
    val atleta2 = Atleta("Alexandre", 6, 80)

    val prova1 = Prova(5, 60)
    val prova2 = Prova(6, 90)
    val prova3 = Prova(8, 70)
    println(prova1.podeRealizar(atleta1))
    println(prova2.podeRealizar(atleta1))
    println(prova3.podeRealizar(atleta1))

    val prova4 = Prova(7, 50)
    val prova5 = Prova(4, 70)
    val prova6 = Prova(6, 85)
    println(prova4.podeRealizar(atleta2))
    println(prova5.podeRealizar(atleta2))
    println(prova6.podeRealizar(atleta2))
}