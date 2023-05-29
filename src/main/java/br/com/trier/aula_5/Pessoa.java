package br.com.trier.aula_5;

import java.util.List;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Pessoa {

	private int idP;
	@NonNull
	private String nome;
	@NonNull
	private String sintoma;
	@NonNull
	private List<Pessoa> contraIndicacao;
	
	
}
