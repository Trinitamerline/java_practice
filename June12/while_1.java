//Sum of digits
import java.util.*;
class WhileDemo
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int sum = 0;
		while(n!=0)
		{
			int r = n%10;
			sum = sum+r;
			n = n/10;
		}
		System.out.println("Sum of the digits are:"+sum);
	}
}