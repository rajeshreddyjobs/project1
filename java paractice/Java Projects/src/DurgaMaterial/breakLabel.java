package DurgaMaterial;
public class breakLabel {

	public static void main(String[] args) {
		int x=10;
		l1:
		{
		System.out.println("hello");
		if(x==10)
		break l1;
		System.out.println("hi");
		}
		System.out.println("end");

	}

}
