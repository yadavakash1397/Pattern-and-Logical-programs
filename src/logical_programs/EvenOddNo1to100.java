package logical_programs;

import java.util.ArrayList;

public class EvenOddNo1to100
{

	public static void main(String[] args) 
	{
		ArrayList even=new ArrayList();
		ArrayList odd=new ArrayList();
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				//System.out.println(i);
				even.add(i);
			}
			else
			{
				odd.add(i);
				
			}
		}
		System.out.println("even nos "+even);
		System.out.println("odd nos "+odd);

	}

}
