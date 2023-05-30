package br.com.trier.aula_5.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.trier.aula_5.models.Medicamento;
import br.com.trier.aula_5.models.Pessoa;
import lombok.Getter;

@Getter
public class Util {

	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	private List<Medicamento> remedios = new ArrayList<Medicamento>();

	public void addPessoa(Pessoa p) {
		pessoas.add(p);
	}

	public void addMedicamento(Medicamento m) {
		remedios.add(m);
	}

	public boolean existePessoa(Pessoa p) {
		return pessoas.contains(p);
	}

	public boolean existeMedicamento(Medicamento m) {
		return remedios.contains(m);
	}

	public boolean prescreve(Pessoa p, Medicamento m) {
		if (existePessoa(p) && existeMedicamento(m)) {
			return p.addMedicamentoPessoa(m);

		}
		return false;
	}

}
