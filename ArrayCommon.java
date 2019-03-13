public class ArrayCommon {
	public static void main(String[] args) {
		int[] a = { 2,5,8,7};
		int[] b = { 5,8,7,13,15,18};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				if (a[i] == a[j]) {
					System.out.println("This Element is common :" + a[j]);
				} else {
					System.out.println("This is not common elt :" + a[j]);
				}
			}
		}
	}

}