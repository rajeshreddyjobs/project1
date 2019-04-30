package collection;

import java.util.Iterator;
import java.util.*;

public class Set626 {

	public static void main(String[] args) {
		//TreeSet hs=new TreeSet();
		HashSet hs=new HashSet();
		hs.add(new Student(10,"Rajesh"));
		hs.add(new Student(10,"Rajesh"));
		hs.add(new Student(10,"Rajesh"));
		hs.add(new Student(10,"Rajesh"));
		hs.add(new Student(10,"Rajesh"));
System.out.println(hs);
Iterator i=hs.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
	}

}
class Student{
	int sid;
	String sname;
	Student(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
	public String toString() {
		return sid+"  ===  "+sname;
	}
}