package br.com.trier.aula_2.carro;

import javax.swing.JOptionPane;

public class PrincipalCarro {

	public static void main(String[] args) {

		Carro carros = new Carro();
		int op = 0;
		do {
			op = Util.escolheOp();

			switch (op) {
			case 1:
				carros.cadastrarCarro();
				break;
			case 2:
				carros.listarCarrosPorPeriodo();
				break;
			case 3:
				carros.listarCarrosPorMarca();
				break;
			case 4:
				carros.listarCarrosPorCor();
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Programa encerrado.");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida. Digite novamente.");
				break;
			}
		} while (op != 5);

	}

}
