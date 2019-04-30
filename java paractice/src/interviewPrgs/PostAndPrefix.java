package interviewPrgs;

public class PostAndPrefix {

	public static void main(String[] args) {
		int i=10;
		int j=i++ + --i + --i + ++i;
		System.out.println(i++);
		System.out.println(j--);
		System.out.println(i);
		System.out.println(j);
		System.out.println("===========================");
		int a=20;
		int b=++a + a-- + --a + a++;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("===========AND===========");
		String s="rajesh";
		s="reddy";
		
		System.out.println(s);
		
		System.out.println("===========Thread Priority============");
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		
	}

}
