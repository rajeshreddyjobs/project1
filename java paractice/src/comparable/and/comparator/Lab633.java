package comparable.and.comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class Lab633 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main Started");
TreeSet ts=new TreeSet();
ts.add(new Students1(100,"Rajesh"));
ts.add(new Students1(400,"Krishna"));
ts.add(new Students1(200,"Yuvan"));
ts.add(new Students1(300,"manohar"));
ts.add(new Students1(100,"rrrrr"));
System.out.println(ts);
Iterator it=ts.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
class Students1 implements Comparable {
	int sid;
	String name;
	Students1(int sid,String name){
		this.sid=sid;
		this.name=name;
	
	}
	public int compareTo(Object obj) {						//this.sid = obj1 and st.sid = obj2
	if(obj instanceof Students1) {
		Students1 st=(Students1)obj;
		System.out.println(this.sid+"  =====   "+st.sid);
		
		
		//return this.sid-st.sid;	    //Asscending order duplicate are not allowed
		return st.sid-this.sid;	    //descending order duplicate are not allowed
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