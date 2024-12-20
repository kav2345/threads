package threads;

import java.util.PriorityQueue;

public class pq {

	public static void main(String[] args) {
		boolean b=false;
		PriorityQueue pq=new PriorityQueue();
		pq.add(10);
		pq.add(40);
		pq.add(20);
		b=pq.contains(20);
		System.out.println(pq);
		}

}
