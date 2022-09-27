package Dokter;

public abstract class Dokter {
		private int No_ID_Dokter;
		private String Nama_Dokter; 
		
		public int getNo_ID_Dokter() {
			return No_ID_Dokter;
		}
		public void setNo_ID_Dokter(int no_ID_Dokter) {
			No_ID_Dokter = no_ID_Dokter;
		}
		public String getNama_Dokter() {
			return Nama_Dokter;
		}
		public void setNama_Dokter(String nama_Dokter) {
			Nama_Dokter = nama_Dokter;
		}
		
	
		public void Show() {
			System.out.println("ID :" + this.No_ID_Dokter);
			System.out.println("Nama Dokter :" + this.Nama_Dokter);
			
		}

}
