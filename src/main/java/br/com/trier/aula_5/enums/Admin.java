package br.com.trier.aula_5.enums;

public enum Admin {

	INJETAVEL(1, "Injetável"),
	TOPICO(2, "Tópico"),
	ORAL (3, "Oral"),
	SUPOSITORIO(4, "Supositório");

	private int op;
	private String descricao;
	
	Admin(int op, String descricao) {
		this.op = op;
		this.descricao = descricao;
	}
}
