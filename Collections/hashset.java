import java.util.*;
class Hash_Set
{
	public static void main (String [] args)
	{
		HashSet<Integer> a = new HashSet<>();
		/*
		To add elements in the stack
		a.add();

		To delete all the elements
		a.clear();

		To copy a set 
		HashSet b = new HashSet();
		b = (HashSet) a.clone();

		To check whether the element is in the set or not
		a.contains();

		To check whether set is empty or not
		a.isEmpty();

		To remove specific element
		a.remove();

		To get the sixe of the set
		a.size();

		*/

		//a.add(10);
		a.add(24);
		a.add(29);
		a.add(10);
		//a.clear();
		a.remove(10);
		HashSet b = new HashSet();
		b = (HashSet) a.clone();
		System.out.println(a.size());
		System.out.println(b);
	}
}
