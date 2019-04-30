package multiThreading.Durga;

public class RunableThread1 {

	public static void main(String[] args) {
myrunnable mr =new myrunnable();
Thread t=new Thread(mr);
Thread t2=new Thread();
t.start();
t2.start();
t2.run();

mmm m=new mmm();

Thread t1=new Thread(m);
	 t1.start();

	 //System.out.println("Thread  : "+Thread.currentThread());
for (int i = 0; i < 5; i++) {
	Thread.currentThread().setName("Rajesh");
	 System.out.println("Thread 1 : "+Thread.currentThread().getName());
}
	}

}
 class myrunnable implements Runnable{
	 public void run() {
		
		 
		  for (int i = 0; i < 5; i++) {
				 System.out.println("Thread 2 : "+Thread.currentThread().getName());
		}
		  

			
	 }

	
}
 
 class mmm implements Runnable{
	 public void run() {
		  for (int i = 0; i < 5; i++) {
			//System.out.println("Child2 Thread");
				 System.out.println("Thread 3 : "+Thread.currentThread().getName());

		}
		  

			
	 }
 }