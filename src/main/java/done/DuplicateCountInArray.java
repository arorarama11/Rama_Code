package done;

import java.util.HashMap;

public class DuplicateCountInArray {

	public static void main(String args[]) {

		int[] arr = { 10, 30, 50, 30, 50, 10 };

		HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();

		for (int num : arr) {
			if (elementCountMap.containsKey(num)) {
				elementCountMap.put(num, elementCountMap.get(num) + 1);
			} else {
				elementCountMap.put(num, 1);
			}
		}
		System.out.println(elementCountMap);
	}
}