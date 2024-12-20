package threads;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;

public class hm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap hm=new LinkedHashMap();
		hm.put(10,"Sachin");
		hm.put(7, "MSD");
		hm.put(18,"kohli");
		System.out.println(hm);
		//for(Object obj:hm.keySet()) {
			//System.out.println(obj);
		//}
		Collection c=hm.entrySet();
		Iterator i1=c.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}