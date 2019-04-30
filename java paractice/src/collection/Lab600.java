package collection;

import java.util.*;
import java.util.Collection;

public class Lab600 {

	public static void main(String[] args) {
		Vector col=new Vector();
		col.add(10);
		col.add("Rajesh");
		col.add("sd");
		col.add(3.000f);
		System.out.println(col);
		/*Object [] obj=col.toArray();
		for(int j=0;j<5;j++) {
		System.out.println(obj[j]);	
		obj[4]="raj";
		}*/
		int a=100;
		col.add();
		Enumeration e=col.elements();
		col.add(2,"Rajesh Reddy");
		while(e.hasMoreElements()) {
		
			Object obj=e.nextElement();
					System.out.println(obj);
		}
	}

}
