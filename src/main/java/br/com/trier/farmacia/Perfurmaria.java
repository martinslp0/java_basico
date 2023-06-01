package br.com.trier.farmacia;

import lombok.Getter;

@Getter
public class Perfurmaria extends Produtos {
	
	public Perfurmaria(String nome, int estoque, double valor){
		super(nome, estoque, valor);
	}

	@Override
	public boolean vender(Vendas venda) {
		if(venda.getCliente().getDivida() >= 300 && getEstoque() >= venda.getQnt()) {
			return super.vender(venda);
		}
		
		return false;
	}
}
