package IOPackage.Serialization;

import java.io.*;

public class Lab709A {

	public static void main(String[] args)throws Exception {
		try(FileOutputStream fout=new FileOutputStream("D:\\Java practities\\f2.txt"); 
		ObjectOutputStream out=new ObjectOutputStream(fout); ){
Addres ad=new Addres("3-8","Nadimuru");
studs st=new studs(32,"Rajesh Reddy",9493152210l,ad);
studs.count=9;
System.out.println(st);
out.writeObject(st);
System.out.println("sucess");

}catch(Exception ex) {
	ex.printStackTrace();
}
	}
}
class Addres{
	String aid;
	String street;
	Addres(){}
	public Addres(String aid, String street) {
		super();
		this.aid = aid;
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + "]";
	}
	
}
class studs  implements Externalizable{
	int sid;
	transient String name="XXXXXXX";
	transient long phone=909090l;
	static int count=3;
	Addres add;
	public studs() {}
	public studs(int sid, String name, long phone,Addres add) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		this.add =add;
	}
	
	@Override
	public String toString() {
		return  sid + "\t" + name + "\t" + phone+ "\t" + add ;
	}
	public void writeExternal(ObjectOutput out)throws IOException {
		out.writeInt(count);
		out.writeObject(name);
		out.writeObject(add.aid);
		out.writeObject(add.street);
	}
	
	public void readExternal(ObjectInput in)throws IOException, ClassNotFoundException
	{
		count = in.readInt();
		name=in.readObject().toString();
		add=new Addres();
		add.aid=in.readObject().toString();
		add.street=in.readObject().toString();
	}
	
}
