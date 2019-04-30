package WookBook;


public class join1 {

	public static void main(String[] args) {
		mythread7 t2=new mythread7();
		t2.start();
		String []ss=t2.s;
		
		for(int i=0;i<ss.length;i++) {
			
			try {
				if(i%2!=0) {
				t2.join();
				//t2.join(5000);
				//System.out.println("main()  ----> "+t2.currentThread().getName()+"----"+t2.currentThread().getPriority());
				
				System.out.println(ss[i]);
				}
				}catch(Exception e) {
					e.printStackTrace();
				}
			
		}
	}

}
class mythread7 extends Thread{
	String [] s= {"I","am","Rajesh","I","Know","Java"}; 
	public void run() {
		//System.out.println("child  ----> "+currentThread().getName()+"----"+currentThread().getPriority());
			for(int i=0;i<s.length;i++) {
				
			try {
				//Thread.sleep(1000);
				if(i%2==0) {
					System.out.println(s[i]);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
		}
}