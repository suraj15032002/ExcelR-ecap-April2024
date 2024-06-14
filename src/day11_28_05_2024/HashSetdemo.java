package day11_28_05_2024;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetdemo {

	public static void main(String[] args) {
		
		HashSet<String>  hs =  new HashSet<String>();
		
		hs.add("white");
		hs.add("black");
		hs.add("blue");
		hs.add("black");
		hs.add("pink");
		hs.add(null);
		
		System.out.println(hs);
		
		Iterator it  =  hs.iterator();
				
				while(it.hasNext()) {
					System.out.println(it.next());
				}
		

	}

}
