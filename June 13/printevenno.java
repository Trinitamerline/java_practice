//print even numbers of the array
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
		for(int i=0;i<n;i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.print(a[i]+" ");
			
			}
		}

	}
}