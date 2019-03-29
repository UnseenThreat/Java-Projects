import java.util.*;

public class IteratorDemo{
	public static void main(String args[]) {
		// Create an array list
		LinkedList<String> al = new LinkedList<String>();

		// add elements to the array list
		al.add("dog");
		al.add("bird");
		al.add("fish");
		al.add("cat");
		al.add("monkey");
		al.add("lizard");

		// Use iterator to display contents of al
		System.out.print("Contents of al: ");
		Iterator<String> itr = al.iterator();

		while(itr.hasNext()) {
		   String element = itr.next();
		   System.out.print(element + " ");
		}
	}
}
  