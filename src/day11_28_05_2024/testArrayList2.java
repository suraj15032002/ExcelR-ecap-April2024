package day11_28_05_2024;

import java.util.ArrayList;
import java.util.Iterator;

public class testArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("mango");
		al.add("watermelon");
		al.add("banana");
		al.add("apple");
		al.add("orange");
		
		System.out.println(al.size());
		System.out.println("printing a list by for each loop");
        for(String a: al) {
        	System.out.println(a);
        	
        }
        System.out.println("printing a list by for loop");
        for(int i=0; i<al.size(); i++) {
        	System.out.println(al.get(i));
        }
        
        System.out.println("printing a list by iterator");
        Iterator itr =  al.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
        ArrayList<String> al1 =  new ArrayList<String>();
        al1.add("papaya");
        al1.add("chiku");
        al.addAll(al1);
        System.out.println(al);
	}

}
