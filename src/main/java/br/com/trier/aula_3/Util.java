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
	
	public static void cadastraTime(List<TimeFutebol> time) {
		TimeFutebol t = new TimeFutebol();
		t.cadastraTime();
		time.add(t);
	}
	
	public static TimeFutebol escolheTime(List<TimeFutebol> time) {
		String menu = "Ecolha um time\n";
		int opc = 1;
		for(TimeFutebol times : time) {
			menu += opc + " - " + times.getNome() + "\n";
			opc++;
			
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		return time.get(op-1);
	}
	
	public static String listaJogadoresTime(List<TimeFutebol> times) {
		return escolheTime(times).listaJogadores();
		}
	
	public static String artilheiroCampeonato(List<TimeFutebol> times) {
		Jogador artilheiro = new Jogador();
		for(TimeFutebol time : times) {
			if(time.getArtilheiro().getGols() > artilheiro.getGols()) {
				artilheiro = time.getArtilheiro();
			}
		}
		return artilheiro.toString();
	}
	
	public static String timeMaisGols(List<TimeFutebol> times) {
		TimeFutebol timeComMaisGols = new TimeFutebol();
		for(TimeFutebol time : times) {
			if(time.getGols() > timeComMaisGols.getGols()) {
				timeComMaisGols = time;
			}
		}
		return timeComMaisGols.getNome();
	}

	
}


