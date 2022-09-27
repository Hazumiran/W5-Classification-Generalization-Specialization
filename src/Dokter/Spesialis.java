package Dokter;

public class Spesialis extends Dokter {

		private String Spesialis;

		public String getSpesialis() {
			return Spesialis;
		}

		public void setSpesialis(String spesialis) {
			Spesialis = spesialis;
		}
		
		@Override
		public void Show() {
			super.Show();
			System.out.println("Dokter Spesialis : " +this.Spesialis);
		}
	

}
