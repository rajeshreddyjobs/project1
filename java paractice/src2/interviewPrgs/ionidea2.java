package interviewPrgs;

import java.util.Scanner;


public class ionidea2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str1=sc.nextLine();
		
		int count=0;
	
	String [] str4=str1.split(" ");
	
	for(String str3:str4) {
		System.out.println(str3);
		if(str3.equalsIgnoreCase("java")) {
		
			count++;
	}}
	System.out.println("\n" +count);
	//System.out.println(str1.split(" "));
	}

}
//java is java dfadsfk java jaflkfm java jfskfjoi
