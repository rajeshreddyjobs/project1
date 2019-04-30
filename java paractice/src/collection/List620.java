package collection;

import java.util.*;

public class List620 {

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
		
		ListIterator li=l.listIterator(2);
		l.add("rr");
		System.out.println("=========Reverse==========");
		do {
			int indx=li.previousIndex();
			Object obj=li.previous();
			System.out.println(indx+"---------"+obj);
		}while(li.hasPrevious());
		System.out.println("=========forward==========");
		do {
			int indx=li.nextIndex();
			Object obj=li.next();
			System.out.println(indx+"---------"+obj);
		}while(li.hasNext());
		
		System.out.println("=========Reverse===========");
		do {
			int indx=li.previousIndex();
			Object obj=li.previous();
			System.out.println(indx+"---------"+obj);
		}while(li.hasPrevious());
}
}