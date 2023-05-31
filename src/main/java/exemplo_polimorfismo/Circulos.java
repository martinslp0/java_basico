package exemplo_polimorfismo;

import lombok.Getter;

@Getter
public class Circulos extends Forma{
	
	private int raio;
	
	public Circulos(int raio) {
		super("Círculo");
		this.raio = raio;
	}
	public double calculaArea() {
		return Math.PI * Math.pow(raio, 2);
	}

}
