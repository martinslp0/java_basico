package br.com.trier.farmacia;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public class Produtos {
	
	private String nome;
	private int estoque;
	private double valor;

	public boolean vender(Vendas valor) {
		if(estoque > 0) {
			estoque = getEstoque() - valor.getQnt();
			valor.getCliente().addDivida(valor.getQnt() * getValor());
			return true;
		}
		return false;
	}
}
