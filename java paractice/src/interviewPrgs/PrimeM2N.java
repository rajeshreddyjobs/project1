
package interviewPrgs;
import java.util.Scanner;

public class PrimeM2N {

	public static void main(String[] args) {
		//String str = "Rajesh is intelligent guy, Rajesh is doing java course in java training center. Rajesh is study in SVCET college chittoor.";
		int ci, i, j, k, l=0;
        String str, str1;
        char c, ch;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        str=scan.nextLine();
        
        i=str.length();
        for(c='A'; c<='z'; c++)
        {
            k=0;
            for(j=0; j<i; j++)
            {
                ch = str.charAt(j);
                if(ch == c)
                {
                    k++;
                }
            }
            if(k>0)
            {
                System.out.println("The character " + c + " has occurred for " + k + " times");
            }
        }
	}

}
