package StringBuilder;

public class Lab504 {

	public static void main(String[] args) {
StringBuilder sb=new StringBuilder("jlc");
System.out.println("c:"+sb.capacity());
System.out.println("L :"+sb.length());
sb.trimToSize();
System.out.println("C :" +sb.capacity());
System.out.println("L :" +sb.length());

sb.append("rajesh");
System.out.println("C :" +sb.capacity());
System.out.println("L :" +sb.length());

System.out.println();
System.out.println(sb);

String str="jlc";
StringBuilder sb1=new StringBuilder("jlc");
//System.out.println(sb1.contentEquals(str));
System.out.println(str.contentEquals(sb1));


	


	}

}
