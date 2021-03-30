package Latihan4;

class B extends A{
	private int b;
	public void setB(int nilai) {
		b=nilai;		
	} 
	
	public int getB() {
		return b;
	}
	
	
	
	public void tampilNilai() {
		
		super.tampilkanNilai();
		System.out.println("Nilai B = " +getB());
	
		
	}

}
