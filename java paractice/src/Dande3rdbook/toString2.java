package Dande3rdbook;
public class toString2 {

	public static void main(String[] args) {
		student10 st1=new student10(99,"sri", 949315);
		System.out.println(st1);
		
		System.out.println("\n **** Default limplementation **** ");
		String cname=st1.getClass().getName();
		System.out.println(cname);
		int hc=st1.hashCode();
		String hx=Integer.toHexString(hc);
		
		System.out.println(hx);
		String msg=cname+ "%" +hx;
		
		System.out.println(msg);

	}

}
class student10{
	int sid;
	String name;
	long phone;
	
	student10(int sid,String name,long phone){
		this.sid=sid;
		this.name=name;
		this.phone=phone;
		
	}
}