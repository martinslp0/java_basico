package banco;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Conta {

	private String nome;
	private int numero;
	private int agencia;
	protected double saldo;

	public double verificarSaldo(Conta conta) {
		return getSaldo();
	}

	public boolean saque(double valorSaque) {
		if (getSaldo() >= valorSaque) {
			saldo = getSaldo() - valorSaque;
			return true;
		}
		return false;
	}

	public boolean deposito(double valorDeposito) {
		if (valorDeposito > 0) {
			saldo = getSaldo() + valorDeposito;
			return true;
		}
		return false;
	}

	public boolean transferencia( Conta contaDestino, double valorTransf) {
		if (saque(valorTransf)) {
			if (contaDestino.deposito(valorTransf)) {
				return true;
			} else {
				deposito(valorTransf);
				return false;
			}
		} return false;
	}

}
