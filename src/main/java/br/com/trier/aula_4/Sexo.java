package br.com.trier.aula_4;

import javax.swing.JOptionPane;

public enum Sexo {

	MASCULINO(1, "Masculino"), FEMININO(2, "Feminino");

	private int id;
	private String descricao;

	Sexo(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public static Sexo buscaPorCodigo(int codigo) {
		for (Sexo sexo : Sexo.values()) {
			if (sexo.id == codigo) {
				return sexo;
			}
		}
		return null;
	}

	public static Sexo escolherSexo() {

		for (Sexo sexo : Sexo.values()) {
			JOptionPane.showMessageDialog(null, sexo.id + " - " + sexo.descricao);
		}

		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha"));
		valida(escolha);

		return buscaPorCodigo(escolha);
	}

	public static boolean valida(int escolha) {
		escolherSexo();
		while (escolha != MASCULINO.id && escolha != FEMININO.id) {
			JOptionPane.showMessageDialog(null, "Opção inválida. Digite novamente!");
			return false;
		}
		return true;
	}
}
