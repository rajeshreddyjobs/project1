package MultiThread;

public class Wait1 {

	public static void main(String[] args) {
Hello h1=new Hello();
MyThread m1=new MyThread(h1);
MyThread m2=new MyThread(h1);

m1.start();
m2.start();

for(int i=0;i<5;i++) {
	System.out.println("Main Thread :" +Thread.currentThread());
}
	}

}
class MyThread extends Thread{
	Hello h;
	MyThread(Hello h){
		this.h=h;
	}
	public void run() {
		h.show();
	}
}
class Hello extends Thread{
	 synchronized void show() {
		Thread th=Thread.currentThread();
		for(int i=0;i<5;i++) {
			try {
			wait(1000);
				System.out.println(th.getName()+"-Show : "+i+"\t"+this);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}