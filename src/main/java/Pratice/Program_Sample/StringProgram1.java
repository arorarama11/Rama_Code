package Pratice.Program_Sample;

public class StringProgram1 {

	public static void main(String[] args)
	{
		String str = "This is My name";
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			if(i==0 || i == ch.length-1)
			{
				int k = i;
				while(i < ch.length && ch[i] != ' ')
				{
					i++;
					char temp = ch[i];
					ch[i] = ch[i-1];
					ch[i-1] = temp;
				}
			}
		}
			System.out.println(ch.toString());
		
	}
}
