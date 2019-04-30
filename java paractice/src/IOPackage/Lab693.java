package IOPackage;
import java.io.*;

public class Lab693 {

	public static void main(String[] args)throws Exception {
PrintWriter pw=new PrintWriter("WELCOME.txt");
pw.print(97);
pw.print(67);
pw.print("rajesh");
pw.print("Reddy");
pw.print(true);
String s=String.valueOf(pw);
System.out.println(s);
pw.close();
	}

}
