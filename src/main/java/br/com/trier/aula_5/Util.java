package br.com.trier.aula_5;

import java.util.ArrayList;
import java.util.List;

public class Util {

	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	private List<Medicamento> remedios = new ArrayList<Medicamento>();

	public Pessoa add(Pessoa p) {
		p.setIdP(pessoas.size() + 1);
		pessoas.add(p);
		return p;
	}

	public Medicamento add(Medicamento m) {
		m.setIdM(remedios.size() + 1);
		remedios.add(m);
		return m;
	}
	
	public Pessoa findPessoaById(final Integer idP) {
		return pessoas.stream()
				.filter(p -> idP.equals(p.getIdP()))
				.findAny()
		        .orElse(null);
	}
	public Medicamento findRemedioById(final Integer idM) {
		return remedios.stream()
				.filter(m -> idM.equals(m.getIdM()))
				.findAny()
				.orElse(null);
	}

}
