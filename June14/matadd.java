import java.util.*;
class Array
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter r1 & c1:");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int a[][] = new int[r1][c1];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.println("Enter "+(i+1)+" row "+(j+1)+" element:");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter r2 & c2:");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		int b[][] = new int[r2][c2];
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.println("Enter "+(i+1)+" row "+(j+1)+" element:");
				b[i][j] = sc.nextInt();
			}
		}
		int c[][] = new int[r1][c1];
		if(r1==r2 && c1==c2)
		{
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					c[i][j] = a[i][j]+b[i][j];
				}
			}
		}
		else
		{
		System.out.println("Matrix Addition is not applicable");
		}

		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}