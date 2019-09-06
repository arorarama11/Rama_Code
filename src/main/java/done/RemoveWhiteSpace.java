package done;

public class RemoveWhiteSpace {

	public static void main(String[] args)
	{
		String str = "Rama Arora is a hard working";
		char[] ch = str.toCharArray();
		StringBuffer sf = new StringBuffer();
		
		for(int i=0; i< ch.length; i++)
		{
			if((ch[i] != ' ') && (ch[i] != '\t'))
			{
				sf.append(ch[i]);
			}
		}
		System.out.println(sf);
	}
}
