package IOPackage;
import java.io.*;

public class Lab691A {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("D:\\IO Package Ex\\rajesh.txt");
		BufferedInputStream bis= new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("D:\\IO Package Ex\\rajeshreddy2.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		while(true) {
		int str=fis.read();
		if(str==-1)break;
		System.out.print(str);
		
		fos.write(str);
		}
	}

}
