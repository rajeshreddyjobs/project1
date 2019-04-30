package IOPackage;
import java.io.*;

public class Lab688 {

	public static void main(String[] args) throws Exception{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("enter the statement");
		
		String id=br.readLine();
		System.out.println("Enter the name");
		String nm=br.readLine();
		
	System.out.println(id+"----"+nm);
	
		
	}

}
