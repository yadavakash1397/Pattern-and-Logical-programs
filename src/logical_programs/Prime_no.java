package logical_programs;

public class Prime_no 
{

	public static void main(String[] args) 
	{
		int a=11;
		int count=0;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0) 
			{
				count++;
				break;
			}
		}
		
		if(count==0)
		{
			System.out.println("no is prime");
		}else
		{
			System.out.println("no is not prome");
		}

	}

}
