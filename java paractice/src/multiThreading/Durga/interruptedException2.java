package multiThreading.Durga;

public class interruptedException2 {
public static void main(String[] args) {
	rajesh14 r=new rajesh14();
	r.start();
	
	//r.interrupt();
	
	System.out.println("End main() "+Thread.currentThread());
}
}
class rajesh14 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("i am child 1");
		}
		System.out.println("sleep is ready");
		try {
			sleep(1000);
			System.out.println("sleep () ");
		}catch(Exception e) {
			System.out.println("sleep exception  :   " );
			//e.printStackTrace();
		}
}}
