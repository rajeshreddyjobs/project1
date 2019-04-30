package Annototion;

public class Lab730 {

	public static void main(String[] args) {
Student st=new Student(32,"Sri");
System.out.println(st);

	}

}
class Student{
	int sid;
	String sname;
	Student(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
		
	}


Student(String name){}
public String toString() {
	return sid+"\t"+sname;
}
}