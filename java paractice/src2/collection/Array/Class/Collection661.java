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
l2.add(1);
l2.add(2);
l2.add(3);
l2.add(4);
l2.add(5);
//l2.add(6);
System.out.println(l2);
Collections.copy(l2, l);
System.out.println(l);
System.out.println(l2);

	}

}
