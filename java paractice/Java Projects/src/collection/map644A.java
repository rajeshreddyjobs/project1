package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class map644A {

	public static void main(String[] args) {
		Map map=new LinkedHashMap();
		map.put("eid", new Integer(20));
		map.put("name","Srinivas");
		map.put("phone",new Long(9493152210l));
		System.out.println(map);
		
		/*Set data=map.entrySet();
		Iterator it=data.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			Map.Entry entry=(Map.Entry)obj;
			Object key=entry.getKey();
			Object value=entry.getValue();
			System.out.println(key+"\t"+value);
		}*/
		System.out.println("====================");
		Set key=map.keySet();
		Iterator it=key.iterator();
		while(it.hasNext()) {
		Object keys=it.next();
		System.out.println(keys);
	}
		System.out.println("========Value=========");
		Collection values=map.values();
		Iterator it2=key.iterator();
		while(it2.hasNext()) {
			Object val=it2.next();
			System.out.println(val);
		}
	
	}	

}
