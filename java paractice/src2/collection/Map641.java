package collection;
import java.util.*;
public class Map641 {

	public static void main(String[] args) {
Map map=new LinkedHashMap();
map.put("sid",new Integer(99));
map.put("sname","Rajesh Reddy");
map.put("email","rajan0160@");
map.put("phone",new Long(9493152210l));
System.out.println(map);
System.out.println(map.containsKey("sid"));
System.out.println(map.containsKey("email"));

System.out.println(map.containsValue(new Integer(99)));
System.out.println(map.containsValue("Rajesh Reddy"));

System.out.println("Remove- Sid : "+map.remove("sid"));
System.out.println(map);

System.out.println("Put - Phone : "+map.put("phone",new Long(8555938699l)));
System.out.println(map);

map.put("sid",new Integer(99));
System.out.println("put- sid: "+map.put("sid",new Integer(100)));
System.out.println(map);

System.out.println("Get()-sid : "+map.get("sid"));
System.out.println("Get() - email : "+map.get("email"));


System.out.println("===================KEYS================================");
Set keys=map.keySet();
Iterator it=keys.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

System.out.println("====================Values=============================");
Collection col=map.values();
Iterator it1=col.iterator();
while(it1.hasNext()) {
	System.out.println(it1.next());
}
/*System.out.println("---------------");
while(it.hasNext()) {
	System.out.println(it.next());
}*/
System.out.println("===============Add Other Map (combained)==================");
Map mymap=new LinkedHashMap();
mymap.put("A", new Integer(89));
mymap.put("B", new Integer(99));
mymap.put("C", new Integer(94));
System.out.println(mymap);

System.out.println("=================Map2 elts are add in Map1==================");
	map.putAll(mymap);
	System.out.println(map);
	
	Set st=map.keySet();
	System.out.println(st);
	
	System.out.println(st.getClass().getName());
	Collection col1=map.values();
	System.out.println(col1);
	System.out.println(col1.getClass().getName());
	}

}
