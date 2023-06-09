package br.com.trier.banco;

import lombok.Getter;

@Getter
public class ContaUniv extends Conta {


	public ContaUniv(String nome, int numero, int agencia, double saldo) {
		super(nome, numero, agencia, saldo);
	}

	@Override
	public boolean deposito(double valorDeposito) {
		if (2000 >= valorDeposito + getSaldo()) {
			return super.deposito(valorDeposito);
		}
		return false;
	}

}
