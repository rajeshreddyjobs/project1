

public class PrimeNumber1toN {

	public static void main(String[] args) {
		int a=100;
		String primeNumber="";
		for(int i=0;i<=100;i++) {
			int counter=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0) {
					counter=counter+1;
				}
			}
			if(counter==2) {
				primeNumber=primeNumber+i+" ";
			}
		}
		System.out.println("prime Number are :\n"+primeNumber);
	}

}
