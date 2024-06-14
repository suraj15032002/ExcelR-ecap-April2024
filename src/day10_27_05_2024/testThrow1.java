package day10_27_05_2024;

public class testThrow1 {
	public void p() throws Exception{
		int i = 20/0;
		System.out.println(i);
	}
	public void q() throws Exception {
		p();
		
	}
	public void r() {
		try {
			p();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		testThrow1 t  =  new testThrow1();
		t.r();
		System.out.println("rest of the code");

	}

}
