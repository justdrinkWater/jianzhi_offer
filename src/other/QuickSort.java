package other;

public class QuickSort {
	private int partition(int[] arr, int p, int r) {
		int x = arr[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (arr[j] <= x) {
				i++;
				swap(arr, j, i);
			}
		}
		swap(arr, i + 1, r);
		for (int k : arr) {
			System.out.print(k + " ");
		}
		System.out.print(" : " + (i + 1));
		System.out.println();
		return i + 1;
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void quickSort(int[] arr, int p, int r) {
		if (p < r) {
			int q = partition(arr, p, r);
			quickSort(arr, p, q - 1);
			quickSort(arr, q + 1, r);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 1, 3, 6, 8, 3, 6 };
		new QuickSort().quickSort(arr, 0, arr.length - 1);

		for (int i : arr) {
			System.out.println(i);
		}
	}

}
