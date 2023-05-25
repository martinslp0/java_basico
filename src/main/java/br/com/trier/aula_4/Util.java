package br.com.trier.aula_4;

import java.util.List;

import javax.swing.JOptionPane;

import lombok.Getter;

@Getter
public class Util {

	public static int escolheMenu() {
		String menu = "1 - Cadastrar autor\r\n"
				+ "2 - Cadastrar livros\r\n"
				+ "3 - Listar todos os livros cadastrados\r\n"
				+ "4 - Pesquisar por autor\r\n"
				+ "5 - Pesquisar por faixa de preço\r\n"
				+ "6 - Listar todos os livros cujo autores tenham crianças\r\n"
				+ "7 - Listar todos os livros que foram escritos apenas por mulheres ou homens\n\n"
				+ "8 - sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
	
	public static void cadastraLivro(List<Livro> livros) {
		Livro l = new Livro();
		l.cadastra();
		livros.add(l);
		
	}
	public static void cadastraAutores(List<Autores> autor) {
		Autores a = new Autores();
		a.cadastra();
		autor.add(a);
	}
	
	public static Autores escolheAutor(List<Autores> autor) {
		String menu = "Escolha o autor\n";
		int opc = 1;
		for(Autores autores : autor) {
			menu += opc + " - " + autores.getNome() + "\n";
			opc++;
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		return autor.get(op-1);
	}
	
}
