package br.com.trier.aula_4;

import javax.swing.JOptionPane;

import lombok.Getter;

@Getter
public class Autores {
	
	private String nome;
	private String sexo;
	private int idade;
	
	public void cadastra() {
		nome = JOptionPane.showInputDialog("Digite o nome do autor:");
		sexo = JOptionPane.showInputDialog("Digite do sexo do autor:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do autor:"));
	}
	
	@Override
	public String toString() {
		return nome + " - " +  sexo + " - " + idade + "\n";
	}

}
