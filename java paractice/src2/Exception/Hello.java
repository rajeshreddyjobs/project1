package Exception;
public class Hello {
public static void main(String[] args) throws CloneNotSupportedException {
	
	MyThread m1[]=new MyThread[10];
	for (int i = 0; i <10; i++) {
		m1[i]=new MyThread();
		m1[i].start();
	}
	}
	
}
class Hai{
	private static Hai h;
	private Hai(){}	
	public  static Hai getHai() {
		if(h==null) {
			
			synchronized (Hai.class) {
				if(h==null)
				h=new Hai();
			}
		}
		return h;
		
	}
		
	
	}

	
class MyThread extends Thread{
	public void run() {
		System.out.println(Hai.getHai());
			}
}