//count of digits
import java.util.*;
class WhileDemo
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int count = 0;
		while(n!=0)
		{
			count = count+1;
			n = n/10;
		}
		System.out.println("The count of digits is :"+count);
	}
}