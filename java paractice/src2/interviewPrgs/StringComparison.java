package interviewPrgs;

public class StringComparison {
	
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "cba";
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		boolean s =compare(c1,c2);
		System.out.println(s);
		
	}
	
	static boolean compare(char[] s1, char[] s2) {
		
		boolean flag= true;
		int length = 0;
		if(s1.length!=s2.length) {
			return false;
		}
		else {
			for(int i=0;i<s1.length;i++) {
				length =0;
				for(int j=0;j<s2.length;j++) {
					if(s1[i]==s2[j]) {
						flag = true;
					}
					else {
						length++;
					}
				    
				}
				
				if(length == s1.length) {
					return false;
				}
			}
			return flag;
		}
		
    }

}
