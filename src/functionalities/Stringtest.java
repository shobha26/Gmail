package functionalities;

public class Stringtest {
	
	public static void main(String[] args)
	{
		java.lang.String s= ("BROWSER");
		char[] ch= s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
		
		
	}
	}

