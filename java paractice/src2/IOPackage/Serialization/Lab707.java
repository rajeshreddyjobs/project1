package IOPackage.Serialization;

import java.io.*;

public class Lab707 {

	public static void main(String[] args)throws Exception {
		FileOutputStream fout=new FileOutputStream("D:\\Java practities\\f2.txt"); 
		ObjectOutputStream out=new ObjectOutputStream(fout); 

stud st=new stud(32,"Rajesh Reddy",9493152210l,9);
stud.count=9;
System.out.println(st);
out.writeObject(st);
System.out.println("sucess");

}

}
class stud  implements Serializable{
	int sid;
	 transient String name="XXXXXXXXXXX";
	 transient long phone=8484848l;
	static int count=3;
	public stud(int sid, String name, long phone,int count) {
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
