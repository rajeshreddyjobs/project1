package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Map652 {

	public static void main(String[] args) {
		HashSet hm=new HashSet();
		hm.add(20);
		hm.add(new Integer(25));
		hm.add("String");
		hm.add(new Byte((byte) 90));
		Iterator it=hm.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj+"\t Class :"+obj.getClass()+"\t Name: "+obj.getClass().getName());
		}

	}

}
