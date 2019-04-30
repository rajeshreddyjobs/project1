package multiThreading.Durga;

public class Priority1 {

	public static void main(String[] args) {
		A a=new A();
		a.start();
		a.setPriority(1);
		
		Thread.currentThread().setPriority(10);
		for(int i=0;i<10;i++) {
			
			System.out.println("main (): "+Thread.currentThread().getName()+"Priority : "+Thread.currentThread().getPriority());
		}
	}

}
class A extends Thread{
	 public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child ()-------"+Thread.currentThread().getName()+"Priority : "+Thread.currentThread().getPriority());
		}
	}
}