package banco;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Caixa {

	List<Conta> contas = new ArrayList<Conta>();
	
	public void addConta(Conta conta) {
		contas.add(conta);
	}

	public boolean opSaque(Conta conta, double valorSaque) {
		return conta.saque(valorSaque);
	}

	public boolean opDeposito(Conta conta, double valorDeposito) {
		return conta.deposito(valorDeposito);
	}

	public boolean opTransferencia(Conta contaOrigem, Conta contaDestino, double valorTransf) {
		return contaOrigem.transferencia(contaDestino, valorTransf);
	}

	public double verificarSaldo(Conta conta) {
		return conta.getSaldo();
	}

}
