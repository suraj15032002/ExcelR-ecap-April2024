package day10_27_05_2024;

public class exceptiomHandling2 {

	public static void main(String[] args) {
	System.out.println("before exception");
	
	try {
		String s  =  null;
		System.out.println(s.length());
		
	}catch(NullPointerException e ) {
		System.out.println(e);
	}
	System.out.println("Rest of the code");

	}

}
