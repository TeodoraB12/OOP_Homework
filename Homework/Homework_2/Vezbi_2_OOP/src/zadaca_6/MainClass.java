package zadaca_6;

public class MainClass {

	public static void main(String[] args) {
		Proizvod p = new Proizvod ();	//kreiranje na objekt p 
		p.ime = "Chokoladoto";		//dodeluvanje na vrednosti
		p.tezina = 100;
		p.cena = 55;
		
	System.out.println("Cenata na" + " " + p.ime + " " + "so" + " " + "tezhina" + " " + "od" + " "+ p.tezina + "g" + " " +"iznesuva" + " " + p.cena + " " + "denari" + ".");

	}

}
