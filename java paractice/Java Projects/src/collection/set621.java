package collection;

import java.util.*;

public class set621 {

	public static void main(String[] args) {
HashSet set=new HashSet();
set.add("rajesh");
set.add(10);
set.add(10.0);
set.add(20.90);
set.add(010);
System.out.println(set);
System.out.println(set.size());
System.out.println("===============");
for(Object obj:set) {
	System.out.println(obj.hashCode());
}
System.out.println("=================");
Iterator it=set.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
System.out.println("=================");
String st=new String("Rajesh");
String st2=new String("Rajesh");
System.out.println(st.hashCode()+"   ======      "+st2.hashCode());
System.out.println(st.equals(st2));

Integer st3=new Integer(100);
Integer st4=new Integer(0100);
System.out.println(st3.hashCode()+"   ======      "+st4.hashCode());
System.out.println(st3.equals(st4));
	}

}
