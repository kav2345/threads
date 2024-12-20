package threads;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ll {

	public static void main(String[] args) {
		LinkedList Ll=new LinkedList();
		Ll.add(50);
		Ll.add("ineuron");
		System.out.println(Ll);
		Ll.addFirst("hello");
		Ll.add(3,99);
		Ll.addLast("bangalore");
		System.out.println(Ll);
		ListIterator i1=Ll.listIterator(Ll.size());
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
		}
}
