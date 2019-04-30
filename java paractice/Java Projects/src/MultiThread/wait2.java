package MultiThread;

public class wait2 {

	public  static void main(String[] args) {
Threads t1=new Threads();
t1.start();
Thread th2=Thread.currentThread();

synchronized(th2) {
		for(int i=0;i<5;i++) {
	try {
		th2.wait(2000);
	System.out.println("Main Thread :"+Thread.currentThread());
}catch(Exception e) {
	System.out.println(e);
}}}
	}

}
class Threads extends Thread{
	public synchronized void run() {
		for(int i=0;i<5;i++) {
			try {
				wait(1000);
			System.out.println("//Threads class :"+Thread.currentThread());
		}catch(Exception e) {
			System.out.println(e);
		}}
	}
}