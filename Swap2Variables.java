

public class Swap2Variables {

	public static void main(String[] args) {

		int x=10;
		int y=50;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("x:  "+x+"   y: "+y);
	}

}
