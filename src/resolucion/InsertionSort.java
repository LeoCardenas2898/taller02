package resolucion;

import java.util.Arrays;

public class InsertionSort {

	void insertionSort(int list[]) {
		int key, i;
		for (int j = 1; j < list.length; j++) {
			key = list[j];
			i = j - 1;
			while (i >= 0 && list[i] > key) {
				list[i + 1] = list[i];
				i = i - 1;
			}
			list[i + 1] = key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort ordenarPor = new InsertionSort();
		int[] array = { 50, 40, 80, 10, 160, 15, 90, 50 };
		System.out.println("Array colocado: " + Arrays.toString(array));
		ordenarPor.insertionSort(array);
		System.out.println("Ordenado por Insertion-Sort: " + Arrays.toString(array));
	}
}
