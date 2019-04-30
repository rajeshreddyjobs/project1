package multiThreading.Durga;

public class yield {

	public static void main(String[] args) {
		mythread6 t1=new mythread6();
		t1.start();
		t1.yield();
		for(int i=0;i<5;i++) {
			System.out.println("Main() ---> "+t1.currentThread().getName()+"----"+t1.currentThread().getPriority());
		}
	}

	
}
class mythread6 extends Thread{
	
 public void run() {
	 
for(int i=0;i<5;i++) {
	try {
		Thread.sleep(1000);
		System.out.println("child ---> "+currentThread().getName()+"----"+currentThread().getPriority());

	}catch(Exception e) {
		e.printStackTrace();
	} 

}

}
}