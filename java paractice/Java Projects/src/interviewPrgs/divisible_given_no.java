package interviewPrgs;
import java.util.Scanner;
public class divisible_given_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int n=Integer.parseInt(args[0]);
		System.out.println("Enter the N value:");
		int n=sc.nextInt();	
		
		int count=0;
		for(int i=1;i<=n;i++) {
					if((n%i)==0)
						count++;
		}
						System.out.println(count);
						//System.out.println(n+"  ----->  "+i);
					
				}
	}


