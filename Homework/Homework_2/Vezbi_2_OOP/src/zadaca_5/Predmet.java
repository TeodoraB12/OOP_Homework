package zadaca_5;

public class Predmet {
		public String ime;	//deklaracija na atributi
		public String profesor;
		public int krediti;
		public String semestar;

	public Predmet() {		//default konstruktor
		
	}
	
	public Predmet (String ime) {		//dinamicen konstruktor prima vrednost za ime na predmetot 
		this.ime = ime;
	}
	
	public Predmet (String ime, String profesor, int krediti) {	//dinamicen konstruktor koj na vlez prima tri vrednosti ime, profesor, krediti)
		this.ime = ime;
		this.profesor = profesor;
		this.krediti = krediti;
	}

}
