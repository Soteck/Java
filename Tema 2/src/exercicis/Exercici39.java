/**

Exercici 39

*Creau una classe que defineixi una matriu quadrada, pe 4x4, i:

Inicialitzau-la de forma que cada casella tengui la suma de les seves coordenades.
Mostrau la diagonal principal, [1,1], [2,2]...
Mostrau la diagonal secundària [4,1][3,2]...
		*/


package exercicis;

public class Exercici39 {

	public static void main(String[] args) {
		int[][] matriu = new int [4][4];
		int fila,columna;
		for (fila=0;fila<matriu.length;fila++){
			for (columna=0;columna<matriu.length;columna++){
				matriu[fila][columna]=fila+columna;
			}
		}
for (int index=0;index<matriu.length;index++){
	System.out.println(matriu[index][index]);
}
for (int index=(matriu.length)+1;index>=0;index--){
	System.out.println(matriu[index][index]);
}
	}

}
