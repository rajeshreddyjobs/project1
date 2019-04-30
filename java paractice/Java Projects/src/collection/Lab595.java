package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab595 {

	public static void main(String[] args) {
Vector v=new Vector();
v.addElement("Sri");
v.addElement("vas");
v.addElement("Dande");
System.out.println(v);

Enumeration en=v.elements();
while(en.hasMoreElements()) {
	Object obj=(Object) en.nextElement();
	System.out.println(obj);
}
Iterator it=v.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

/*int [] a=new int[2];
a[0]=20;
a[1]=30;
	}*/  
}
