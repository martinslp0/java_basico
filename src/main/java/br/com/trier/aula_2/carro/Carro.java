package br.com.trier.aula_2.carro;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Carro {

	List<Carro> carros = new ArrayList<Carro>();
	String marca;
	int ano;
	CorCarro corCarro;

	public void cadastrarCarro() {
		do {
			marca = JOptionPane.showInputDialog("Informe a marca do carro:");

			if (marca == null) {
				return;
			}

		} while (marca.isEmpty());
		do {
			String digitaAno = JOptionPane.showInputDialog("Informe o ano do carro:");
			if (digitaAno == null) {
				return;
			}
			try {
				ano = Integer.parseInt(digitaAno);
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Ano inválido. Informe novamente.");
			}
		} while (true);

		Object[] cores = CorCarro.values();
		corCarro = (CorCarro) JOptionPane.showInputDialog(null, "Escolha a cor do carro:", "Cor",
				JOptionPane.QUESTION_MESSAGE, null, cores, cores[0]);
		if (corCarro == null) {
			return;
		}
		Carro carro = new Carro();
		carro.cadastrarCarro();
		this.carros.add(carro);

		JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
	}

	public void listarCarrosPorPeriodo() {
		int anoInicial;
		int anoFinal;
		do {
			String digitaAnoInicial = JOptionPane.showInputDialog("Informe o ano inicial:");
			if (digitaAnoInicial == null) {
				return;
			}
			try {
				anoInicial = Integer.parseInt(digitaAnoInicial);
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Ano inválido. Informe novamente.");
			}
		} while (true);

		do {
			String digitaAnoFinal = JOptionPane.showInputDialog("Informe o ano final:");
			if (digitaAnoFinal == null) {
				return;
			}
			try {
				anoFinal = Integer.parseInt(digitaAnoFinal);
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Ano inválido. Informe novamente.");
			}
		} while (true);
		List<Carro> carrosPorPeriodo = new ArrayList<Carro>();
		for (Carro carro : this.carros) {
			if (this.ano >= anoInicial && this.ano <= anoFinal) {
				carrosPorPeriodo.add(carro);
			}
		}
		exibirCarros(carrosPorPeriodo);
	}

	public void listarCarrosPorMarca() {
		String marca;
		do {
			marca = JOptionPane.showInputDialog("Informe a marca do carro");

			if (marca == null) {
				return;
			}
			marca = marca.toUpperCase();
		} while (marca.isEmpty());

		List<Carro> carrosPorMarca = new ArrayList<Carro>();
		for (Carro carro : this.carros) {
			if (marca.equalsIgnoreCase(marca)) {
				carrosPorMarca.add(carro);
			}
		}

		exibirCarros(carrosPorMarca);
	}

	public void listarCarrosPorCor() {
		Object[] cores = CorCarro.values();
		CorCarro corCarro = (CorCarro) JOptionPane.showInputDialog(null, "Escolha a cor:", "Cor",
				JOptionPane.QUESTION_MESSAGE, null, cores, cores[0]);
		if (corCarro == null) {
			return;
		}

		List<Carro> carrosPorCor = new ArrayList<Carro>();
		for (Carro carro : this.carros) {
			if (true) {
				carrosPorCor.add(carro);
			}
		}
		exibirCarros(carrosPorCor);
	}

	String formatarNum(double vl) {
		DecimalFormat df = new DecimalFormat("###,###.00");
		return df.format(vl);
	}

	String exibirCarros(List<Carro> carros) {
		double percentual = (double) carros.size() / this.carros.size() * 100;
		return "Marca: " + marca + "\nAno: " + ano + "\nCor" + corCarro + "\n\nPercentual: " + formatarNum(percentual);

	}
}
