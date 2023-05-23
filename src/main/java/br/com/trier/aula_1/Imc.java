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

		String menu = "1 - Cadastrar\n" + "2 - Avaliar\n\n" + "3 - Sair";

		int op = 0;

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if (op == 1) {
				cadastrar();
			}
			if (op == 2) {
				avaliar();
			}
		} while (op != 3);
	}

	public static void avaliar() {
		String retorno = "IMCs\n\n";
		for (int i = 0; i < nomes.size(); i++) {
			String nome = nomes.get(i);
			String sexo = sexos.get(i);
			double peso = pesos.get(i);
			double altura = alturas.get(i);
			double imc = peso / (altura * altura);
			String avaliacao = avaliaImc(sexo, imc);
			retorno += "\n Nome: " + nome + "\nImc " + imc + " - " + avaliacao;
		}//Nome: " + nome + "\nImc: " + formataValor(calculaImc()) + "(" + avaliaImc() + ")\n
		
		JOptionPane.showMessageDialog(null, retorno);

	}
	
	public static String avaliaImc(String sexo,double imc) {
		if(sexo.equalsIgnoreCase("F")) {
			imc = imc * 0.9;
		}
		String ret = null;
		
		if(imc <= 18.5 ) {
			ret = "Abaixo do peso";
		} if(imc > 18.5 && imc <= 25) {
			ret = "Peso ideal";
			} if(imc > 25 && imc <= 30) {
				ret = "Sobrepeso";
				}if(imc > 30) {
					ret = "Obesidade";
				}		
				return ret;
	}

	public static void cadastrar() {

		nomes.add(JOptionPane.showInputDialog("Digite seu nome"));
		sexos.add(JOptionPane.showInputDialog("Informe seu sexo 'F' ou 'M': "));
		pesos.add(Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso")));
		alturas.add(Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura")));

	}

}
