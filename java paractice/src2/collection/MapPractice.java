package collection;

import java.util.TreeMap;

public class MapPractice {
public static void main(String[] args) {
	TreeMap tm=new TreeMap();
	tm.put(10,new Stud(10,20));
	tm.put(20,new Stud(100,200));
	System.out.println(tm);
}
}
class Stud{
	int a;
	int b;
	Stud(int a, int b){
		this.a=a;
		this.b=b;
	}
	public String toString() {
		return a+"\t"+b;
	}
}