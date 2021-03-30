package Latihan1;

class Pertama {
	private int a = 10;
	
	
	protected void terproteksi() {
		System.out.println("method untuk anaknya saja");
	}
	public void info() {
		System.out.println("a = "+a);
		System.out.println("dipanggil pada " + this.getClass().getName());
	}
}
