
package IOPackage;
import java.io.*;

public class Lab689 {

	public static void main(String[] args)throws Exception {
FileInputStream fis=new FileInputStream("D:\\Java practities\\f.txt");
InputStreamReader isr=new InputStreamReader(fis);
BufferedReader br=new BufferedReader(isr);

String id=br.readLine();
System.out.println(id );
/*while(true) {
	String id1=br.readLine();
	if(id1==null)break;
	System.out.println(id1);
	
}*/
	}

}
