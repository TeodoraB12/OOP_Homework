package zadaca_4;

public class Avtomobil {
		public String marka;	//deklaracija na atributi za klasata Avtomobil
		public String model;
		public int kilometri;
		
	public Avtomobil() {	//default konstruktor
		
	}

	public Avtomobil(String marka, String model, int kilometri) {	//dinamicen konstruktor koj prima tri vrednosti (marka, model, kilometri)
		this.marka = marka;
		this.model = model;
		this.kilometri = kilometri;
	}
}