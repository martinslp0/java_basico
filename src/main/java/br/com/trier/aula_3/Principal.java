package br.com.trier.aula_3;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		List<TimeFutebol> times = new ArrayList<TimeFutebol>();

		int op = 0;
		do {
			op = Util.escolheOp();
			switch (op) {
			case 1:
				Util.cadastraTime(times);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, Util.listaJogadoresTime(times));
				break;
			case 3:
				JOptionPane.showMessageDialog(null, Util.artilheiroCampeonato(times));
				break;
			case 4:
				JOptionPane.showMessageDialog(null, Util.timeMaisGols(times));
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Encerrando programa.");
				break;
			}

		} while (op != 5);

	}

}
