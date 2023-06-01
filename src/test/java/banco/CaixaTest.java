package banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import br.com.trier.banco.*;

public class CaixaTest {

	//private List<Caixa> caixa = new ArrayList<Caixa>();

	Caixa caixa = new Caixa();
	private Conta ContaEsp;
	private Conta Conta;
	private Conta ContaUniv;

	@BeforeEach
	public void init() {
		Conta = new Conta("Fab", 001, 123, 1500);
		ContaEsp = new ContaEsp("Fab", 002, 231, 500, 500);
		ContaUniv = new ContaUniv("Fab", 003, 132, 1800);
	}

	@Test
	    @DisplayName("Teste de verificar saldo")
	    void saldoContaTest() {
		double c = caixa.verificarSaldo(Conta);
		assertEquals(1500, c);
		double cEsp = caixa.verificarSaldo(Conta);
		assertEquals(500, cEsp);
		double cUniv = caixa.verificarSaldo(Conta);
		assertEquals(1800, cUniv);
	}
	
	@Test
	@DisplayName("Teste de saque")
	void saqueContaTest() {
		
	}
}
