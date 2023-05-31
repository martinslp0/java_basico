package utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.trier.aula_5.utils.Util;
import br.com.trier.aula_5.models.Medicamento;
import br.com.trier.aula_5.models.Pessoa;

public class UtilTeste {

	private Util remedio = new Util();

	@BeforeEach
	public void init() {
		remedio.getRemedios().clear();
		remedio.getPessoas().clear();

		Pessoa p1 = new Pessoa("Pessoa 1", "Gripe");
		Pessoa p2 = new Pessoa("Pessoa 2", "Dor");
		p1.addContraIndicacao("Pressão alta");
		remedio.addPessoa(p1);
		remedio.addPessoa(p2);

		Medicamento m1 = new Medicamento("Med 1");
		m1.addIndicacao("Gripe");
		m1.addIndicacao("Dor");
		m1.addContraIndicacao("Pressão alta");
		Medicamento m2 = new Medicamento("Med 2");
		m2.addIndicacao("Dor");
		remedio.addMedicamento(m1);
		remedio.addMedicamento(m2);
	}

	@Test
	void prescreverOk() {
		Pessoa p = remedio.getPessoas().get(0);
		Medicamento m = remedio.getRemedios().get(0);
		boolean prescrito = remedio.prescreve(p, m);
		assertEquals(true, prescrito);
		assertEquals(1,  p.getRemedios().size());
		assertEquals("Med 1", p.getRemedios().get(0).getNome());

	}
	@Test
	void prescreverFalhaIndicacao() {

	}
	@Test
	void prescreverFalhaContraIndicacao() {

	}

}
