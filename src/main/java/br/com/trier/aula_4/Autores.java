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
		sexo = JOptionPane.showInputDialog("Digite do sexo do autor [F] ou [M]:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do autor:"));
		if (!valida()) {
			cadastra();
		}
	}

	private boolean valida() {
		if (nome.trim().equals("")) {
			JOptionPane.showMessageDialog(null, "Nome obrigatório");
			return false;
		}

		if (!(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F"))) {
			JOptionPane.showMessageDialog(null, "Sexo inválido");
			return false;
		}

		if (idade < 1 || idade > 100) {
			JOptionPane.showMessageDialog(null, "Idade inválida");
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return " " + this.nome + "\nSexo: " + this.sexo.toUpperCase() + "\n Idade: " + this.idade + "\n";
	}

}