package logical_programs;

public class TotalSpacesInString
{

	public static void main(String[] args) 
	{
		String s="a b c d   ";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println("no of spaces are "+count);

	}

}
