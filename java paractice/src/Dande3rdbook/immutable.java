package Dande3rdbook;
public class immutable {
public static void main(String[] args) {

Employee e=new Employee(101, "JLC");
System.out.println(e);
	
}
}
 final class Employee{
	private final int eid;
	private final String ename;
	public Employee(int eid, String ename) {
        this.eid = eid;
		this.ename = ename;
	}
//	public void setEid(int eid) {
//		this.eid=eid;
//	}
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", ename=" + ename + "]"; // in  source 
//	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub    // toString cntrl+space
//		return super.toString();
//	}
	
	public String toString() {
		String str=eid+"\t"+ename+"\t"+"ToString over";
		return str;
	}
	
	
	
	
	
}
// class Student extends Employee{
//	 
// }

 
 
 //immutable class Steps
 
 //1. define the class a FINAL
 //2. define private final variables
 //3. define Constructor to Intialize the instance varibales.
 //4. define getters only & Dont define Setters Methodsss
 //5. Generate or Write toString() method in your class to print the Object valuesss
 
 // then this class is Immutable or custom Immutables