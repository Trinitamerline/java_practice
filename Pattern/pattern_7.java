/* 		*  
	  * * *
	* * * * *
  *	* *	* * * * 	*/
import java.util.*;
class Pattern
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int j;
		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=i;k--)
				System.out.print("  ");
			for(j=1;j<=i;j++)
				System.out.print("* ");
			j--;
			for (j=i-1;j>=1;j--)
				System.out.print("* ");
			System.out.println();
		}
	}
}