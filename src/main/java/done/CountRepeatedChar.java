package done;

import java.util.HashMap;

public class CountRepeatedChar {

	public static void main(String[] args) {
		String str = "Rama Arora";
		char[] arr = str.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character ch : arr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}
