import java.util.*;
class Area
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base & height");
		float base = sc.nextFloat();
		float height = sc.nextFloat();
		float ans = (base*height)/2;
		System.out.println("Area of triangle is:"+ans); 
	}
}