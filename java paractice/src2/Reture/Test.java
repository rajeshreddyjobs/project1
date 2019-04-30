package Reture;

public class Test {
Test m1() {
	System.out.println("============Test m1()============");
	Test t=new Test();
	return t;
}
Test m2() {
	System.out.println("============Test m2()============");
	return this;
}
	public static void main(String[] args) {
		
		Test t1=new Test();
		Test m1=t1.m1();
		System.out.println(m1);
		
		Test m2=t1.m2();
		System.out.println();
	}

}
