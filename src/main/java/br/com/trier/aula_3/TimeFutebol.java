package br.com.trier.aula_3;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;

import lombok.Getter;
@Getter
public class TimeFutebol {
	
	private String nome;
	private List<Jogador> jogadores = new ArrayList<Jogador>();
	
	public void cadastraTime() {
		nome = JOptionPane.showInputDialog("Nome do time");
		do {
			Jogador j = new Jogador();
		    Jogador.cadastraJogador();
		    jogadores.add(j);
		}while(JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro jogador?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
	}
	
	public Jogador getArtilheiro () {
		Jogador artilheiro = jogadores.get(0);
		for (Jogador jogador : jogadores) {
			if(jogador.getGols() > artilheiro.getGols()) {
				artilheiro = jogador;
			}
		}
		return artilheiro;
	}
	
	public String listaJogadores() {
		String ret = "Jogadores do time: " + nome + "\n";
		for(Jogador jogador : jogadores) {
			ret += jogador;
		}
		return ret;
	}
	
	public int getGols() {
		int gols = 0;
		for(Jogador jogador : jogadores) {
			gols+= jogador.getGols();
		}
		return gols;
	}
	
}
