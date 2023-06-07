//Check whether given number lies between 50-100 or not?
import java.util.*;
class Number
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		if(n>=50 && n<=100)
		{
			System.out.println("The number lies between 50-100");
		}
		else
		{
			System.out.println("The number does not lies between 50-100"); 
		}
	}
}