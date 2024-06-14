package day10_27_05_2024;

public class exceptiomHandling4 {

	public static void main(String[] args) {
		System.out.println("program start");
		String s  =  "suraj";
		
		try {
			int i =  Integer.parseInt(s);
			System.out.println(i);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
         System.out.println("rest of the code");
	}

}
