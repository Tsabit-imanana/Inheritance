package praktek;

public class InfoGuru extends keanggotaanSekolah {
	String Bidang;
	int ID;

	public InfoGuru(String nama, String Bidang, int ID, int umur, String absensi) {
		super(nama,"guru",umur);
		this.Bidang = Bidang;
		this.ID = ID;
		this.absensi = absensi;
		}
	public int getID() {
		return ID;
	}
	public String getabsensi() {
		return absensi;
	}
	public void cetak() {
		System.out.println("==========================");
		System.out.println("Nama = "+ nama);
		System.out.println("Bidang = " + Bidang);
		System.out.println("ID = " + ID);	
		System.out.println("Absensi = " + absensi);
		System.out.println("==========================");
		
		
	}
	
	
}
