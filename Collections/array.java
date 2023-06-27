//import java.util;
import java.util.*;
class Arrays_
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] ={7,5,8,2,9};
		int b[] = Arrays.copyOf(a,a.length);
		Arrays.fill(a,1);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		Arrays.sort(b);
		for(int j=0;j<b.length;j++)
		{
			System.out.print(b[j]+" ");
		}

		/*

		To search a elemet in the array
		Arrays.binarySearch(a,12);   (arr_name,key)

		To get size of the array
		a.length;

		To copy the array
		Arrays.copyOf(a,n);   (arr_name,length)

		To check 2 arrays are equal or not
		Arrays.equals(a,b); (arr1,arr2)

		To fill specified element in the array
		Arrays.fill(a,1);  (arr_name,value)

		To sort the elements in the array
		Arrays.sort(a);

		*/
	}
}