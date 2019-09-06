package done;

public class PraticeStarted {

	public static void main(String[] args)
	{
		String str = "we are looking for good writers";
		
		//We Are Looking For Good Writers
		
		String[] strings = str.split(" ");
		    
		    for(int i=0; i < strings.length; i++)
		    {
		        String a =  strings[i].substring(0, 1).toUpperCase();	
		        String s = a + strings[i].substring(1,strings[i].length());
		        System.out.print(s + " ");
		    }
	
		   
	}
}
