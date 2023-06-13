//Swap adjacent
import java.util.*;
class Array
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+" element:");
			a[i]= sc.nextInt();
		}
		if(n%2 == 0)
		{
			for(int i=0;i<n;i=i+2)
			{
				for(int j=i+1;j<=i+1;j++)
				{
					int c = a[i];
					a[i] = a[j];
					a[j] = c;
				}
			}
		}
		else
		{
			for(int i=0;i<n-1;i=i+2)
			{
				for(int j=i+1;j<=i+1;j++)
				{
					int c = a[i];
					a[i] = a[j];
					a[j] = c;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}