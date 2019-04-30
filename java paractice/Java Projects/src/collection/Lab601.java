package collection;

import java.util.*;

public class Lab601 {

	public static void main(String[] args) {
Collection col=new ArrayList();
col.add("Krishna Reddy");
col.add("Manohar Reddy");
col.add("Yuvasekhar Reddy");
col.add("Rajesh Reddy");
 System.out.println(col);
 
 
 Collection col2=new ArrayList();
 col2.add("Munemma");
 col2.add("Puspavathi");
 System.out.println(col2);

 System.out.println("==========================================");
 
 col.add(col2);
 System.out.println(col);
 
 Object [] obj=col.toArray();
 for(Object o:obj) {
	 System.out.println(o);
 }
 
 System.out.println("==========================================");
 col.remove(col2);
 col.addAll(col2);
 Iterator I=col.iterator();
 while(I.hasNext()) {
	 System.out.println(I.next());
 }
 
 System.out.println("=================ContainsAll======================");
 System.out.println(col.contains(col2));
 System.out.println(col.containsAll(col2));
 col2.add("kasthuri");
 System.out.println(col2);
 System.out.println(col.containsAll(col2));
 
 /*System.out.println("=================removeAll=====================");
 System.out.println(col);
 System.out.println(col.removeAll(col2));
 System.out.println(col);*/
 
 System.out.println("=================retainAll=====================");
 System.out.println(col);
 System.out.println(col.retainAll(col2));
 System.out.println(col);
 
	}

}
