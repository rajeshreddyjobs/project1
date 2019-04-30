package interviewPrgs;

import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;



public class supai {

	public static void main(String[] args) {
		String a="This is a paragraph . It contains words , and sentences , and separators . This paragraph has words and it contains three sentences .";
		String [] b=a.split(" ");
		
		System.out.println("enter the value: ");
		Scanner sc=new Scanner (System.in);
		int s1=sc.nextInt();
		switch (s1) {
		case 0:
			TreeSet ts=new TreeSet(new Mycomparator());
			for(int i=0;i<=b.length-1;i++) {
				
				ts.add(new raj (b[i]));
				}
			//System.out.println(ts);
			Iterator it=ts.iterator();
			while(it.hasNext()) {
				Object obj=it.next();
				System.out.println(obj);
			}break;
		/*case 1:
			Map<String , Integer> m=new TreeMap<String,Integer>();
			for(int i=0;i<b.length;i++) {
				String s="";
				
				while(i<b.length && b[i]!=' ') {
				s=s+b[i];
				//System.out.println("char "+i+" " +s);
				i++;
				
				}
				//System.out.println("char "+i+" " +s);
				for(int j=0;i<b.length ; j++) {
					m.put(s, s.length());
				}
				
				if(s.length()>0)
					System.out.println(s+"\t"+s.length());
			}
			for(int j=0;j<b.length ; j++) {
				m.put(b[j], b[j].length());
			}
			System.out.println(m);
			
			for (Entry<String, Integer> entry : entrySet) 
	        {
	            System.out.println(entry.getKey()+" : "+entry.getValue());
	        }
			
			break;
*/
		default:
			System.out.println("Invalid O/P ------------");
			break;
		}
			
		
	}

}
class raj{
	
	String sname;
	raj(String sname){
		
		this.sname=sname;
	}
	public String toString(){
		return sname+"  			 "+sname.length();
	}

}

class Mycomparator implements Comparator{
	/*public int compare(Object obj1,Object obj2) {
		Student22 st1=(Student22)obj1;
		Student22 st2=(Student22) obj2;
		return st1.sid-st2.sid;		Student22 st1=(Student22)obj1;

	}
	*/
	public int compare(Object obj1,Object obj2) {
		raj st1=(raj)obj1;
		raj st2=(raj) obj2;
		//return st1.sname.compareTo(st2.sname);
		String str1=st1.sname.toUpperCase();
		String str2=st2.sname.toUpperCase();
		
		return str1.compareTo(str2);
	}
	
	
}