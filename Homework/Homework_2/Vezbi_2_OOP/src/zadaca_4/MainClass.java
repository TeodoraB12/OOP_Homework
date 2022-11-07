package zadaca_4;

public class MainClass {

	public static void main(String[] args) {
		Avtomobil object1 = new Avtomobil ("Audi", "A4", 70000); //kreiranje na objekt so dinamicen konstruktor
		object1.marka = "Audi";		//dodeluvanje na vrednosti za kreiraniot objekt (object1)
		object1.model = "A4";
		object1.kilometri = 70000;
		
		System.out.println("Marka:" + " " + object1.marka + ".");	//pecatenje na marka za object1
		System.out.println("Model:" + " " + object1.model + ".");	//pecatenje na model za object1
		System.out.println("Kilometri:" + " " + object1.kilometri + ".");	//pecatenje na kilometri za object1
		System.out.println();	//nov red
		
		Avtomobil object2 = new Avtomobil ();	//kreiranje na objekt so default konstruktorot
		object2.marka = "Seat";		//dodeluvanje na vrednosti za kreiraniot objekt (object2)
		object2.model = "Ibiza";
		object2.kilometri = 15000;
		
		System.out.println("Marka:" + " " + object2.marka + ".");		//pecatenje na marka za object2
		System.out.println("Model:" + " " + object2.model + ".");		//pecatenje na model za object2
		System.out.println("Kilometri:" + " " + object2.kilometri + ".");	//pecatenje na kilometri za object2
		

	}

}
