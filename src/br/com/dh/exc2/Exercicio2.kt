package br.com.dh.exc2

class Exercicio2 {

}

fun main() {
    val jogador1 = JogadorDeFutebol("Cristiano Ronaldo", 100, 45, 50, 60)
    val jogador2 = JogadorDeFutebol("Lionel Messi", 100, 65, 50, 60)
    val sessao1 = SessaoDeTreinamento(10)
    val sessao2 = SessaoDeTreinamento(15)

    println("${jogador1.nome}:")
    sessao1.treinarA(jogador1)
    jogador1.status()

    println("---------------------")

    println("${jogador2.nome}:")
    sessao2.treinarA(jogador2)
    jogador2.status()
}