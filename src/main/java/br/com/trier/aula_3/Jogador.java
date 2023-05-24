package br.com.trier.aula_3;

import javax.swing.JOptionPane;

import lombok.Getter;

@Getter
public class Jogador {

	private static String nome;
	private static int numeroCamisa;
	private static int qtGols;

	static void cadastraJogador() {
		nome = JOptionPane.showInputDialog("Informe o nome do jogador");
		numeroCamisa = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da camisa"));
		qtGols = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de gols"));
	}

	static void maisUmJogador() {
		String menu = "Deseja cadastrar outro jogador?";
		if (JOptionPane.showConfirmDialog(null, menu, null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			cadastraJogador();
		} else {
			Util.escolheOp();
		}
	}

}//quando clica em cadastrar outro ele cadastra 2 de uma vez
