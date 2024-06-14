package day10_27_05_2024;

public class testThrow {
	
	public static void validateAge(int age) {
		if(age>18) {
			System.out.println("eligible for vote");
		}
		else {
		throw new ArithmeticException("not eligible for vote");
		}
	}

	public static void main(String[] args) {
		try{
			validateAge(17);
			System.out.println("age is validate");
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	

	}

}
