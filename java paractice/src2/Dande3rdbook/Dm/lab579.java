package Dande3rdbook.Dm;
public class lab579 {

	public static void main(String[] args)throws Exception {
		Mythread th=new Mythread();
		//Thread t1=new Thread(th);
		System.out.println("main1()"+th.getState());
		th.start();
		System.out.println("Main2()"+th.getState());
		System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
		Thread.sleep(10000);
		System.out.println("main3()"+th.getState());
		Thread.sleep(5000);
		System.out.println("main4() "+th.getState());
		
	}

}
class Mythread extends Thread{
	 public void run() {
		Thread th=Thread.currentThread();
	for(int i=1;i<=5;i++) {
		System.out.println(i+"-  Run() Value is  "+th.getName()+"\t"+th.getState());
	try {
		Thread.sleep(1000);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}
	
	}
}