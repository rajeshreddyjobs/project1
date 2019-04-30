package IOPackage.Serialization;

import java.io.*;

public class Lab706 {

	public static void main(String[] args)throws Exception {
		FileOutputStream fout=new FileOutputStream("D:\\Java practities\\f1.txt"); 
		ObjectOutputStream out=new ObjectOutputStream(fout); 

student123 st=new student123(32,"Rajesh Reddy",9493152210l);
//student.count=9;
System.out.println(st);
out.writeObject(st);
System.out.println("sucess");

}

}

class person1{
	 String name="XXXXXXXXXXX";
	long phone=939393l;
}
class student123 extends person1 implements Serializable{
	int sid;
	static int count=3;

	public student123(int sid,String name,long phone) {
		super();
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return  sid + "\t" + name + "\t" + phone+ "\t" + count ;
	}
	
	
	
}