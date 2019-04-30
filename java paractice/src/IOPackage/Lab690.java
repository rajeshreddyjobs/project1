package IOPackage;
import java.io.*;

public class Lab690 {

	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("D:\\IO Package Ex\\rajesh.txt");
		FileOutputStream fos=new FileOutputStream("D:\\IO Package Ex\\rajeshreddy.txt");
		
       /*InputStreamReader isr=new InputStreamReader(fis);
		
		BufferedReader bis=new BufferedReader(isr);
		String str=bis.readLine();
		
		System.out.println(str);*/
		
		while(true) {
		int st=fis.read();
		if(st==-1)break;
		System.out.println(st);
		fos.write(st);
		System.out.println("complete prg");
		}
		
		
		
		
		/*InputStreamReader isr=new InputStreamReader(fis);
		
		BufferedReader bis=new BufferedReader(isr);
		String str=bis.readLine();
		
		System.out.println(str);*/
		
		}
	}


