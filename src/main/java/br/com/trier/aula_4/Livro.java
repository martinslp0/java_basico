package br.com.trier.aula_4;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	
	private String titulo;
	private double preco;
	private List<Autores> autor;

	public void cadastra() {
		titulo = JOptionPane.showInputDialog("Digite o título do livro:");
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do livro:"));
		List<Autores> autor; 
	}
}
