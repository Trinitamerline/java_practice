//Check whether prime or not
import java.util.*;
class ForDemo
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		if(n==2)
			System.out.println("Prime");
		else if(n%2 == 0)
			System.out.println("Not Prime");
		else
		{
			int f = 1;
			for(int i=3;i<=n/2;i=i+2)
			{
				if(n%i == 0)
				{
					f = 0;
					break;
				}
			}
			if(f==1)
				System.out.println("Prime");
			else
				System.out.println("Not Prime");
		}
		
	}
}