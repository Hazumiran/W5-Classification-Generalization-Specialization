package Dokter;

public class Jadwal extends Dokter{

	private String Jadwal_Dokter;

	public String getJadwal_Dokter() {
		return Jadwal_Dokter;
	}

	public void setJadwal_Dokter(String jadwal_Dokter) {
		Jadwal_Dokter = jadwal_Dokter;
	}

	@Override
	public void Show() {
//		super.Show();
		System.out.println("Jadwal : "+this.Jadwal_Dokter);
	}
}
