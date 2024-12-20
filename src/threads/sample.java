package threads;

import java.util.ArrayList;
import java.util.Iterator;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(30);
		a1.add(20);
		ArrayList a2=new ArrayList();
		a2.add(23.07);
		a2.add(20);
		a2.add(1,60);
		a2.add(a1);
		System.out.println(a1);
		//for(Object  values:a1) {
			//System.out.println(values);
		//}
		Iterator itr1=a1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
				
}
}