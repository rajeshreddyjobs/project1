package interfaces;
public class Lab412 {

	public static void main(String[] args) {
	Hello h=new Hello();
	h.m1();
System.out.println("Hello Guys! ");
	}

}
interface inter1{
	void m1();
	public abstract void m2();
	int A=10;
	public final int B=20;
	
}
 class Hello implements inter1{
	public void m1() {
	String str="rajesh";	
	}
	
	public void m2() {
	String str="yuva";
	}
	int A=20;
	int B=40;
	}
	
 
	
