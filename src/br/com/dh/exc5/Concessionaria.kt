package br.com.dh.exc5

class Concessionaria {
    var registroDeVendas = arrayListOf<Venda>()

    fun registrarVenda(venda: Venda) {
        this.registroDeVendas.add(venda)
    }
}