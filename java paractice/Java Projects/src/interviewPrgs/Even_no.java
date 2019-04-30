package interviewPrgs;

import java.util.Scanner;
public class Even_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the minimum number:");
		int m=sc.nextInt();
		System.out.println("Enter the maximum number:");
		int n=sc.nextInt();
		
		
		/*int m=Integer.parseInt(args[0]);
		int n=Integer.parseInt(args[1]);
*/		
//		if(m<=n) {
		for(int i=m;i<=n;i++) {
			if(i%2==0) { 
				System.out.println(i+"   ------------->  EVEN");
			}else {
			System.out.println(i+"   ------------->   odd");
		}

	}

}}
