package br.com.trier.banco;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Conta {

	private String nome;
	private int numero;
	private int agencia;
	protected double saldo;

	public boolean saque(double valorSaque) {
		if (saldo >= valorSaque) {
			saldo = saldo - valorSaque;
			return true;
		}
		return false;
	}

	public boolean deposito(double valorDeposito) {
		saldo = saldo + valorDeposito;
		return true;
	}

	public boolean transferencia(String contaOrigem, String contaDestino, double valorTransf) {
		if (saque(valorTransf) == true) {
			deposito(valorTransf);
			return true;
		} else if (deposito(valorTransf) == false) {
			saldo = saldo + valorTransf;
			return false;
		}
		return false;
	}

}
