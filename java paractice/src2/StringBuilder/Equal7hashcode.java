package StringBuilder;

public class Equal7hashcode {
public static void main(String[] args) {
	String s1=new String("rajesh");
	String s2="rajesh";
	StringBuilder s3=new StringBuilder("rajesh");
	StringBuilder s4=new StringBuilder("rajesh");
	
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	System.out.println(s1.hashCode()+" ==== "+s2.hashCode()+" ==== "+s3.hashCode()+" ==== "+s4.hashCode());
	System.out.println(s1.hashCode()==s2.hashCode());
	System.out.println(s2.hashCode()==s3.hashCode());
	System.out.println(s1.hashCode()==s3.hashCode());
	System.out.println(s3.hashCode()==s4.hashCode());

	System.out.println();
	
	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s3));
	System.out.println(s1.equals(s3));
	System.out.println(s3.equals(s4));



}
}
