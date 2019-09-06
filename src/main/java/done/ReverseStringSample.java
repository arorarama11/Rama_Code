package done;

public class ReverseStringSample {

	public static void main(String[] args) {
		String str = "rama";
		String reverse = "";
		char[] a;

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
			
		}
		System.out.println(reverse);
		
	
		/*String str1 = "Rama loves Nishant";
		String reverse1 = "";

		String[] arr = str1.split("");

		for (int i = str1.length() - 1; i >= 0; i--) {
			reverse1 = reverse1 + arr[i];
		}
		System.out.println(reverse1);*/
	}
}
