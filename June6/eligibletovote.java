//Check whether the candidate is eligible to vote or not .
import java.util.*;
class EligibleToVote
{
	public static void main (String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age:");
		int age = sc.nextInt();
		if(age >= 18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
			System.out.println("You are not eligible to vote"); 
		}
	}
}