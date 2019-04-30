package Collection2.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Lab627 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(new Student(99));
		hs.add(new Student(99));
		hs.add(new Student(99));
		/*hs.add(new Student(99));
		hs.add(new Student(99));
		hs.add(new Student(99));
		System.out.println(hs);
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj+"\t"+obj.getClass().getName());
		}*/
	}

}

class Student{
	int sid;
	Student(int sid){
		this.sid=sid;
		System.out.println("Student Constructor : "+this.sid);
	}

	public String toString() {
		return ""+sid;
	}
	public int hashCode() {
		System.out.println("** hashcode **  :"+sid);
		return sid;
	}
	public boolean equals(Object obj) {
		System.out.println("** equals() ** : "+obj);
		if(obj instanceof Student) {
			Student st=(Student)obj;
			return this.sid==st.sid;
		}
		return false;
	}
	
	
}
