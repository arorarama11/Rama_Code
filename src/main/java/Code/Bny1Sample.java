package Code;

import java.util.LinkedHashSet;

public class Bny1Sample {

	public static void main(String[] args) {
		String str = "abcde";
		int len = str.length();
		int minLength = 2;
		int maxLength = 5;
		int maxUnique = 3;
		String[] stringArray = new String[100];
		LinkedHashSet<String> uniqueStrings = new LinkedHashSet<String>();
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		int m = 0;
		for (i = 0; i <= len; i++) {
			for (j = i + 1; j < len; j++) {
				if ((str.substring(i, j + 1).length()) >= minLength
						&& (str.substring(i, j + 1).length()) <= maxLength) {
					stringArray[k] = str.substring(i, j + 1);
					k++;
				}
			}
		}
		for (l = 0; l < stringArray.length - 1; l++) {
			if (stringArray[l] != null) {
				int count = 0;
				for (m = 0; m < stringArray[l].length() - 1; m++) {
					if (stringArray[l].charAt(m) != stringArray[l].charAt(m + 1)) {
						count++;
					}
				}
				if (count + 1 <= maxUnique) {
					uniqueStrings.add(stringArray[l]);
				}
			}
		}
		System.out.println(uniqueStrings);
	}

}
