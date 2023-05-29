package br.com.trier.aula_5;

import java.util.ArrayList;
import java.util.List;

public class Util {

	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	private List<Medicamento> remedios = new ArrayList<Medicamentos>();

	public Pessoa add(Pessoa p) {
		p.setIdP(pessoas.size() + 1);
		pessoas.add(p);
		return p;
	}

	public Medicamento add(Medicamento m) {
		m.setIdM()
	}

}
