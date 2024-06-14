package day12_29_05_2024;

import java.util.Iterator;
import java.util.TreeSet;

public class treesetdemo {

	public static void main(String[] args) {
	
		TreeSet<Integer> ts  =  new TreeSet<Integer>();
		
		ts.add(30);
		ts.add(20);
		ts.add(40);
		
		System.out.println(ts);
		
		Iterator it = ts.descendingIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
