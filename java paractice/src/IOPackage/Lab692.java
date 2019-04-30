package IOPackage;
import java.io.*;

public class Lab692 {

	public static void main(String[] args) throws Exception{
		try(InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		FileWriter fos=new FileWriter("D:\\Java practities\\IO.Package\\rajeshreddy3.txt",true);
		BufferedWriter bw=new BufferedWriter(fos);){
			char ch='y';
		
		do {
		System.out.println("Enter a name");
		String st=br.readLine();
		
		bw.write(st);
		bw.newLine();
		System.out.println("Do you want to add more:(Y/N)");
		ch=(char)br.readLine().charAt(0);
		

		}while(ch=='y');
		System.out.println(bw);
		bw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
