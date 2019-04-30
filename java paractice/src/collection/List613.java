package collection;

import java.util.*;

public class List613 {

	public static void main(String[] args) {
		Stack l=new Stack();
	System.out.println(l.capacity());
	System.out.println(l.size());
		l.add("rajesh");
		l.add("raj");
		l.add("yuva");
		l.add(30);
		l.add(true);
		l.add(20.89);
		System.out.println(l);
		System.out.println(l.capacity());
		System.out.println(l.size());
		System.out.println(l);
		l.addElement("krishna");
		Enumeration e=l.elements();
		  while(e.hasMoreElements()) 
			System.out.println(e.nextElement());
		  
		  System.out.println("============================================================");
		
		List l1=new ArrayList(l);
		System.out.println("-----"+l1+"-----");
			
									
		Iterator i=l.iterator();
		//l.add("rrrr");
		while(i.hasNext()) {
		System.out.println(i.next());
	}
	}
}
