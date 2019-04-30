package Collection3.Map;

import java.util.*;

public class Cognizent1 {
	public static void main(String[] args) {
		Map <Integer,emp> m=new LinkedHashMap<>();
		m.put(101,new emp("Rajesh", 20000));
		m.put(102,new emp("Krishna Reddy",10000000));
		m.put(103,new emp("Manohar Reddy",5000000));
		m.put(104,new emp("Yuvasekhar",90000));
		m.put(105, new emp("Rajesh",8000));
		System.out.println(m);
    
		
	}
}

class emp implements Comparable{
	
	 String ename;
	double sal;
	public emp( String ename,double sal) {
		this.ename=ename;
		this.sal=sal;
	}
	@Override
	public String toString() {
			return ename+"\t"+sal;
	}
	int compare(Object obj) {
		return
	}

}