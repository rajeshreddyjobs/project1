package InstanceOf;

public class Lab124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hello h=new Hello();
System.out.println(h instanceof Hello);
System.out.println(h instanceof Object);
System.out.println(h instanceof Hello);           //Syntex :- <reference Variable> instanceof <class Name>

Object obj=new Hello();

System.out.println(obj instanceof Hello);
System.out.println(obj instanceof String);
System.out.println(obj instanceof Object);
System.out.println(obj instanceof Hello);


System.out.println("=========Conditional Operator =============");
int a=true?10:20;
int b=false?10:20;
System.out.println(a); 
System.out.println(b);

System.out.println("==========================");
int c=10>20?10:20;
int d=20>10?10:20;
System.out.println(c);
System.out.println(d);

Object obj1=10>20?10:"Twenty";
System.out.println(obj1);

	}

}
class Hello {
	void raj() {
		System.out.println("Rajesh Reddy");
	}
}