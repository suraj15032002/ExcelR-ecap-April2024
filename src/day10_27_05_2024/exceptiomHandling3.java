package day10_27_05_2024;

public class exceptiomHandling3 {

	public static void main(String[] args) {
		System.out.println("program starts");
		
		int[] age  =  new int[4];
		
		try {
			System.out.println(age[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println();
			e.printStackTrace();
		}
		System.out.println("rest of the code");

	}

}
