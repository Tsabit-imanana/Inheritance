package praktek;

public class InfoSiswa extends keanggotaanSekolah{
	
		

	
	public InfoSiswa (String nama,String absensi, int umur) {
		
	super(nama,absensi,umur);
	this.nama = nama;
	this.absensi = absensi;
	this.umur = umur;
	
	}
	public void cetak() {
		System.out.println("Nama = " + nama);
		System.out.println("Nama = " + umur);
		System.out.println("Absensi = " + absensi);
		
	}

}
