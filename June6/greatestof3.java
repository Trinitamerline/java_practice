//Greatest of 3 numbers
import java.util.*;
class Greatest
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,b,c:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("Greatest of 3 no is:"+a);
		}
		else if(b>c)
		{
			System.out.println("Greatest of 3 no is:"+b); 
		}
		else
		{
			System.out.println("Greatest of 3 no is:"+c); 
		}
	}
}