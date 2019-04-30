package Dande3rdbook.Dm;

public class Synchronized {

	public static void main(String[] args) {
	hello h=new hello();
//	h.m1();
//	h.m2();
	Athread ath=new Athread(h,"A");
	
	Bthread bth=new Bthread(h,"B");
/*ath.run();
bth.run();*/
	}

}
class hello{
	static synchronized void m1() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+ "  in m1() by  "+Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			
		}
		
		}
	}
	
	static synchronized void m2() {
		for(int i=65;i<='E';i++) {
			System.out.println((char)i+"  in m2() by  "+Thread.currentThread().getName() );
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
	}
}}

class Athread extends Thread{
	hello h1=new hello();
	public Athread(hello h,String tn) {
		super(tn);
		this.h1=h;
		start();
	}
	
	public void run() {
		h1.m1();
	}
}

class Bthread extends Thread{
	hello h2=new hello();
	public Bthread(hello h,String tn) {
		super(tn);
		this.h2=h;
		start();
	}
	public void run() {
		h2.m2();
	}
}