package multiThreading.Durga;

public class Join2 {
public static void main(String[] args)throws Exception {
	myThread.mt=Thread.currentThread();
	myThread t=new myThread();
	t.start();
	//t.join();

	for(int i=0;i<5;i++) {
		Thread.sleep(2000);
		System.out.println("main Thread");
	}
}
}
class myThread extends Thread{
	static Thread mt;
	public void run() {
		try {
//			mt.join(5000);
			mt.join();
			for(int i=0;i<5;i++) {
				Thread.currentThread().sleep(1000);
				System.out.println("child Thread"+Thread.currentThread());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}