//print the count for odd and even numbers
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
		int ce = 0;
		int co = 0;
		for(int i=0;i<n;i++)
		{
			if(a[i] % 2 == 0)
				ce=ce+1;
			else
				co=co+1;
		}
		System.out.println("The count of even numbers is:"+" "+ce);
		System.out.println("The count of odd numbers is :"+" "+co);
	}
}