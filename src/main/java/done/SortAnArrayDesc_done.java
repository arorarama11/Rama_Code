package done;

public class SortAnArrayDesc_done {

	public static void sortArray(int[] array, int l) {
		int temp = 0;
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int i = 0; i < l; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 0, 4, 5, 9, 1 };
		int len = arr.length;
		sortArray(arr, len);
	}
}
