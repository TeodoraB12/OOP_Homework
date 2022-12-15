package zadaca_03;

public class SportskiKlub implements Comparable<SportskiKlub>{
		private String ime;
		private String sport;
		private int brojNaClenovi;	
		
		public String getIme() {
			return ime;
		}
		public void setIme(String ime) {
			this.ime = ime;
		}
		public String getSport() {
			return sport;
		}
		public void setSport(String sport) {
			this.sport = sport;
		}
		public int getBrojNaClenovi() {
			return brojNaClenovi;
		}
		public void setBrojNaClenovi(int brojNaClenovi) {
			this.brojNaClenovi = brojNaClenovi;
		}
		public SportskiKlub(String ime, String sport, int brojNaClenovi) {
			this.ime = ime;
			this.sport = sport;
			this.brojNaClenovi = brojNaClenovi;
		}
		public int compareTo(SportskiKlub obj) {
			SportskiKlub a = (SportskiKlub) obj;
			if(this.ime.equals(a.ime)) {
				return 0;
			}
			else
				return this.ime.compareTo(a.ime);
		}
	}

