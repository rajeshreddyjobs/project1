package IOPackage;
import java.io.*;

public class Lab697 {

	public static void main(String[] args) {
File file=new File("D:\\Java practities\\rr");
System.out.println("Dir Found :  "+file.exists());
file.mkdirs();
System.out.println("Dir Found : "+file.exists());
//System.out.println();
	}

}
