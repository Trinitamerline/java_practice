//Prime factors
import java.util.*;
class Prime
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i == 0)
			{
				boolean flag = true;
				for(int j=2;j<i/2;i++)
				{
					if(j%i == 0)
					{
						flag = false;
						break;
				    }
				}
				if(flag == true)
				System.out.println(i);
			}
			
		}
		
	}
}