package day10_27_05_2024;

public class exceptiomHandling5 {

	public static void main(String[] args) {
	try {
		int a  =100/0;	
	}catch(ArrayIndexOutOfBoundsException e ) {
		System.out.println("ArrayIndexOutOfBoundsException");
	}
	catch(NullPointerException e) {
		System.out.println("NullPointerException");
	}
	catch(ArithmeticException e) {
		System.out.println(" ArithmeticException");
	}catch(Exception e) {
		System.out.println("exception handling");
	}
	System.out.println("rest of the code");

	}

}
