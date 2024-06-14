package day12_29_05_2024;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeDemo {

	public static void main(String[] args) {
	
		
		Deque<Integer> d=new ArrayDeque<Integer>();
		
		d.add(30);
		d.add(40);
		d.add(50);
		d.add(70);
		
		System.out.println(d);
         System.out.println(d.removeFirst());
         System.out.println(d);
         System.out.println(d.removeLast());
         System.out.println(d);
	}

}
