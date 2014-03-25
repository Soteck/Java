/** OrdenacioCerca
 * Metodes d'ordenacio


 * @author Guillem Arrom

 */

package utilitats;

public class OrdenacioCerca {

	public static int cercaBinaria(int[] a, int num) {
		int inici = 0;
		int fi = a.length - 1;
		int mig = 1;
		while (inici <= fi) {
			mig = (inici + fi) / 2;
			if (num == a[mig]) {
				return mig;
			} else if (a[mig] > num) {
				fi = mig - 1;
			} else {
				inici = mig + 1;

			}

		}
		return -1;
	}

	public static int cercaBinaria2(int[] a, int num) {
		int inici = 0;
		int fi = a.length - 1;
		int mig = 1;
		int contador = 0;
		while (inici <= fi) {
			contador++;
			
			mig = (inici + fi) / 2;
			if (num == a[mig]) {
				System.out.println("ha fet " + contador + " pasades");
				return mig;
			} else if (a[mig] > num) {
				fi = mig - 1;
			} else {
				inici = mig + 1;

			}
			
		}
		System.out.println("ha fet " + contador + " pasades");
		return -1;
	}

	public static void bimbolla(int[] a) {
		for (int i = 2; i <= a.length; i++) {
			for (int j = 0; j <= (a.length - i); j++) {
				if (a[j] > a[j + 1]) {
					int aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}

			}

		}

	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void bimbolla(Comparable[] a) {
		for (int i = 2; i <= a.length; i++) {
			for (int j = 0; j <= (a.length - i); j++) {
				if (a[j].compareTo(a[j + 1])>0) {
					Comparable aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}

			}

		}

	}

	public static void quickSort(int[] vector, int esquerre, int dreta) {
		int i = esquerre;
		int j = dreta;
		int vPivot = vector[(i + j) / 2];
		do {
			while (vector[i] < vPivot) {
				i++;
			}
			while (vector[j] > vPivot) {
				j--;
			}

			if (i <= j) {
				int aux = vector[i];
				vector[i] = vector[j];
				vector[j] = aux;
				i++;
				j--;
			}

		} while (i < j);

		if (esquerre < j) {
			quickSort(vector, esquerre, j);
		}

		if (i < dreta) {
			quickSort(vector, i, dreta);
		}
	}

}
