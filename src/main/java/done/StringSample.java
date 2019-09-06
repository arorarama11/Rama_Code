package done;

public class StringSample {

	public static void main(String[] args)
	{
		String str = "ABCDEF";
		String str1 = "ABCDEF";
		int str_ch = 0;
		int str1_ch = 0;
		boolean b = false;
		
		for(int i=0; i < str.length(); i++)
		{
			str_ch = str.charAt(i);
			str1_ch = str1.charAt(i);
			System.out.println(str_ch + " " + str1_ch);
			if(str_ch != str1_ch)
			{
				b = false;
				break;
			}
		}
		if(!b)
		{
			System.out.println("string are same");
		}else
		{
			System.out.println("string are not same");
		}
		
	}
}
