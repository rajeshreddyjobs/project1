package multiThreading.Durga;

public class t1 {

	public static void main(String[] args) {
rajesh12 t2=new rajesh12();
t2.start(); 
//mythread t3=new mythread();
//t3.start();
for (int i=0;i<10;i++) {
	System.out.println("Main thread method");
}
	}

}
 class rajesh12 extends Thread{
	 public void run() {
		 for(int i=0;i<10;i++) {
			 System.out.println("Run thread method");
		 }
	 }
	
 }