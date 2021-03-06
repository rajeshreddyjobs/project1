package Singleton;

public class Lab537 {

	public static void main(String[] args) {
	Single s1=Single.getSingle();
	Single s2=Single.getSingle();
	System.out.println(s1==s2);
	
	Single s=(Single)s1.clone();
	System.out.println(s);
	System.out.println(s1==s);

	}

}
class Single{
	private Single() {}
	private static Single s=new Single();
	
	public static Single getSingle() {
		return s;
	}
	protected Object clone() {
		return this;
	}
}