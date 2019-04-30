package Dande3rdbook;
public class tostring1 {

	public static void main(String[] args) {
		Student1 st1=null;
		System.out.println(st1);
		st1=new Student1(99,"sri");
		System.out.println(st1);
System.out.println(st1.hashCode());
String str=new String("java Learning Center");
System.out.println(str);

Integer ref=new Integer(123);
System.out.println(ref);
	}

}
class Student1{
	int sid;
	String name;
	
	Student1(int sid,String name){
		this.sid=sid;
		this.name=name;
	}

public int hashCode(){
	return sid;
}
public String toString() {
	return sid+"\t"+name;
}

}