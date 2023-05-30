package br.com.trier.aula_5;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Pessoa {

	private Integer idP;
	@NonNull
	private String nome;
	@NonNull
	private String sintoma;
	@NonNull
	private List<Pessoa> contraIndicacoes;
	
	Pessoa(Integer idP, String nome, String sintoma, List<Pessoa> contraIndicacoes){
		this.idP = idP;
		this.nome = nome;
		this.sintoma = sintoma;
		this.contraIndicacoes = new ArrayList<>();		
	}
	public void addContraIndicacao(Pessoa contraIndicacao) {
		contraIndicacoes.add(contraIndicacao);
		
	}
}
