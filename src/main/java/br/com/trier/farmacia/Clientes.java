package br.com.trier.farmacia;

import lombok.Getter;

@Getter
public class Clientes {
	
	private String nome;
	private double divida;
	
	 public double pagarDivida(double valor) {
		 if(divida > 0 && divida >= valor) {
			 divida = divida - valor;
		 }
		 return divida;
	 }
	 
	 public void addDivida(double valor) {
		 divida = getDivida() + valor;
	 }
}
