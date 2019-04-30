package multiThreading.Durga;

public class thread4 {

	public static void main(String[] args) {
Mythread4 t1=new Mythread4();
t1.start();
for(int i=0;i<5;i++) {
System.out.println("Main()");
	}}

}
class Mythread4 extends Thread{
	
	 public void start() {
		 super.start();
		 for (int i = 0; i < 5; i++) {
			System.out.println("start");
		}
	 }
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run()");

		}
	}
}