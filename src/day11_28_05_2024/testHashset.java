package day11_28_05_2024;

import java.util.ArrayList;
import java.util.HashSet;

public class testHashset {

	public static void main(String[] args) {
	
		HashSet<ArrayList> hs =  new HashSet<ArrayList>();
		
		ArrayList al  = new ArrayList();
		ArrayList al1  =  new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(40);
		
		al1.add("suraj");
		al1.add("walunj");
		
		hs.add(al);
		hs.add(al1);
		System.out.println(hs.size());
		System.out.println(hs);

	}

}
