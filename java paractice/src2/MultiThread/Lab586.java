package MultiThread;

import java.util.ArrayList;

public class Lab586 {

	public static void main(String[] args) {
Hello2 h1=new Hello2();
MyThread2 th1=new MyThread2(h1);
MyThread2 th2=new MyThread2(h1);
th1.start();
th2.start();
	}

}
class MyThread2 extends Thread{
	Hello2 h;
	MyThread2(Hello2 h){
		this.h=h;
	}
	public synchronized void run() {
		h.show();
	}
}

class Hello2{
	synchronized void show() {
		ArrayList al=new ArrayList();
		Thread th=Thread.currentThread();
		for(int i=0;i<5;i++) {
			try {
				al.wait(1000);
				System.out.println(th.getName()+"\t"+i+"\t"+this);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}