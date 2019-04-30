package interviewPrgs;

public class primeRnot {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
	boolean flag=false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
			flag=true;
			System.out.println(n+  "  \t" +i);
			break;
			}
		}
		if(flag==false) {
			System.out.println(n+"  is prime");
		}else {
			
			System.out.println(n+ "  is Not a prime");
		}
			
	}

}
