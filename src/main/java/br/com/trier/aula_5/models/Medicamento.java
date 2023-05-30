package br.com.trier.aula_5.models;

import java.util.List;
import java.util.ArrayList;
import br.com.trier.aula_5.enums.Admin;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Medicamento {

	@NonNull
	private String nome;
	private Admin admin = Admin.ORAL;

	private List<String> indicacoes = new ArrayList<String>();
	private List<String> contraIndicacoesM = new ArrayList<String>();

	public void addIndicacao(String indicacao) {
		indicacoes.add(indicacao);
	}

	public void addContraIndicacao(String contraIndicacao) {
		contraIndicacoesM.add(contraIndicacao);
	}

	public boolean isRemedioAdequado(String sintoma) {
		return indicacoes.add(sintoma);
	}

	public boolean isRemedioInadequado(List<String> contraIndicacaoP) {
		return contraIndicacoesM.stream().anyMatch(contraIndicacaoP::contains);
	}
}
