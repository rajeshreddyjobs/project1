package interfaces.vs.abstracts;

public class Difference {
private final int h;   // illegal modifiers
final int j=20;
final int k;    //must initialize
private final int i=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
private final int d=20;   // illegal modifier ( inside {} block private can't use
final int f=20;
private int g=30;
	}

}
abstract class AAA{
	public static int a=10;
	private static int b;     
	//private final  int c;   // private final is un-combination modifer and key
	//final int d;            // final declare value
	final int e=20;
	private final int f=30;
	
	{
		System.out.println("Instance Block");
	}
	 static {
		 System.out.println("Static Block");
	 }
	 void A() {
		 System.out.println("Void  A Method");
	 }
	 final void B() {
		System.out.println("final void B Method"); 
	 }
	// private String c();
	 private String D() {
		 System.out.println("raj");
		 return "raj";
	 }
	public AAA() {
		System.out.println("");
	}
	  
	
	
}