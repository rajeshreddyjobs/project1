package collection;

import java.util.*;

public class Map651 {

	public static void main(String[] args) {
Map <Integer, String> map=new  LinkedHashMap<Integer, String>();
map.put(10,"rajesh");
map.put(20,"mrr");
map.put(30, "yuva");
map.put(40,"manohar");
System.out.println(map);
Set <Map.Entry<Integer,String>> set=map.entrySet();
Iterator <Map.Entry<Integer,String>> it=set.iterator();
while(it.hasNext()) {
	//System.out.println(it.next());
	Map.Entry<Integer,String> entry=it.next();
	Integer key=entry.getKey();
	String Value=entry.getValue();
	System.out.println(key+"\t"+Value);
	
}

	}

}
