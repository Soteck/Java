/**

Exercici 35

* Escriu una classe que crei un vector de 10 sencers, els inicialitzi aleatòriament de 100 a 200 i els mostri per pantalla.
		*/


package exercicis;

public class Exercici35 {

	public static void main(String[] args) {
	int[] rang = new int[10];
	int index;
	
	for (index=0;index<10;index++){
		rang[index]=100 + (int)(Math.random() * ((200 - 100) + 1));
		System.out.println(rang[index]);
	}

	}

}
