package banco;

import lombok.Getter;

@Getter
public class ContaEsp extends Conta {

	private double limite;

	public ContaEsp(String nome, int numero, int agencia, double saldo, double limite) {
		super(nome, numero, agencia, saldo);
		this.limite = limite;
	}

	@Override
	public boolean saque(double valorSaque) {
		if (getSaldo() + getLimite() >= valorSaque) {
			saldo = getSaldo() - valorSaque;
			return true;
		}
		return false;
	}
}
