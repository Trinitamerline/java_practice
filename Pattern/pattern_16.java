/*		A
		B B
		C C C
		D D D D
		E E E E E     */

import java.util.*;
class Pattern
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		char a = 'A';
		for(int i=1;i<=n;i++)
		{ 
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
			}
			a++;
			System.out.println();
		}
	}
}