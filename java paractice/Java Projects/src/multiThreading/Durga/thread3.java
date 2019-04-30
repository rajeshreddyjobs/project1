package multiThreading.Durga;

public class thread3 {

	public static void main(String[] args) {
		mythread3 t1=new mythread3();
		t1.start();
		for(int i=0;i<5;i++) {
		System.out.println("main method");
		
	}}

}
class  mythread3 extends Thread{
	public void run(){
		for ( int i=0;i<5;i++) {
		System.out.println("mythread3 class");
	}}
	
}