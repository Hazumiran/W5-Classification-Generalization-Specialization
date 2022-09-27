package RumahSakit;
import Dokter.*;
import Pasien.*;


public class RumahSakitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dokter RS1 = new Dokter();
//		RS1.setNo_ID_Dokter(1);
//		RS1.setNama_Dokter("Diaz");
//		RS1.Show();
		Spesialis RS2 = new Spesialis();
		RS2.setNo_ID_Dokter(1);
		RS2.setNama_Dokter("Dr.Diaz");
		RS2.setSpesialis("Umum");
		RS2.Show();
		
		Jadwal RS3 = new Jadwal();
		RS3.setJadwal_Dokter("Senin");
		RS3.Show();
		
		Pasien RS1 = new Pasien();
		RS1.setNama_Pasien("Adhari");
		RS1.setKategori_Penyakit("Diare");
		RS1.Show();
	}

}
