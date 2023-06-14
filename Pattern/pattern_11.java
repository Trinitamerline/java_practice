/*  1
	0 1
	1 0 1
	0 1 0 1
	1 0 1 0 1	*/

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
			for(int j=0;j<i;j++)
				System.out.print(((i+j)%2)+" ");
			System.out.println();
		}
	}
}