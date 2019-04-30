package WookBook.practiceTest5;

import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {
int []a= {1,7,8,9,7,0,3,5};
Arrays.sort(a);
for (int i = 0; i < a.length; i++) {
	if(a[i]%2==0) {
	System.out.println("even : "+a[i]);
} else if(a[i]%2!=0){
	System.out.println("odd : "+a[i]);
}
	}

	}

}
