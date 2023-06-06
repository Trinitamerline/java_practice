import java.util.*;
class CompoundInterest
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter p,r,n:");
		float p = sc.nextFloat();
		float r = sc.nextFloat();
		float n = sc.nextFloat();
		double ans = p*Math.pow(1+r/100,n)-p;
		System.out.println("Compund Interest is:"+ans); 
	}
}