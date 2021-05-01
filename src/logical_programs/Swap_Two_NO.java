package logical_programs;

public class Swap_Two_NO 
{

	public static void main(String[] args) 
	{
		int a=12;
		int b=34;
		
		a=a+b;   //a=46 b=34
		b=a-b;	 //a=46 b=12
		a=a-b;	 //a=34 b=12
		
		System.out.println("a="+a+" b="+b);
		

	}

}
