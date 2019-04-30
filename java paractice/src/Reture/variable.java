package Reture;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class variable {
	int m1() {
		System.out.println("--------int m1()-------");
		return 10;
	}
	float m2() {
		System.out.println("---------float m2()----------");
		return 20.2f;
	}
	static char m3() {
		System.out.println("-------- Char m3()----------");
	return 'A';
	}
	{
		System.out.println("=============Class Object===============");
	}
	Hello h1() {
		System.out.println("============Hello h1()=============");
		Hello n1=new Hello();
		return n1;
	}
	static Hai h2() {
		System.out.println("============Hai h2() ===============");
		return new Hai();
	}
	
	

	public static void main(String[] args) {
variable v=new variable();
int a=v.m1();
System.out.println(a);

float b=v.m2();
System.out.println(b);

char c=variable.m3();
System.out.println(c);

int d=variable.m3();
System.out.println(d);

Hello hello=v.h1();
System.out.println(hello);

Hai hai=variable.h2();
System.out.println(hai);

	}
	

}
class Hello{

	@Override
	public String toString() {
		return "helloclasstostring";
	}
	
}
class Hai{}
