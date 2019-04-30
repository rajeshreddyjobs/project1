package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue657 {

	public static void main(String[] args) {
/*int[] values= {1,2,3,4,5};
int len=values.length;*/
PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
pq1.offer(200);
pq1.offer(300);
pq1.offer(400);
pq1.offer(500);
pq1.peek();
pq1.poll();
pq1.remove();

/*for(int x:values) {
	pq1.offer(x);
}*/
System.out.println(pq1);
	}

}
