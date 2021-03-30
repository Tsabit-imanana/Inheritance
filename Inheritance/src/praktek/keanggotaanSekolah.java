package praktek;

public class keanggotaanSekolah {
	
		String nama, absensi;
		int umur;
		
		public keanggotaanSekolah(String nama, String absensi, int umur) {
			this.nama = nama;
			this.absensi = absensi;
			this.umur = umur;
			
		}
		public void cetak() {
			System.out.println("Nama : " + nama);
			System.out.println("Umur : "+ umur);
			System.out.println("Absensi : " + absensi);
			System.out.println("==========================");
		}
}
