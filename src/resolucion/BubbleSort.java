package resolucion;

import java.util.Arrays;

public class BubbleSort {

	void bubbleSort(int[] list) {
		int temp;
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = 0; j < list.length - (i + 1); j++) {
				if (list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 50, 40, 80, 10, 160, 15, 90, 50 };
		BubbleSort ordenarPor = new BubbleSort();
		System.out.println("Array colocado: "+Arrays.toString(array));
		ordenarPor.bubbleSort(array);
		System.out.println("Ordenado por BubbleSort: "+Arrays.toString(array));
	}
}
