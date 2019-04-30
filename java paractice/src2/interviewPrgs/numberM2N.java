package interviewPrgs;

public class numberM2N {

	public static void main(String[] args) {
		int M=Integer.parseInt(args[0]);
		int N=Integer.parseInt(args[1]);
		
		if(M<=N) {
			for(int i=M;i<=N;i++) {
			System.out.println(i);
		}
			}
		else {
			System.out.println("M must be less than N");
		}
		
	}

}
