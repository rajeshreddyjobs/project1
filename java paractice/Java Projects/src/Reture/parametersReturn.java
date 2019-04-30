package Reture;

import java.util.concurrent.SynchronousQueue;

public class parametersReturn {
int a=100;

public int m1(int a) {
	System.out.println("=====int m1(int a)=========");
	return a;
}
public int m2() {
	System.out.println("========int m2()==========");
	return a;
}
public int m3(int a) {
	System.out.println("========int m3(int a)===========");
	return this.a;
}
	public static void main(String[] args) {
		parametersReturn pr=new parametersReturn();
		int m1=pr.m1(10);
		System.out.println(m1);
		
		int m2=pr.m2();
		System.out.println(m2);
		
		int m3=pr.m3(20);
		System.out.println(m3);
	}

}
