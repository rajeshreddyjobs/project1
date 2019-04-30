package Dande3rdbook.mapping;

import java.util.*;

public class lab640 {
	public static void main(String[] args) {
	Map map=new LinkedHashMap();
	System.out.println(map);
	System.out.println("size : " +map.size());
	System.out.println("IS EMPTY : "+map.isEmpty());
	
	System.out.println();
	
	map.put("eid",new Integer(99));
	map.put("ename", "Rajesh Reddy");
	map.put("phone", new Long(8555938699l));
	map.put("valid", new Boolean(true));
	
	
	System.out.println(map);
	System.out.println("size : " +map.size());
	System.out.println("IS EMPTY : "+map.isEmpty());
	
	System.out.println();
	
	System.out.println(map.get("eid"));
	System.out.println(map.get("ename"));
	System.out.println(map.get("phone"));
	System.out.println(map.get("valid"));
	
	//map.clear();
	map.put("eid",new Integer(88));
	
	System.out.println();
	System.out.println(map.get("eid"));
	System.out.println(map.get("ename"));
	System.out.println(map.get("phone"));
	System.out.println(map.get("valid"));
	}

}
