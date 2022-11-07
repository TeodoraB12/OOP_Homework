package zadaca_5;

public class MainClass {

	public static void main(String[] args) {
		Predmet p1 = new Predmet ();	//kreiranje na objekt so default konstruktor
		p1.ime = "Napredno Programiranje";	//dodeluvanje na vrednosti
		p1.profesor = "Ramona Markoska";
		p1.krediti = 6;
		
		System.out.println("Predmet:" + " " + p1.ime + ".");	//se pecati imeto na predmetot1(p1.ime)
		System.out.println("Profesor:" + " " + p1.profesor + ".");		//se pecati profesorot na predmetot(p1.profesor)
		System.out.println("Krediti:" + " " + p1.krediti + ".");		//se pecati brojot na krediti(p1.krediti)
		System.out.println();			//prazen red
		
		Predmet p2 = new Predmet ("Veb tehnologii", "Zoran Kotevski", 6);	//kreiranje na objekt so dinamicen konstruktor
		p2.ime = "Veb tehnologii";		//dodeluvanje na vrednosti
		p2.profesor = "Zoran Kotevski";
		p2.krediti = 6;
		
		System.out.println("Predmet:" + " " + p2.ime + ".");	//se pecati imeto na predmetot1(p2.ime)
		System.out.println("Profesor:" + " " + p2.profesor + ".");	//se pecati profesorot na predmetot(p2.profesor)
		System.out.println("Krediti:" + " " + p2.krediti + ".");	//se pecati brojot na krediti(p2.krediti)
		System.out.println();	//prazen red
		
		Predmet p3 = new Predmet("Objektno Orientirano Programiranje", "Ilija Jolevski", 6);	//kreiranje na objekt so dinamicen konstruktor
		p3.ime = "Objektno Orientirano Programiranje";		//dodeluvanje na vrednosti
		p3.profesor = "Ilija Jolevski";
		p3.krediti = 6;
		
		System.out.println("Predmet:" + " " + p3.ime + ".");	//se pecati imeto na predmetot1(p3.ime)
		System.out.println("Profesor:" + " " + p3.profesor + ".");	//se pecati profesorot na predmetot(p3.profesor)
		System.out.println("Krediti:" + " " + p3.krediti + ".");		//se pecati brojot na krediti(p3.krediti)

	}

}
