package pattern;

public class Pattern10 
{
//	*
//	**
//	***
//	****
//	***
//	**
//	*
	

	public static void main(String[] args) 
	{
		int star=1;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<4)
			{
				star++;
			}
			else
			{
				star--;
			}
			

			
		}
				
	}

}
