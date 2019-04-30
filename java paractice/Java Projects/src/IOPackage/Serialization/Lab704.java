package IOPackage.Serialization;

import java.io.*;

public class Lab704 {

	public static void main(String[] args)throws Exception {
		FileOutputStream fout=new FileOutputStream("D:\\Java practities\\f.txt"); 
		ObjectOutputStream out=new ObjectOutputStream(fout); 

student st=new student(32,"Rajesh Reddy",9493152210l,9);
student.count=9;
System.out.println(st);
out.writeObject(st);
System.out.println("sucess");

}

}
class student  implements Serializable{
	int sid;
	 String name;
	 long phone;
	static int count=3;
	public student(int sid, String name, long phone,int count) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		this.count=count;
	}
	
	@Override
	public String toString() {
		return  sid + "\t" + name + "\t" + phone+ "\t" + count ;
	}
	
}
