package Synchronization.Durga;

public class Lab3 {

	public static void main(String[] args) {
mythread3 t1=new mythread3();
//t1.start();
t1.m1();
t1.m2();
t1.m3();
t1.m4();
t1.m5();


	}

}
class mythread3 extends Thread{
	static synchronized void m1() {
		for (int i = 0; i <5; i++) {
			System.out.println("m1()");
		}
		
	}
	static synchronized void m2() {
		for (int i = 0; i < 5; i++) {
		System.out.println("m2()");	
		}
	}
	static void m3() {
		for (int i = 0; i < 5; i++) {
			System.out.println("m3()");
		}
	}
	synchronized void m4() {
		for (int i = 0; i <5; i++) {
			System.out.println("m4()");
		}
	}
	 void m5() {
		for (int i = 0; i <5; i++) {
			System.out.println("m5()");
		}
	}
}