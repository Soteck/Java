package calculadora;

import utilitats.UtilitatsConsola;

public class CalculadoraEnters {
	public int sumar(int... a) {
		int resultat = 0;
		for (int contador = 0; contador < a.length; contador++) {
			resultat = a[contador] + resultat;
		}
		return resultat;
	}

	public int restar(int a, int b) {
		return a - b;
	}

	public int multiplicar(int... a) {
		int resultat = 1;
		for (int contador = 0; contador < a.length; contador++) {
			resultat = a[contador] * resultat;
		}
		return resultat;
	}

	public int dividir(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		//UtilitatsConsola utilitats = new UtilitatsConsola();

	}

}
