
package IOPackage;
import java.io.FileInputStream;
import java.io.*;

public class Lab687 {

	public static void main(String[] args) throws Exception {
FileInputStream fis=new FileInputStream ("D:\\Java practities\\IO.Package\\rajesh.txt");
BufferedInputStream bis=new BufferedInputStream(fis);

while(true) {
	int asc=bis.read();
	if(asc==-1)break;
	char ch=(char)asc;
	System.out.print(ch);
	
}
	}

}
