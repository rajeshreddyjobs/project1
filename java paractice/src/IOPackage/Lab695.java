package IOPackage;
import java.io.*;

public class Lab695 {

	public static void main(String[] args) {
File file=new File("D:\\Java practities");
File files[]=file.listFiles();
for(File f:files) {
	System.out.println(f+"---> is File : "+f.isFile()+" ,isDir :"+f.isDirectory());
}

	}

}
