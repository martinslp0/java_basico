package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.trier.banco.Caixa;
import br.com.trier.banco.Conta;
import br.com.trier.banco.ContaEsp;
import br.com.trier.banco.ContaUniv;

class CaixaTest2 {

	private Caixa caixa = new Caixa();

	@BeforeEach
	public void init() {

		caixa.getContas().clear();
		caixa.addConta(new Conta("Fab", 001, 123, 1500));
		caixa.addConta(new ContaEsp("Iago", 002, 231, 500, 500));
		caixa.addConta(new ContaUniv("Rosa", 003, 132, 1800));
	}

	@Test
	@DisplayName("Teste de verificar saldo")
	public void saldoContaTest() {
		Conta c = caixa.getContas().get(0);
		Double cSaldo = c.verificarSaldo(c);
		assertEquals(1500, cSaldo);
		ContaEsp cEsp = (ContaEsp)caixa.getContas().get(1);
		Double cEspSaldo = cEsp.verificarSaldo(cEsp);
		assertEquals(500, cEspSaldo);
		ContaUniv cUniv = (ContaUniv) caixa.getContas().get(2);
		double cUnivSaldo = caixa.verificarSaldo(cUniv);
		assertEquals(1800, cUnivSaldo);
	}

	@Test
	@DisplayName("Teste verificar saque")
	public void saqueContaTest() {
		Conta c = caixa.getContas().get(0);
		caixa.opSaque(c, 1300);
		assertEquals(200, c.getSaldo());
		caixa.opSaque(c, 300);
		assertEquals(200, c.getSaldo());
		caixa.opSaque(c, 200);
		assertEquals(0, c.getSaldo());
		
		ContaEsp cEsp = (ContaEsp) caixa.getContas().get(1);
		caixa.opSaque(cEsp, 500);
		assertEquals(0, cEsp.getSaldo());
		caixa.opSaque(cEsp, 500);
		assertEquals(-500, cEsp.getSaldo());
		caixa.opSaque(cEsp, 100);
		assertEquals(-500, cEsp.getSaldo());
		
		ContaUniv cUniv = (ContaUniv) caixa.getContas().get(2);
		caixa.opSaque(cUniv, 1700);
		assertEquals(100, cUniv.getSaldo());
		caixa.opSaque(cUniv, 200);
		assertEquals(100, cUniv.getSaldo());
		caixa.opSaque(cUniv, 100);
		assertEquals(0, cUniv.getSaldo());
		
	}
	@Test
	@DisplayName("Teste verificar deposito")
	public void depositoContaTest() {
		Conta c = caixa.getContas().get(0);
		caixa.opDeposito(c, 3000);
		assertEquals(4500, c.getSaldo());
		
		ContaEsp cEsp = (ContaEsp) caixa.getContas().get(1);
		caixa.opDeposito(cEsp, 1500);
		assertEquals(2000, cEsp.getSaldo());
		
		ContaUniv cUniv = (ContaUniv) caixa.getContas().get(2);
		caixa.opDeposito(cUniv, 200);
		assertEquals(2000, cUniv.getSaldo());
		caixa.opDeposito(cUniv, 500);
		assertEquals(2000, cUniv.getSaldo());
	}
	@Test
	@DisplayName("Teste verificar tranferencia conta pra conta especial")
	public void tranferenciaContaToCEspTest() {
		Conta c = caixa.getContas().get(0);
		ContaEsp cEsp = (ContaEsp) caixa.getContas().get(1);
		
		caixa.opTransferencia(c, cEsp, 500);
		assertEquals(1000, c.getSaldo());
		assertEquals(1000, cEsp.getSaldo());
		
		caixa.opTransferencia(c, cEsp, 500);
		assertEquals(500, c.getSaldo());
		assertEquals(1500, cEsp.getSaldo());
		
		caixa.opTransferencia(c, cEsp, 600);
		assertEquals(500, c.getSaldo());
		assertEquals(1500, cEsp.getSaldo());
	}
	
	@Test
	@DisplayName("Teste verificar tranferencia conta pra conta universitaria")
	public void tranferenciaContaToContaUnivTest() {
		Conta c = caixa.getContas().get(0);
		ContaUniv cUniv = (ContaUniv) caixa.getContas().get(2);
		
		caixa.opTransferencia(c, cUniv, 500);
		assertEquals(1500, c.getSaldo());
		assertEquals(1800, cUniv.getSaldo());
	}

}
