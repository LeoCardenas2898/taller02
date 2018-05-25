package resolucion;

import java.util.Arrays;

public class QuickSort {

	int Partition(int[] list, int start, int end) {
		int x = list[end];
		int i = start - 1;
		for (int j = start; j < end; j++) {
			if (list[j] <= x) {
				i++;
				int temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
		}
		int temp = list[i + 1];
		list[i + 1] = list[end];
		list[end] = temp;

		return i + 1;
	}

	void quickSort(int[] list, int start, int end) {
		if (start < end) {
			int q;
			q = Partition(list, start, end);
			quickSort(list, start, q - 1);
			quickSort(list, q + 1, end);
		}
	}

	public static void main(String[] args) {
		
		int[] array = { 50, 40, 80, 10, 160, 15, 90, 50 };
		QuickSort ordenarPor = new QuickSort();
		System.out.println("Array colocado: " + Arrays.toString(array));
		ordenarPor.quickSort(array, 0, array.length - 1);
		System.out.println("Ordenado por Quicksort " + Arrays.toString(array));
	}

}
