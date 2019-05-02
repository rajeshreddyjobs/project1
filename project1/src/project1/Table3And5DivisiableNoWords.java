package project1;

import java.util.Scanner;

public class Table3And5DivisiableNoWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value :");
		int a=sc.nextInt();
		for (int i = 0; i <=a; i++) {
			if((i%3)==0 && (i%5)==0) {
				System.out.println("Rajesh Yuva");
			}else if(i%3==0){
				System.out.println("Rajesh");
			}else if(i%5==0) {
				System.out.println("yuva");
			}else {
				System.out.println(i);
			}
		}
	}

}
