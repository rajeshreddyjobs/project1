package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Lab597A {
public static void main(String[] args) {
	Collection col=new ArrayList();
	col.add(10);
	col.add("Rajesh");
	col.add("sd");
	col.add(3.000f);
	System.out.println(col);
	Iterator i=col.iterator();
	while(i.hasNext()) {
		Object obj=i.next();
		System.out.println(obj);
	}
	
	System.out.println(col.contains("Raj"));
	System.out.println(col.contains("Rajesh"));
	System.out.println(col.contains("sd"));
	System.out.println(col.containsAll(col));
	System.out.println("-------------------------------------");
	System.out.println(col.removeAll(col));
	System.out.println(col);
	System.out.println(col.remove("Rajesh"));
	col.add("Rajesh123");
	System.out.println(col);
	col.clear();
	System.out.println(col);
	
	Object [] obj=col.toArray();
	for(int j=0;j<obj.length-1;j++) {
	System.out.println(obj[j]);	
	}
}
}
