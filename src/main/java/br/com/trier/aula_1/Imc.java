package br.com.trier.aula_1;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Imc {
	static List<String> nomes = new ArrayList<String>();
	static List<String> sexos = new ArrayList<String>();
	static List<Double> pesos = new ArrayList<Double>();
	static List<Double> alturas = new ArrayList<Double>();


	public static void main(String[] args) {
		
		int qntd = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar quantas pessoas?"));
		
		for (int i = 0; i < qntd; i++) {
			nomes.add(JOptionPane.showInputDialog("Digite seu nome"));
			sexos.add(JOptionPane.showInputDialog("Informe seu sexo 'F' ou 'M': "));
			pesos.add(Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso")));
			alturas.add(Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura")));	
		}
		for(int i = 0; i <nomes.size(); i++)
		nomes.get(i);
		sexos.get(i);
		pesos.get(i);
		alturas.get(i);
		//double imc = peso / (altura * altura);
		
	}

}
