package Week4;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {

	public static void main(String[] args) {
		Queue<Integer>numPQ=new PriorityQueue<>();
		numPQ.add(25);
		numPQ.add(12);
		numPQ.add(18);
		numPQ.add(45);
		numPQ.add(72);
		numPQ.add(12);
		numPQ.add(43);
		numPQ.add(32);
		numPQ.add(89);
		numPQ.add(23);
		while(!numPQ.isEmpty()) {
			System.out.println(numPQ.poll());

	}

}}
