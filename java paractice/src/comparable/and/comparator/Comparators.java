package comparable.and.comparator;

import java.util.*;

public class Comparators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet ts=new TreeSet(new Mycomparator());
ts.add(new Student22 (100,"Rajesh Reddy"));
ts.add(new Student22 (400,"manohar Reddy"));
ts.add(new Student22 (200,"Krishna Reddy"));
ts.add(new Student22 (800,"yuvaSekhar Reddy"));
ts.add(new Student22 (600,"Puspavathi"));
	System.out.println(ts);
	Iterator it=ts.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}

}
class Student22{
int sid;
String sname;
Student22(int sid,String sname){
	this.sid=sid;
	this.sname=sname;
}
public String toString(){
	return sid+" ====== "+sname;
}
}

class Mycomparator implements Comparator{
	/*public int compare(Object obj1,Object obj2) {
		Student22 st1=(Student22)obj1;
		Student22 st2=(Student22) obj2;
		return st1.sid-st2.sid;
	}
	*/
	public int compare(Object obj1,Object obj2) {
		Student22 st1=(Student22)obj1;
		Student22 st2=(Student22) obj2;
		//return st1.sname.compareToIgnoreCase(st2.sname);
		String str1=st1.sname.toUpperCase();
		String str2=st2.sname.toUpperCase();
		return str1.compareTo(str2);
		//return str1.compareToIgnoreCase(str2);
		//return str1.compareTo(str2);
	}
	
	
}