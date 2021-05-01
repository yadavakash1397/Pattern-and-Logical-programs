package logical_programs;

public class RevNowithoutStringFun 
{

	public static void main(String[] args)
	{
		int num=153;
		int rev=0;
		int rem;
		
		for(int i=num;i!=0;i=i/10) 
		{
			rem=i%10;
			rev=(rev*10)+rem;
		}
		System.out.println("rev no is "+rev);
		
		//int to string
		String a = rev+"";

		//string to int 
		int b = Integer.parseInt(a);
	}

}
