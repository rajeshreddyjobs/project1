package IOPackage.Serialization;

import java.io.*;

public class Lab705 {

	public static void main(String[] args)throws Exception {
		try(FileInputStream fout=new FileInputStream("D:\\Java practities\\f2.txt"); 
		ObjectInputStream out=new ObjectInputStream(fout); ){

Object obj=out.readObject();
System.out.println(obj);
System.out.println("Deserialized successfully");

}catch(Exception ex) {
	System.out.println(ex);
	ex.printStackTrace();
}
	}
}


/*class students12  implements Serializable{
	int sid;
	 String name;
	long phone;

	public students12(int sid, String name, long phone) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return  sid + "\t" + name + "\t" + phone;
	
}}*/