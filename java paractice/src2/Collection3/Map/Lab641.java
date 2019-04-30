package Collection3.Map;

import java.util.*;

public class Lab641 {

	public static void main(String[] args) {
Map m=new HashMap();
m.put("Rajesh","Reddy");
m.put("Yuva", "Sekhar");
m.put("Manohar", "Reddy");
m.put("Krishna","Reddy");
System.out.println(m);
Set s=m.entrySet();
Iterator i=s.iterator();
while(i.hasNext()) {
	Object obj=i.next();
	Map.Entry e=(Map.Entry)obj;
	Object key=e.getKey();
	Object value=e.getValue();
	System.out.println(key+"\t"+value+"======="+key.getClass()+"\t"+value.getClass());
	
}

	}

}
