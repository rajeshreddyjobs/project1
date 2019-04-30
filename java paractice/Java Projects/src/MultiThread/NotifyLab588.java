package MultiThread;

public class NotifyLab588 {

	public static void main(String[] args) {

	}

}
class Stack{
	int x;
	boolean flag=false;
	public synchronized void push(int x) {
		if(flag) {
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		this.x=x;
		System.out.println(x+"is pushed..");
		flag=true;
		notify();
	}
	synchronized public int pop() {
		if(!flag) {
			try {
				wait();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(x+"is poped");
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		flag=false;
		notify();
		return x;
	}
}