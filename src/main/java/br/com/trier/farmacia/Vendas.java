package br.com.trier.farmacia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
public class Vendas {
	@NonNull
	private Clientes cliente;
	@NonNull
	private Produtos produto;
	@NonNull
	private int qnt;
	private String medico;
	

}
