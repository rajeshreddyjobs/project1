package multiThreading.Durga;

public class childjoin {

	public static void main(String[] args)throws Exception {
Rajesh1.mt=Thread.currentThread();
Rajesh1 r=new Rajesh1();
r.start();

System.out.println(Thread.currentThread());
for(int i=0;i<5;i++) {
	r.sleep(2000);
	System.out.println("main-->"+Thread.currentThread());
}
	}

}
class Rajesh1 extends Thread{
	static Thread mt;
	public void run() {
		try {
			mt.join();
      for(int i=0;i<5;i++) {
				
				System.out.println("child"+currentThread());
			}
		}catch(Exception e) {
			
			//e.printStackTrace();
		}
	}
}