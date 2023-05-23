package br.com.trier.aula_2.imc;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PrincipalImc {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		int op = 0;
		do {
			op = Util.escolheOp();
			
			if (op == 1) {
				Pessoa p1 = new Pessoa();
				p1.cadastrar();
				pessoas.add(p1);
			}
			if (op == 2) {
				String ret = "*** IMCs ***\n\n";
				for(Pessoa p : pessoas) {
					ret += p.imprime();
				}
				JOptionPane.showInputDialog(ret);
			}
		} while(op != 3);
	}
}
