
public class wordcount {

	public static void main(String[] args) {
		String sentence="I Love YOU Rajesh Reddy . I miss You Raa.....";
System.out.println(sentence);
 static int countWordsUsingStringTokenizer( sentence) {
 if (sentence == null || sentence.isEmpty()) {
 return 0; 
}
 StringTokenizer tokens = new StringTokenizer(sentence);
 return tokens.countTokens();
 }

	}

}
