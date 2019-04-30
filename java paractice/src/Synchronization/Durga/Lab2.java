package Synchronization.Durga;
class Display2 extends Thread{
	static synchronized void wish(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("hai how are you  ");
	try {
		Thread.sleep(1000);
		
	}catch(Exception e) {
		
	}
	System.out.println(name);
	}}
}

class MyThread2 extends Thread{
	Display2 d1;
	String name;
	 
	MyThread2 (Display2 d1,String name){
		this.d1=d1;
		this.name=name;
	}
	public void run() {
		d1.wish(name);
	}
}

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Display2 d1=new Display2();
Display2 d2=new Display2();

MyThread2 m1=new MyThread2(d1,"Rajesh");
MyThread2 m2=new MyThread2(d2,"Yuva");
m1.start();
m2.start();
/*d1.wish("Rajesh");
d1.wish("yuva");*/
	}

}
