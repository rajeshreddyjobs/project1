package collection.Array.Class;


import java.util.*;

public class Collection661 {

	public static void main(String[] args) {
List l=new ArrayList();
l.add("Srini");
l.add("raj");
l.add("yuva");
l.add("monohar");
l.add("Krishna");

System.out.println(l);

List l2=new ArrayList();
Collections.addAll(l2,1,10,2,2,5,8,3,4,15,5,6);
		/*
		 * l2.add(1); l2.add(10); l2.add(2); l2.add(2); l2.add(5); l2.add(8); l2.add(3);
		 * l2.add(4); l2.add(15); l2.add(5);l2.add(6);
		 */
System.out.println(l2);

Collections.swap(l, 0, 4);                      //Collections.swap(args1, args2, args3); :- Swap the list Object to our required index place
System.out.println("Swap : "+l);
System.out.println();

Collections.sort(l2);
System.out.println("sort order : "+l2);
System.out.println();

Collections.sort(l2,Comparator.reverseOrder());
System.out.println("sort + ReverseOrder() :  "+l2);
System.out.println();

Collections.reverse(l2);
System.out.println("Reverse() : "+l2);

System.out.println();

Collection checkedList=Collections.checkedCollection(l2, String.class);
System.out.println("CheckedCollection : "+checkedList);
System.out.println();

Collections.copy(l2, l);
System.out.println("Copy l : "+l);
System.out.println("Copy l2 : "+l2);
System.out.println("Copy l : "+l);
System.out.println();



	}

}
