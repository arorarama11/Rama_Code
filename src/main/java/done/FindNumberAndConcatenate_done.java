package done;



public class FindNumberAndConcatenate_done {

	public static void main(String[] args) {

		
		String str = "Asd22das22";
		int count = 0;
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		char c = 0;
		
		for(int i=0; i<=str.length()-1;i++)
		{
			c = str.charAt(i);
			if(Character.isDigit(c))
			{
				  count ++;
				  sb.append(c);
			}
			else
			{
				sb1.append(c);
			}
		}
		System.out.println(sb);
		System.out.println(sb1);
		
		StringBuffer n = sb1.append(sb);
		System.out.println(n);
		
		
		
		
		
		
	}
}
