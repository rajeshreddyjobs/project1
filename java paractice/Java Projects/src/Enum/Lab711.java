package Enum;

public class Lab711 {

	public static void main(String[] args) {
direction d1=null;
d1=direction.East;
System.out.println("== "+d1);
	}

}
enum direction{
	East,North,South,West;
	direction(){
		System.out.println("Direction() Def "+this);
	}
	static {
		System.out.println("** Static Block in Direction class ");
	}
	void m1() {
		System.out.println("m1() Method");
	}
	Easts(){
		void show() {
			
		}
	}
}