package collection;

import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class set622 {

	public static void main(String[] args) {
LinkedHashSet set=new LinkedHashSet();
//TreeSet ts=new TreeSet(set);
set.add("rajesh");
set.add(10);
set.add(20.90);
set.add(010);
System.out.println(set);
//System.out.println(set.size());
Iterator it=set.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
	/*ts.add(it.next());
	System.out.println(ts);*/
}

//System.out.println(ts);


	}

}
