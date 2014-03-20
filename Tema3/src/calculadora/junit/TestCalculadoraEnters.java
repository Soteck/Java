package calculadora.junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import calculadora.CalculadoraEnters;

public class TestCalculadoraEnters {

	public static CalculadoraEnters calculadora;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calculadora = new CalculadoraEnters();

	}

	@Test
	public void testSumar() {
		int a = 10;
		int b = 20;
		int c = 30;
		int resultat = calculadora.sumar(a, b, c);
		assertEquals(60, resultat);

	}

	@Test
	public void testRestar() {
		int a = 10;
		int b = 20;
		int resultat = calculadora.restar(a, b);
		assertEquals(-10, resultat);

	}

	@Test
	public void testMultiplicar() {
		int a = 1;
		int b = 2;
		int c = 3;
		int resultat = calculadora.multiplicar(a, b, c);
		assertEquals(6, resultat);
	}

	@Test(expected = java.lang.ArithmeticException.class)
	public void testDividir() {
		int a = 10;
		int b = 0;
		int resultat = calculadora.dividir(a, b);
	}

}
