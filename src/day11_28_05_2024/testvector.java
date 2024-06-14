package day11_28_05_2024;

import java.util.Iterator;
import java.util.Vector;

public class testvector {

	public static void main(String[] args) {
	
		
		Vector<Integer>  v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v);
		
		System.out.println("traversing vector by for loop");
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("traversing vector by iterator ");
		Iterator it  =  v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
