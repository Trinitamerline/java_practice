import java.util.*;
class SimpleInterest
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter p,r,t:");
		float p = sc.nextFloat();
		float r = sc.nextFloat();
		float t = sc.nextFloat();
		float ans = (p*r*t)/100;
		System.out.println("Simple Interest is:"+ans); 
	}
}