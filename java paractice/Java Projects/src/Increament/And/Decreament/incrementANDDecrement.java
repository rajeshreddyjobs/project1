package Increament.And.Decreament;

public class incrementANDDecrement {

	public static void main(String[] args) {
	int a=10;
	int b=--a+ a++ + ++a + a--;     //9+9+11+11 =40
	System.out.println(b);
	System.out.println(b+b++);     //40+40 =80
	System.out.println(a);			//10
	a=a++ + ++a+ ++a;               //10+12+13  =35
	System.out.println(a);
	}
	}