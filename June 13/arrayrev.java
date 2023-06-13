//Array Reverse
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
		int j = n-1;
		for(int i=0;i<n/2;i++)
		{
			int c = a[i];
			a[i] = a[j];
			a[j] = c;
			j--;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}