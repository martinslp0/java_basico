package exemplo_polimorfismoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exemplo_polimorfismo.Triangulo;
import exemplo_polimorfismo.Quadrado;
import exemplo_polimorfismo.Circulos;
import exemplo_polimorfismo.Cone;
import exemplo_polimorfismo.Forma;
import exemplo_polimorfismo.Poligono;

public class PolimorfismoTest {

	private List<Forma> lista = new ArrayList<Forma>();
	
	@BeforeEach
	public void init() {
		lista.add(new Circulos(3));
		lista.add(new Cone());
		lista.add(new Quadrado());
		lista.add(new Triangulo());
	}
	
	@Test
	@DisplayName("Teste desenhar círculo")
	public void desenharCirculoTest() {
		String s = lista.get(0).desenhar();
		assertEquals("Desenhando um Círculo", s);
	}
	
	@Test
	@DisplayName("Teste área de um círculo")
	public void areaCirculoTest() {
		Circulos c = (Circulos) lista.get(0);
		double area = c.calculaArea();
		DecimalFormat df = new DecimalFormat("##.00");
		assertEquals("28,27", df.format(area));
	}
	
	@Test
	@DisplayName("Teste desenhar quadrado")
	public void desenharQuadradoTest() {
		String s = lista.get(2).desenhar();
		assertEquals("Desenhando um Quadrado com 4 lados", s);
	}
	
	@Test
	@DisplayName("Teste desenhar triângulo")
	public void desenharTrianguloTest() {
		String s = lista.get(3).desenhar();
		assertEquals("Desenhando um Triângulo com 3 lados", s);
	}
	
}
