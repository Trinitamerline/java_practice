import java.util.*;
class Tree_Set
{
	public static void main (String [] args)
	{
		TreeSet<Integer> a = new TreeSet<>();
		/*
		To add elements in the stack
		a.add();

		To delete all the elements
		a.clear();

		To copy a set 
		TreeSet b = new TreeSet();
		b = (TreeSet) a.clone();

		To check whether the element is in the set or not
		a.contains();

		To return the first lowest element in the set
		a.first();
		
		To return the first largest element in the set
		a.last();

		To retrieve and delete the first lowest element in the set , or returns null if the set is empty
		a.pollFirst();

		To retrieve and delete the first largest element in the set , or returns null if the set is empty
		a.pollLast();

		To return the first smaller no ,from the specified no , prints the acutal no if it is present or null.
		a.floor(20);

		To return the first greater no ,from the specified no , prints the acutal no if it is present or null.
		a.ceiling(11);

		To check whether set is empty or not
		a.isEmpty();

		To return the first greater no ,from the specified no ,  otherwise null.
		a.higher(20);

		To return the first smallest no ,from the specified no ,  otherwise null.
		a.lower(20);

		To remove specific element
		a.remove();

		To get the size of the set
		a.size();

		*/
		// addAll() ,comparator() ,descendingIterator(),descendingSet(),headSet(),iterator(),spilterator(),subSet(),trailSet().
		a.add(24);
		a.add(29);
		a.add(10);
		TreeSet b = new TreeSet();
		b = (TreeSet) a.clone();
		System.out.println(a.size());
		System.out.println(b);
	}
}
