package br.com.trier.banco;

public class ContaEsp extends Conta {

	private double limite;

	public ContaEsp(String nome, int numero, int agencia, double saldo, double limite) {
		super(nome, numero, agencia, saldo);
		this.limite = limite;
	}

	@Override
	public boolean saque(double valorSaque) {
		if (limite < valorSaque + saldo) {
			saldo = saldo - valorSaque;
			return true;
		}
		return false;
	}

	@Override
	public boolean transferencia(Conta contaOrigem, Conta contaDestino, double valorTransf) {
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
