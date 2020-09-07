package br.com.dh.exc2

class SessaoDeTreinamento(var experiencia: Int) {
    //met
    fun treinarA(jogador: JogadorDeFutebol) {
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()

        println("Experiência Inicial: ${jogador.experiencia}")
        jogador.experiencia += this.experiencia
        println("Experiência Final: ${jogador.experiencia}")
    }
}