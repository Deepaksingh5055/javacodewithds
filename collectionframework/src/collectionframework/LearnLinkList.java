package collectionframework;
import java.util.*;
//import java.util.LinkedList;
//import java.util.Queue;

public class LearnLinkList {

	public static void main(String[] args) {
		Queue<Integer> queue =new LinkedList<>();
		
		queue.offer(12); //offer is used add the values
		queue.offer(24);
		queue.offer(36);
		
		System.out.println(queue);
		
//		remove the elements poll
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
//		next line elements show peek
		System.out.println(queue.peek());
		

	}

}
