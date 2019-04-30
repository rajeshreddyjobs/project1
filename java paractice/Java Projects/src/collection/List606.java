package collection;

import java.util.*;

public class List606 {

	public static void main(String[] args) {
		
List list=new ArrayList();
list.add("Rajesh");
list.add(10);
list.add("yuva");
list.add("Krishna Reddy");

System.out.println(list);
Iterator it=list.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
System.out.println("----------ADD 3th place-----------------");
list.add(2,"raj");
list.add(1,1000);
for(Object obj:list) {
	System.out.println(obj);
}

System.out.println("=======Remove========");
list.remove(1);
list.remove(1);
System.out.println(list);

System.out.println("==========Set========");
list.set(1,"Manohar");
list.set(2, "Yuva Sekhar");

System.out.println(list);

System.out.println("===========index============");
int x=list.indexOf("Krishna Reddy");
System.out.println(x);

System.out.println(list.lastIndexOf("Krishna Reddy"));

System.out.println("========Sub String=========");
System.out.println(list.subList(1,3));
System.out.println(list.subList(2, 3));
System.out.println("----------------------------------");
System.out.println(list);
System.out.println(list.contains("Rajesh"));
list.clear();
System.out.println(list);
System.out.println("========Vector=======");
Vector v=new Vector();
Enumeration e=v.elements();
while(e.hasMoreElements()) {
	System.out.println(e.nextElement());
}
System.out.println(v);

	}

}
