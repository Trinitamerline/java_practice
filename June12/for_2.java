//print even numbers from 1 to n
import java.util.*;
class ForDemo
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2 == 0)	
			System.out.println(i);
		}
	}
}