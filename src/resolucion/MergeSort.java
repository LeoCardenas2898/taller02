package resolucion;

import java.util.Arrays;

public class MergeSort {

	void Merge(int[] list, int inicio, int medio, int ultimo) {
		int n1 = medio - inicio + 1;
		int n2 = ultimo - medio;
		int izquierda[] = new int[n1 + 1];
		int derecha[] = new int[n2 + 1];
		for (int i = 0; i < n1; i++) {
			izquierda[i] = list[inicio + i];
		}
		for (int j = 0; j < n2; j++) {
			derecha[j] = list[medio + j + 1];
		}
		izquierda[n1] = 99999;
		derecha[n2] = 99999;
		int i = 0, j = 0;
		for (int k = inicio; k <= ultimo; k++) {
			if (izquierda[i] <= derecha[j]) {
				list[k] = izquierda[i];
				i++;
			} else {
				list[k] = derecha[j];
				j++;
			}
		}

	}

	public void mergeSort(int[] list1, int start, int end) {
		if (start < end) {
			int q = (start + end) / 2;
			mergeSort(list1, start, q);
			mergeSort(list1, q + 1, end);
			Merge(list1, start, q, end);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 50, 40, 80, 10, 160, 15, 90, 50 };
		System.out.println("Arreglo ingresado: " + Arrays.toString(array));
		MergeSort ordenarPor = new MergeSort();
		ordenarPor.mergeSort(array, 0, array.length - 1);
		System.out.println("Ordenado por MergeSort: " + Arrays.toString(array));
	}

}
