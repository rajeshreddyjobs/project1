package multiThreading.Durga;

public class InterruptedException {

	public static void main(String[] args) {
		rajesh13 r=new rajesh13();
		r.start();
		try {
		Thread.currentThread().sleep(1000);
		System.out.println("rajesh main");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
class rajesh13 extends Thread{
	 public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("rajesh1");
			try {
				sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}