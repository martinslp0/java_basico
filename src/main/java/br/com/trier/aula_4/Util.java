package br.com.trier.aula_4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Util {

	public static int escolheMenu() {
		String menu = "1 - Cadastrar autor\r\n" + "2 - Cadastrar livros\r\n"
				+ "3 - Listar todos os livros cadastrados\r\n" + "4 - Pesquisar por autor\r\n"
				+ "5 - Pesquisar por faixa de preço\r\n" + "6 - Listar todos os livros cujo autores tenham crianças\r\n"
				+ "7 - Listar todos os livros que foram escritos apenas por mulheres ou homens\n\n" + "8 - sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

	public static void cadastraLivro(List<Livro> livros, List<Autores> autores) {
		Livro livro = new Livro();
		livro.cadastra();
		boolean adicionarAutores = true;
		while (adicionarAutores) {
			Autores autor = escolheAutor(autores);
			livro.addAutor(autor);

			int opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar outro autor?");
			if (opcao != JOptionPane.YES_OPTION) {
				adicionarAutores = false;
			}
		}
		livros.add(livro);
	}

	public static void cadastraAutores(List<Autores> autores) {
		Autores a = new Autores();
		a.cadastra();
		autores.add(a);

	}

	public static Autores escolheAutor(List<Autores> autor) {
		String menu = "";

		for (int i = 0; i < autor.size(); i++) {
			menu += (i + 1) + " - " + autor.get(i) + "\n";

		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		return autor.get(op - 1);
	}

	public static String listaLivros(List<Livro> livros) {
		String ret = "Livros cadastrados:\n";
		for (Livro livro : livros) {
			ret += livro;
		}
		return ret;
	}

	public static String pesquisaPorAutor(List<Autores> autores, List<Livro> livros) {
		Autores autor = escolheAutor(autores);
		StringBuilder resultado = new StringBuilder("Livros do autor ").append(autor.getNome()).append(":\n");

		for (Livro livro : livros) {
			if (livro.isAutorLivro(autor)) {
				resultado.append(livro.toString()).append("\n");
			}
		}

		return resultado.toString();
	}

	public static String faixaPreco(List<Livro> livros) {
		double precoMin = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço mínimo?"));
		double precoMax = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço máximo?"));
		StringBuilder resultado = new StringBuilder("Livros na faixa de preço de R$").append(precoMin).append(" a R$")
				.append(precoMax).append(":\n\n");
		for (Livro livro : livros) {
			if (livro.getPreco() >= precoMin && livro.getPreco() <= precoMax) {
				resultado.append(livro).append("\n");
			}
		}
		return resultado.toString();
	}

	public static String autorCrianca(List<Livro> livros) {
		StringBuilder ret = new StringBuilder("Livros com autores crianças:\n");
		for (Livro livro : livros) {
			for (Autores autor : livro.getAutores()) {
				if (Livro.isAutorCrianca(autor)) {
					ret.append(livro.toString()).append("\n");

				}
			}
		}
		return ret.toString();
	}
//	public list<Livro> (final String, final String)
	public static String pesquisarPorSexo(List<Autores> autor, List<Livro> livros) {

		Sexo sexo = Sexo.escolherSexo();
		ArrayList<Livro> livroPorSexo = new ArrayList<Livro>();

		for (Livro livro : livros) {
			if (Livro.isAutorSexo(sexo)) {
				livroPorSexo.add(livro);
			}
		}

		if (!livroPorSexo.isEmpty()) {
			StringBuilder ret = new StringBuilder();
			for (Livro livro : livroPorSexo) {
				ret.append(livro).append("\n");
			}
			return ret.toString();
		} else {
			return "Nenhum livro encontrado para o sexo informado.";
		}
	}

}

