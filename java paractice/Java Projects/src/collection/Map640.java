package collection;

import java.util.*;

import javax.print.attribute.Size2DSyntax;

public class Map640 {

	public static void main(String[] args) {
Map map=new LinkedHashMap();
System.out.println(map);
System.out.println("Size : "+map.size());
System.out.println("Is Empty :"+map.isEmpty());

map.put("sid",new Integer(1));
map.put("sname","Rajesh Reddy");
map.put("email","rajan0160@");
map.put("phone",new Long(9493152210l));

System.out.println(map);
System.out.println("Size : "+map.size());
System.out.println("Is Empty :"+map.isEmpty());

Map map2=new HashMap();


	}

}
