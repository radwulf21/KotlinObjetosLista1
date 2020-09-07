package br.com.dh.exc3

class Prova(var dificuldade: Int, var energiaNecessaria: Int) {
    fun podeRealizar(atleta: Atleta): Boolean {
        return atleta.nivel >= this.dificuldade && atleta.energia >= this.energiaNecessaria
    }
}