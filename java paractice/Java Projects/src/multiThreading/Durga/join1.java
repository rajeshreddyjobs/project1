package multiThreading.Durga;

public class join1 {

	public static void main(String[] args) {
		mythread7 t2=new mythread7();
		t2.start();
		
		for(int i=0;i<5;i++) {
			try {
				t2.join();
				//t2.join(200);
				System.out.println("main()  ----> "+t2.currentThread().getName()+"----"+t2.currentThread().getPriority());

				}catch(Exception e) {
					e.printStackTrace();
				}

		}
	}

}
class mythread7 extends Thread{
	public void run() {
		
		for(int i=0;i<5;i++) {
			//System.out.println("child  ----> "+currentThread().getName()+"----"+currentThread().getPriority());

			try {
				Thread.sleep(2000);
				System.out.println("child  ----> "+currentThread().getName()+"----"+currentThread().getPriority());

			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
		}
}