package Dande3rdbook;
public class cloneing2 {

	public static void main(String[] args)throws CloneNotSupportedException {
Hai1 hai=new Hai1(10);
Hello1 h1=new Hello1(20,hai);
Hello1 h2=(Hello1)h1.clone();
h1.show();
h2.show();
System.out.println(h1==h2);
System.out.println(h1.hai==h2.hai);
System.out.println(h1.y==h2.y);
System.out.println(h1.hai.x==h2.hai.x);
System.out.println("---------------------");

h2.y=50;
h1.show();
h2.show();
System.out.println(h1==h2);
System.out.println(h1.hai==h2.hai);
System.out.println(h1.y==h2.y);
System.out.println(h1.hai.x==h2.hai.x);
System.out.println("--------------------------");
h1.hai.x=10000;
h1.show();
h2.show();
System.out.println(h1==h2);
System.out.println(h1.hai==h2.hai);
System.out.println(h1.y==h2.y);
System.out.println(h1.hai.x==h2.hai.x);
	}

}
class Hai1{
	int x;
	Hai1(int x){
		this.x=x;
	}
}
class Hello1 implements Cloneable{
	int y;
	Hai1 hai;
	Hello1(int y,Hai1 hai){
		this.y=y;
		this.hai=hai;
	}
	void show() {
		System.out.println("Hello1-->y : " +y);
		System.out.println("Hai1--> x : "+hai.x);
	}
	public Object clone() throws CloneNotSupportedException{
		if(this instanceof Cloneable) {
			Hai1 hai=new Hai1(this.hai.x);
			Hello1 h=new Hello1(this.y,hai);
			return h;
		}else {
			throw new CloneNotSupportedException(getClass().getName());
		}
	}
}