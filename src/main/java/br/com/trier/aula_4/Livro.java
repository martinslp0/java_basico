package br.com.trier.aula_4;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Livro {

	private String titulo;
	private double preco;
	private List<Autores> autores;

	public Livro() {
		autores = new ArrayList<>();
	}

	public void cadastra() {
		titulo = JOptionPane.showInputDialog("Digite o título do livro:").toLowerCase();
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do livro:"));
		if(!validaValor()){
			cadastra();
		}
	}

	public void addAutor(Autores autor) {
		autores.add(autor);
	}

	public static void cadastraLivro(List<Livro> livros, List<Autores> autor) {
		Livro l = new Livro();
		l.cadastra();
		livros.add(l);
	}

	public boolean isAutorLivro(Autores autor) {
		for (Autores thisAutor : autores) {
			if (thisAutor.getNome().equalsIgnoreCase(autor.getNome())) {
				return true;
			}
		}
		return false;
	}

	public boolean validaValor() {
		if (preco <= 1) {
			JOptionPane.showMessageDialog(null, "Valor inválido");
			return false;
		}
		return true;
	}

	public static boolean isAutorCrianca(Autores autor) {
		int idade = autor.getIdade();
		if (idade <= 12) {
			return true;
		}
		return false;
	}

	public static boolean isAutorSexo(Sexo sexo) {
		String fem = JOptionPane.showInputDialog("Digite o sexo que deseja procurar: [F] ou [M]").toUpperCase();
		if (fem.equals("F") && sexo.equals("F")) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Título: " + this.titulo + "\nPreço: R$" + this.preco + "\n\nAutor: " + this.autores + "\n";

	}

}
