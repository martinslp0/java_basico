package br.com.trier.farmacia;

import java.util.List;
import java.util.ArrayList;

public class Farmacia {

	private List<Vendas> vendas = new ArrayList<Vendas>();
	
	public void vender(Clientes cliente, Produtos produto, int qnt, String medico) {
		Vendas v = new Vendas(cliente, produto, qnt, medico);
		if(produto.vender(v))
			vendas.add(v);
	}
}
