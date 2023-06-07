//Greatest of 2 numbers
import java.util.*;
class Greatest
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b)
		{
			System.out.println("Greatest of 2 no is:"+a);
		}
		else
		{
		System.out.println("Greatest of 2 no is:"+b); 
		}
	}
}