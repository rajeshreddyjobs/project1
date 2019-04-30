
package interviewPrgs;
import java.util.Scanner;
public class ionidea1 {

	public static void main(String[] args) {
		System.out.println("Enter the String :");
		String[] str=new Scanner(System.in).nextLine().split(" ");
		int count=0;
		
		for(String string1:str) {
			if(string1.equalsIgnoreCase("Rajesh")) {
				count++;
			}
			
		}
		System.out.println(count);

	        
	}

}
