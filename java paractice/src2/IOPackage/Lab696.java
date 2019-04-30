package IOPackage;
import java.io.File;
import java.io.FileFilter;

public class Lab696 {

	public static void main(String[] args) throws Exception{
File file=new File("D:\\Java practities");
ExtFilter ef=new ExtFilter(".txt");
File javaFiles[]=file.listFiles(new ExtFilter(".txt"));
System.out.println("*** JAVA FILES ***");
if(javaFiles !=null) {
	for(File f: javaFiles) { 
		System.out.println(f);
	}}else { 
		System.out.println("no java File found ");
	}

	}
class ExtFilter implements FileFilter{
	String ext;
	public ExtFilter(String ext) {
		this.ext=ext;
	} 
	public boolean accept(File f) {
		return f.getName().endsWith(ext);
	}
}
	}


