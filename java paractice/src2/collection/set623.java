package collection;

import java.util.*;

public class set623 {

	public static void main(String[] args) {
TreeSet ts=new TreeSet();
/*ts.add(new Integer(10));
ts.add(new Byte((byte)10));
//ts.add(new Short((short)10));
ts.add(new Long(10));
//ts.add(new Integer(10));
*/
ts.add(new String("Rajesh"));
ts.add(new String("raj"));
ts.add(new String("Rajesh"));
ts.add(new String("Yuva Sekhar"));
ts.add(new String("raj"));
//ts.add(new Integer(80));

System.out.println(ts);
for(Object r:ts) {
	System.out.println(r.hashCode());

}

	}

}
