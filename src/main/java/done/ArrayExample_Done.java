package done;

import java.util.Arrays;

public class ArrayExample_Done {

	public static void main(String[] args) {
		int[] x = { 5, 3, 7, 8 };
		int[] y = new int[x.length];

		int p = 1;

		for (int i = 0; i < x.length; i++) {
			p = p * x[i];
		}
		System.out.println(p);

		for (int i = 0; i < y.length; i++) {
			y[i] = p / x[i];
			System.out.print(y[i] + " ");
		}

	}
}
