package collection.Array.Class;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Collection662 {

	public static void main(String[] args) {
Set s=Collections.singleton("JLc");    //singleton
System.out.println(s);
//s.add("hello");

List l=Collections.singletonList("rajesh");
System.out.println(l);
//l.add("raj");

System.out.println("================================");

List l2=new ArrayList();
l2.add("Srini");
l2.add("raj");
l2.add("yuva");
l2.add("monohar");
l2.add("Krishna");

System.out.println(l2);
System.out.println("Replacing SD");

Collections.replaceAll(l2,"raj", "Rajesh");
System.out.println(l2);
System.out.println("============Max============");
Object mx=Collections.max(l2);
System.out.println("max : "+mx);

Object mn=Collections.min(l2);
System.out.println("min : "+mn);


/*System.out.println("==========Fill=================");
Collections.fill(l2,"Krishna Reddy");
System.out.println(l2);*/

System.out.println("==========Reverse=================");
Collections.reverse(l2);
System.out.println(l2);

System.out.println("==========Rotate=================");
Collections.rotate(l2,2);
System.out.println(l2);

System.out.println("==========shuffle=================");
for(int i=0;i<l2.size();i++) {
	Collections.shuffle(l2);
	System.out.println(l2);
	
}
System.out.println("========Sort==========");
Collections.sort(l2);
System.out.println(l2);
	}

}
