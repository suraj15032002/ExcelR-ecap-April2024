package day11_28_05_2024;

import java.util.Stack;

public class testStack {

	public static void main(String[] args) {

		
		Stack<Integer> st  =  new Stack<Integer>();
	st.push(10);
	st.push(20);
	st.push(30);
	st.push(40);
	st.push(60);
	System.out.println(st);
	
	System.out.println(st.peek());
	st.pop();
	System.out.println(st);

	}

}
