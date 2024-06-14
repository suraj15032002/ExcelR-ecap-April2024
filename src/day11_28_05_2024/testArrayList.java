package day11_28_05_2024;

import java.util.ArrayList;

public class testArrayList {

	public static void main(String[] args) {
	
		
		//non_generic 
		ArrayList  all  =  new ArrayList();
		all.add("suraj");
		all.add('s');
		all.add(10);
		all.add(15.6);
		System.out.println(all);
		
		
		//generic arraylist
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("mango");
		al.add("watermelon");
		al.add("banana");
		al.add("apple");
		al.add("orange");
		
		int totalNoOfElement =  al.size();
		System.out.println(totalNoOfElement);
		System.out.println(al);

	}

}
