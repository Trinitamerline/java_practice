/*		A
		A B
		A B C
		A B C D
		A B C D E   */

import java.util.*;
class Pattern
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{ 
			char a = 'A';
			for(int j=1;j<=i;j++)
			{
				System.out.print((a++)+" ");
			}
			System.out.println();
		}
	}
}