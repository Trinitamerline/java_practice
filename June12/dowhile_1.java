//Sum of Digits to single digit
import java.util.*;
class Do_WhileDemo
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int sum;
		do
		{
			sum = 0;
			while(n!=0)
			{
				int r = n%10;
				sum = sum + r;
				n = n/10;
			}
			n = sum;
		}while(sum>9);
		System.out.println(sum);
	}
}