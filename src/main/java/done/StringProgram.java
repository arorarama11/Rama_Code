package done;

public class StringProgram {

	public static void  main(String[] args)
	{
		String str = "This is My name";
		//output = SihT is my eman
	
		String[] ch = str.split(" ");
		String rev = "";
		
		for(int i=0; i< ch.length; i++)
		{
			/*System.out.print(ch[i] + " ");*/
			if(i==0 || i==ch.length-1)
			{
				ch[i] = new StringBuffer(ch[i]).reverse().toString();
			}
			rev = rev + " " + ch[i];
		}
		System.out.println(rev);
	}
}
