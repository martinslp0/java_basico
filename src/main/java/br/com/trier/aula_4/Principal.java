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
				Util.cadastraLivro(livros, autor);
				break;
			case 3:
				 JOptionPane.showMessageDialog(null, Util.listaLivros(livros));
				break;
			case 4:
				JOptionPane.showMessageDialog(null, Util.pesquisaPorAutor(autor, livros));
				break;
			case 5:
				JOptionPane.showMessageDialog(null, Util.faixaPreco(livros));
			case 6:
				JOptionPane.showMessageDialog(null, Util.autorCrianca(livros));
			case 7:
				JOptionPane.showMessageDialog(null, Util.autorFeminino(livros));
			}
		} while (op != 8);
	}

}
