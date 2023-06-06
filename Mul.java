import java.util.*;
class Multiplication
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = a*b*c;
		System.out.println("Multiplication of 3 number is:"+ans); 
	}
}