package day10_27_05_2024;

public class finallyBlock {

	public static void main(String[] args) {
		System.out.println("before exception");
	try {
		int data  =  25/0;
		System.out.println(data);
		
	}catch(NullPointerException e ) {
		System.out.println("null pointer exception");
	}
	catch(Exception e) {
		System.out.println("exception handled");
	}
	finally {
		System.out.println("i am in finally block");
	}


	}

}
