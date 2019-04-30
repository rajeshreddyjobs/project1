package collection;

import java.util.*;

public class List618 {

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
		
		Iterator i=l.iterator();
		while(i.hasNext()) {
			Object obj=i.next();
		//System.out.println(obj);
		if(obj.equals("raj")) {
			i.remove();
		System.out.println(obj);
	}else if(obj.equals(30)) {
		System.out.println(obj);
		System.out.println(i.next());
	}
	}
		System.out.println(l);

}
}