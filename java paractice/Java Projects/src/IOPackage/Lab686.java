
package IOPackage;
import java.io.*;

public class Lab686 {

	public static void main(String[] args)throws Exception {
System.out.println(" Enter the Data :");
try(FileInputStream fis=new FileInputStream("D:\\Java practities\\IO.Package\\rajesh.txt");
BufferedInputStream bis=new BufferedInputStream(fis);){
while(true) {
	int asc=bis.read();
	System.out.println(asc);
	if(asc==-1)break;
//	if(asc==13||asc==10) break;
	
		char ch=(char)asc;
		System.out.println(ch+"----"+asc);
}}catch (Exception e) {
e.printStackTrace();}

	}

}
