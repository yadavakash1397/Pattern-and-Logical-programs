package logical_programs;

public class ArmStrongNo 
{

	public static void main(String[] args) 
	{
		int num=153;
		int rem;
		int sum=0;
		
		
		for(int i=num;i!=0;i=i/10)
		{
			rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		if(sum==num)
		{
			System.out.println("no is armstrong");
		}
		else
		{
			System.out.println("no not armstrong");
		}

	}

}
