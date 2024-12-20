package threads;

import java.util.ArrayDeque;

public class ad {

	public static void main(String[] args) {
		boolean b=false;
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.addFirst(30);
		ad.addLast(40);
		System.out.println(ad);
		b=ad.contains(20);
		System.out.println(b);
	}

}
