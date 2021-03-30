package Latihan3;

public class Gajah extends Hewan {
	
	public static void testClassMethod(){
		System.out.println("method class di hewan");
	}
	public void testInstanceMethode() {
		
		System.out.println("method instansi di gajah");
				
	}
	public static void main (String[]args) {
		Gajah gajahku = new Gajah();
		Hewan hewanku = gajahku;
		Hewan.testClassMethod();
		hewanku.testInstanceMerhode();
	

	}

}
