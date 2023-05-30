package br.com.trier.aula_5;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Medicamento {

	private Integer idM;
	private String nome;
	private Admin admin;

	private List<Medicamento> indicacoes;
	private List<Medicamento> contraIndicacoes;
	
	Medicamento(Integer idM, String nome, List<Medicamento> contraIndicacoes, List<Medicamento> indicacoes) {
		this.idM = idM;
		this.nome = nome;
		this.contraIndicacoes = new ArrayList<>();
		this.indicacoes = new ArrayList<>();
	}
	public void addIndicacao(Medicamento indicacao) {
		indicacoes.add(indicacao);
	}
	
	public void addContraIndicacao(Medicamento contraIndicacao) {
        contraIndicacoes.add(contraIndicacao);
    }
}
