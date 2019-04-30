package collection;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;

public class set621A {

	public static void main(String[] args) {
		int arr[]= {2,3,8,10,21,30};
		Object arr2;
		System.out.println("Before sort :"+Arrays.toString(arr));
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
					System.out.println(t);
					}
				System.out.println(arr[j]+"====="+arr[i]);
			arr2=arr[j];
			}
		}
		
	}

}
