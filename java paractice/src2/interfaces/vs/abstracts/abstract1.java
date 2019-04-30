package practice;
public class abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class shape{
	public static final int a=10;
	private int b=20;
	int c;

	abstract void ar();
	 void area() {
		 System.out.println("rajesh");
	 }
	 static {
			System.out.println("rrrr");
		}
	 {
			System.out.println("rrrr");
		}
	 shape(){
		 System.out.println("rrrrrr");
	 }
}


interface shape2{
	public static final int a=10;
	private int b=20;           //private modifier is not use
	int c;
	void ar();
	
	static {                            //static block
		System.out.println("rrrr");
	}
	
	shape(){
		 System.out.println("rrrrrr");        //constructor
	 }
	
}

interface shape3{
	
	int c;  // conform we initalise value
	void ar();
	 
	{
		System.out.println("rrrr");               //instance block
	}
	
}