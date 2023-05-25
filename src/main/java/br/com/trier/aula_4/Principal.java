package br.com.trier.aula_4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		List<Livro> livros = new ArrayList<Livro>();
		List<Autores> autor = new ArrayList<Autores>();
		
		int op = 0;
		do {
			op = Util.escolheMenu();
			switch (op) {
			case 1:
				Util.cadastraAutores(autor);
				break;
			case 2:
				Util.cadastraLivro(livros);
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			}
		} while (op != 8);
	}

}
