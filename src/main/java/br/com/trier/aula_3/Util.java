package br.com.trier.aula_3;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Util {
	
	static int escolheOp() {

		String menu = "Menu:\n" + "1 – Cadastrar Time\n" 
				+ "2 – Listar todos os jogadores\n"
				+ "3 – Verificar Artilheiro\n" 
				+ "4 – Verificar qual time fez mais gols no campeonato\n\n" 
				+ "5 – Sair\n\n"
				+ "Escolha uma opção:";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
	
	static List<Jogador> jogador = new ArrayList<Jogador>();
	public static List<Jogador> getJogadores(){
		return jogador;
	}
	public static void addJogador(Jogador j) {
		jogador.add(j);
	}
}
