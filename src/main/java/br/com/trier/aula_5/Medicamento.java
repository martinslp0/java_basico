package br.com.trier.aula_5;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Medicamento {

	private int idM;
	private String nome;
	private Admin admin;

	private List<Medicamento> indicacao = new ArrayList<Medicamento>();
	private List<Medicamento> ContraIndicacao = new ArrayList<Medicamento>();
}
