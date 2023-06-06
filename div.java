import java.util.*;
class Division
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		float ans = a/b;
		System.out.println("Division of 2 number is:"+ans); 
	}
}