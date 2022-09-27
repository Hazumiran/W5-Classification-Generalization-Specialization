package Pasien;

public class Pasien {
	private String Nama_Pasien;
	private String Kategori_Penyakit;
	public String getNama_Pasien() {
		return Nama_Pasien;
	}
	public void setNama_Pasien(String nama_Pasien) {
		Nama_Pasien = nama_Pasien;
	}
	public String getKategori_Penyakit() {
		return Kategori_Penyakit;
	}
	public void setKategori_Penyakit(String kategori_Penyakit) {
		Kategori_Penyakit = kategori_Penyakit;
	}
	
	
	public void Show() {
		System.out.println("Nama Pasien : "+ this.Nama_Pasien);
		System.out.println("Kategori Penyakit : "+this.Kategori_Penyakit);
	}

}
