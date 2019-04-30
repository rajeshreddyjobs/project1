package multiThreading.Durga;

public class thread2 {

	public static void main(String[] args) {
Mythread1 t1=new Mythread1();
t1.start();
System.out.println("Main method");
	}

}
class Mythread1 extends Thread{
	public void run() {
		System.out.println("Run method");
	}
//	public void start() {
//		System.out.println("start method");    // is  normal method
//	}
	
}