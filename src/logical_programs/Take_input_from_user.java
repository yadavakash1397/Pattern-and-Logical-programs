package logical_programs;

import java.util.Scanner;

public class Take_input_from_user 
{

	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("enter two nos");
		int no1 = reader.nextInt();
		int no2=reader.nextInt();
		System.out.println("addtion is "+(no1+no2));
		
	}

}
