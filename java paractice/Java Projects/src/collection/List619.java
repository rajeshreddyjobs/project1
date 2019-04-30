package collection;

import java.util.*;

public class List619 {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("rajesh");
		l.add("raj");
		l.add("yuva");
		l.add(30);
		l.add(true);
		l.add(20.89);
		System.out.println(l);
		System.out.println(l.size());
		
		ListIterator i=l.listIterator();
		System.out.println("===========Forward Order================");
		while(i.hasNext()) {
			Object obj=i.next();
			System.out.println(obj);
		}
		System.out.println("===========Reverse Order===============");
		while(i.hasPrevious()) {
		Object obj=i.previous();
		System.out.println(obj);
		}
}
}