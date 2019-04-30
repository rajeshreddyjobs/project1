package collection;

import java.util.*;

public class Map647 {

	public static void main(String[] args) {
		Map map=new TreeMap();
		map.put("sid",new StringBuilder("20"));
		map.put("sname",new StringBuilder("Rajesh Reddy"));
		map.put("email",new StringBuilder("rajan0160"));
		map.put("phone",new Long(9493152210l));
		map.put("phone",new Long(8555938699l));
		map.put("A",123);
		
		/*System.out.println(map); 
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		Set st=map.entrySet();
		Iterator it=st.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			Map.Entry me=(Map.Entry)obj;
			Object key=me.getKey();
			Object value=me.getValue();
			System.out.println(key+"\t"+value);
		}
		
	}

}
