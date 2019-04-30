package IOPackage;
import java.io.*;

public class Lab691 {

	public static void main(String[] args)throws Exception {
		FileReader fr=new FileReader("D:\\Java practities\\IO.Package\\rajeshreddy.txt");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter("D:\\\\Java practities\\\\IO.Package\\\\rajeshreddy1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		
		String st=br.readLine();
		System.out.println(st);
		
		bw.write(st);
		//bw.newLine();
		bw.close();
	}

}
