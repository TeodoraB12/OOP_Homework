package zadaca_09;

public class Fakultet {
	private String ime;
	private int brojsmerovi;
	private int studenti;
	
	public Fakultet(String ime, int brojsmerovi, int studenti) {
		this.ime = ime;
		this.brojsmerovi = brojsmerovi;
		this.studenti = studenti;
	}
	public String getIme() {
		return ime;
	}
	public int getBrojsmerovi() {
		return brojsmerovi;
	}
	public int getStudenti() {
		return studenti;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public void setBrojSmerovi(int brojsmerovi) {
		this.brojsmerovi = brojsmerovi;
	}
	public void setStudenti(int studenti) {
		this.studenti = studenti;
	}
}
