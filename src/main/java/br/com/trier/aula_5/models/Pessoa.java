package br.com.trier.aula_5.models;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Pessoa {

	@NonNull
	private String nome;
	@NonNull
	private String sintoma;
	private List<String> contraIndicacoesP = new ArrayList<String>();
	private List<Medicamento> remedios = new ArrayList<Medicamento>();

	public void addContraIndicacao(String contraIndicacao) {
		this.contraIndicacoesP.add(contraIndicacao);
	}

	public boolean addMedicamentoPessoa(Medicamento m) {
		if (m.isRemedioAdequado(sintoma) && !m.isRemedioInadequado(contraIndicacoesP)) {
			remedios.add(m);
			return true;
		}
		return false;
	}

}
