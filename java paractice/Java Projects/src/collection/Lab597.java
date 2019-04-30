package collection;
import java.util.*;

public class Lab597 {

public static void main(String[] args) {
Collection col=new ArrayList();

System.out.println(col);
System.out.println("size : "+col.size());
System.out.println("Empty  : "+col.isEmpty());


col.add("Sri");
col.add("Nivas");
col.add("Srini");
col.add("sd");
col.add("Dande");
col.add("Nivas");


System.out.println(col);
System.out.println("size : "+col.size());
System.out.println("Empty : "+col.isEmpty());


//Lab598
System.out.println();

System.out.println(col.contains("sri"));
System.out.println(col.contains("Sri"));
System.out.println(col.contains("Nivas"));

System.out.println(col);

System.out.println(col.remove("Nivas"));
System.out.println(col.remove("srini"));

System.out.println();

//Lab603

Collection col2=new ArrayList();
col2.add("rajesh");
col2.add("Sri");
col2.add("Nivas");
col2.add("Srini");
col2.add("sd");
col2.add("Dande");
col2.add("Nivas");

System.out.println(col2);
System.out.print(col.containsAll(col2));
System.out.println(col2.containsAll(col2));

	}

}
