/*
          A
        A B A
      A B C B A
    A B C D C B A
  A B C D E D C B A        */


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
			char a = 'A';
			for(int k=n;k>=i;k--)
				System.out.print("  ");
			for(j=1;j<=i;j++)
				System.out.print((a++)+" ");
			j--;
			char b = --a;
			for (j=i-1;j>=1;j--)
				System.out.print((--b)+" ");
			System.out.println();
		}
	}
}