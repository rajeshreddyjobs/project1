package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue659 {

	public static void main(String[] args) {
		Queue<String> que=new PriorityQueue<String>();
		que.add("Sri");
		que.add("Rajesh");
		que.add("Kumar");
		que.add("Dande");
		que.add("Rajan");
		System.out.println(que);
		for(int i=0;i<que.size();i++) {
			System.out.println(que.poll());
		}
		
//		System.out.println(que);
//		System.out.println("Size :"+que.size());
//		System.out.println("Peek:"+que.peek());
//		System.out.println("Size :"+que.size());
//		System.out.println("Element :"+que.element());
//		System.out.println("Remove :"+que.remove());
//		System.out.println("Size :"+que.size());
//		System.out.println("Poll :"+que.poll());
//		System.out.println("Size :"+que.size());
//		System.out.println("Remove :"+que.remove());
//		System.out.println("Size :"+que.size());
		

	}

}
