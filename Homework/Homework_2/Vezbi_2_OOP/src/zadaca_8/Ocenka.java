package zadaca_8;

public class Ocenka {
	public String predmet;
	public String datum;
	public int ocenka;
	
	public Ocenka() {
		
	}

	public Ocenka(String predmet, String datum, int ocenka) {
		this.predmet = predmet;
		this.datum = datum;
		this.ocenka = ocenka;
	}
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public void setOcenka(int ocenka) {
		this.ocenka = ocenka;
	}
	public String getPredmet() {
		return predmet;
	}
	public String getDatum() {
		return datum;
	}
	public int getOcenka() {
		return ocenka;
	}
	public String toString() {
		return "Ocenka { " + "predmet = " + predmet + ", datum = " + datum + "ocenka = " + ocenka + '}';
	}
}
