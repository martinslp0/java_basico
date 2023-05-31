package br.com.trier.banco;

import lombok.Getter;

@Getter
public class ContaUniv extends Conta {

	private int limiteMax = 2000;

	public ContaUniv(String nome, int numero, int agencia, double saldo) {
		super(nome, numero, agencia, saldo);
	}

	@Override
	public boolean deposito(double valorDeposito) {
		if (!(limiteMax == saldo && limiteMax > valorDeposito + saldo)) {
			saldo = saldo + valorDeposito;
			return true;
		}
		return false;
	}

	@Override
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
