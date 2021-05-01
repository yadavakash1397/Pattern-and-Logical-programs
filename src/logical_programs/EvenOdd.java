package logical_programs;

import java.util.Scanner;

public class EvenOdd
{

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("enter the no");
		int a=reader.nextInt();
		
		if(a%2==0)
		{
			System.out.println("no is even");
		}
		else
		{
			System.out.println("no is odd");
		}

	}

}
