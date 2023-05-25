package br.com.trier.aula_3;

import javax.swing.JOptionPane;

import lombok.Getter;

@Getter
public class Jogador {

	private static String nome;
	private static int nCamisa;
	private static int gols;

	static void cadastraJogador() {
		nome = JOptionPane.showInputDialog("Informe o nome do jogador");
		nCamisa = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da camisa"));
		gols = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de gols"));
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nCamisa: " + nCamisa + "\nGols: " + gols + "\n";
	}

	public static int getGols() {
		return 0;
	}

}
