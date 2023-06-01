package banco;

import lombok.Getter;

@Getter
public class ContaUniv extends Conta {

	private int limiteMax = 2000;

	public ContaUniv(String nome, int numero, int agencia, double saldo) {
		super(nome, numero, agencia, saldo);
	}

	@Override
	public boolean deposito(double valorDeposito) {
		if (getLimiteMax() >= valorDeposito + getSaldo()) {
			return super.deposito(valorDeposito);
		}
		return false;
	}

}
