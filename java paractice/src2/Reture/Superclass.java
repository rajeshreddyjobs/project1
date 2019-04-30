package Reture;

public class Superclass {

	public static void main(String[] args) {

		AAA H1=new AAA();
		System.out.println("AAA cls object :" +H1);
		System.out.println("AAA cls object :" +H1.hashCode());
		System.out.println("AAA cls Object H1.h() : "+H1.h());
		Object obj=H1.h();
		System.out.println("Object obj=H1.h(); : "+ obj);
		
		
	}

}

class AAA{
	Hai2 h() {
		System.out.println("=====================");
		System.out.println("Hai cls : "+new Hai2());		
		System.out.println("Good cls : "+new Good());
		return new Hai2();
}
	Good h2() {
		System.out.println("=====================");
		System.out.println("Good cls : "+new Good());
		return new Good();
}
	
}
class Hai2{
	static {
		System.out.println("Hai2 Static Block : ");
	}
	@Override
	public String toString() {
		
		return "This is Hai cls toString()";
	}
}
class Good{
static AAA a() {
	System.out.println("+++++++++++++++++++");
	System.out.println("Good cls declear in AAA() :"+new Good());
	return "Good cls a() return "+new AAA();

}
}