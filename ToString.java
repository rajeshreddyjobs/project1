
 
public class ToString {
	//public static  String toString() {        //---> toString() are overridding in Object Class . it is declare
	public   String toString() {				//      instance method in object class. that's it not supported
		System.out.println("This is toString"); //      static method (public static  String toString() { ).
		return "mrr";
	}

	public static void main(String[] args) {
		ToString ts=new ToString();
		System.out.println(ts.toString());
        System.out.println("Rajesh Reddy");
	}

}
