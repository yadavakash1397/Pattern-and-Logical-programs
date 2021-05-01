package logical_programs;

import java.util.Arrays;

public class Compare_two_Arrays 
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,30};
		int b[]= {10,20,40};
		if(Arrays.equals(a, b))
		{
			System.out.println("arrays are equal");
		}
		else
		{
			System.out.println("arrays are not equal");
		}
		
		int m1[][]= {{10,20,30},{40,50,70}};
		int m2[][]= {{10,20,30},{40,50,60}};
		
		System.out.println(Arrays.deepEquals(m1, m2));
	}

}
