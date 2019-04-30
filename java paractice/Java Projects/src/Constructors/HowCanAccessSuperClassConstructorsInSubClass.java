package Constructors;

public class HowCanAccessSuperClassConstructorsInSubClass {

	public static void main(String[] args) {
		
B b=new B();

	}

}
class A{
	A(){
		System.out.println("This is 'A' Class Constructors");
	}
}

class B extends A{              // How to access the Super Class constructor in Sub class ?
	B(){                        // Ans) with us super keyword
		super();
		System.out.println("This is 'B' Class Constructors ");
	} 
	
	
}