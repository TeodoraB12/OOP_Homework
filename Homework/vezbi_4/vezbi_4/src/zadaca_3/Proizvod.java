package zadaca_3;

public class Proizvod {
		private String ime;
		private double cena;
		private String proizvoditel;
		private double tezina;
		
	public Proizvod(){
		this.ime = "Lenovo";
		this.cena = 28000;
		this.proizvoditel = "Lenovo";
		this.tezina = 2;
		
	}
	public String getIme() {
		return ime;
	}
	public double getCena() {
		return cena;
	}
	public String getProizvoditel() {
		return proizvoditel;
	}
	public double getTezina() {
		return tezina;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public void setProizvoditel(String proizvoditel) {
		this.proizvoditel = proizvoditel;
	}
	public void setTezina(double tezina) {
		this.tezina = tezina;
	}
}
