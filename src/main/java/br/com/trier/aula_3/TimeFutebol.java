package br.com.trier.aula_3;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import lombok.Getter;
@Getter
public class TimeFutebol {
	
	void cadastraTime() {
		do {
		    Jogador.cadastraJogador();
		    Jogador.maisUmJogador();
		}while(true);
		Jogador j = new Jogador();
		Util.addJogador(j);
	}
	
}
