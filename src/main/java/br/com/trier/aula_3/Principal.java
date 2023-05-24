package br.com.trier.aula_3;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		List<TimeFutebol> time = new ArrayList<TimeFutebol>();

		int op = 0;

		op = Util.escolheOp();
		if (op == 1) {
			TimeFutebol t = new TimeFutebol();
			t.cadastraTime();
			time.add(t);
		}
		if (op == 2) {
			JOptionPane.showMessageDialog(null, "Nesse time tem os jogadores:\n\n" + Util.getJogadores());
		}
		// 2 não ta funcionando

	}

}
