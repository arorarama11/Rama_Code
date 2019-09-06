package Code;

import java.util.NoSuchElementException;
import java.util.TreeMap;

public class Lexicographically_BNY3 {

	static TreeMap<Integer, String> stringMap = new TreeMap<Integer, String>();

	public static void main(String[] args) {

		int i = 0;
		int n = 1;
		String str = "njnhutgj";
		str = str + 0;
		int len = str.length();
		for (i = 0, n = 1; n <= len - 1; i++, n++) {
			func(i, n, len, str);
		}
		try {
			System.out.println(stringMap.get(stringMap.lastKey()));
		} catch (NoSuchElementException e) {
			System.out.println("no continous substring");
		}
	}

	public static void func(int i, int n, int len, String str) {
		int z = 0;
		boolean flag1 = true;
		boolean flag2 = false;
		while (n < len) {
			if (str.charAt(n) - str.charAt(i) == 1) {
				flag2 = true;
				if (flag1) {
					z = i;
					flag1 = false;
				}
				n = n + 1;
				i = i + 1;
			} else {
				if (flag2) {
					stringMap.put(str.substring(z, n).length(),
							str.substring(z, n));
				}
				break;
			}
		}
	}
}