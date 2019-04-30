package comparable.and.comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class Comparables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main Started");
TreeSet ts=new TreeSet();
ts.add(new Stud(100,"Rajesh"));
ts.add(new Stud(400,"Krishna"));
ts.add(new Stud(200,"Yuvan"));
ts.add(new Stud(300,"manohar"));
ts.add(new Stud(100,"rrrrr"));

Iterator it=ts.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
class Stud implements Comparable {
	int sid;
	String name;
	Stud(int sid,String name){
		this.sid=sid;
		this.name=name;
	
	}
	public int compareTo(Object obj) {						//this.sid = obj1 and st.sid = obj2
	if(obj instanceof Stud) {
		Stud st=(Stud)obj;
		String str1=this.name.toUpperCase();
		String str2=st.name.toUpperCase();
		System.out.println(str1+"  =====   "+str2);
		return str1.compareTo(str2);
		
		//return this.sid-st.sid;	    //Asscending order duplicate are not allowed
		//return st.sid-this.sid;	    //descending order duplicate are not allowed
		//return 1;					//user defined forward duplicate are 100 allowed	
		//return -1;					//user defined reverse duplicate are 100 allowed		
		//return this.sid-st.sid;    //user defined forward duplicate 100 not allowed
		//return -this.sid-st.sid;	//user defined reverse duplicate are 100 allowed	
		//return -st.sid-this.sid;        //user defined reverse duplicate are 100 allowed		

	}
	return 0;
	}
	public String toString() {
		return sid+"-----"+name;
	}
}