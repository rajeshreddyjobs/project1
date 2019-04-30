package Reture;

public class classMethod {
	Hello1 m1() {
		System.out.println("=========Hello m1()==============");
		Hello1 h1=new Hello1();
		return h1;
	}
	static Hai1 m2() {
		System.out.println("==========Hai m2() ==============");
		return new Hai1();
	}
	public static void main(String[] args) {
		classMethod cm=new classMethod();
		Hello1 h2=cm.m1();
		System.out.println(h2);
		Hai1 h3=cm.m2();
		System.out.println(h3);
	}

}
class Hello1{
	int a;
	
	@Override
	public String toString() {
		return "Hello Guys . How r u";
	}
}
class Hai1{}
