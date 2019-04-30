package collection;

import java.util.*;
import java.util.List;

public class Lab615 {

	public static void main(String[] args) {
List l=new ArrayList();
l.add("sri");
l.add("Nivas");
l.add("Rajesh");

System.out.println(l);

Iterator i =l.iterator();
//l.add("Rajesh Reddy");

//l.remove("Rajesh");

while(i.hasNext()) {
	Object obj=i.next();
	System.out.println(obj);
}
	}

}
