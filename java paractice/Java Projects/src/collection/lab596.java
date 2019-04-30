package collection;
import java.util.*;

public class lab596 {

	public static void main(String[] args) {
		Hello h=new Hello();
		
		System.out.println(h.a);//System.out.println(Hello.a);
		
		
		/*Properties p=new Properties();
		p.put("JLC-99","Sri");
		p.put("JLC-88", "vas");
		p.put("JLC-99","Dande");
		p.put("JLC-88", "Rajesh");
		
		System.out.println(p);
		
		Enumeration en=p.propertyNames();
		while(en.hasMoreElements()) {
			String pnm= (String) en.nextElement();
			String val=p.getProperty(pnm);
			System.out.println(pnm+"\t"+val);
		}
*/
		
	}

}
class Hello{
	
	static {
		System.out.println("static block");
	}
	final static int a=20;
}