package day12_29_05_2024;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
	
		PriorityQueue<Integer> pq  =  new PriorityQueue<Integer>();
		
		pq.add(30);
		pq.add(40);
		pq.add(20);
		pq.add(60);
		pq.add(70);
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());

	}

}
