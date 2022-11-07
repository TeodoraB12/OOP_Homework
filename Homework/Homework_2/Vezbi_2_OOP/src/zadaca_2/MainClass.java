package zadaca_2;

public class MainClass {

	public static void main(String[] args) {
		Vraboten vraboten1 = new Vraboten ();	//kreiranje na objekt vraboten1 so default konstruktor
		vraboten1.firstName = "Aleksandar";		//dodeluvanje na vrednosti za objekt vraboten1 (ime, prezime, plata)
		vraboten1.lastName = "Spirovski";
		vraboten1.plata = 15000;
		
		System.out.println("Imeto na vraboteniot e" + " " + vraboten1.firstName + ".");		//pecatenje na ime za vraboteniot
		System.out.println("Prezimeto na vraboteniot e" + " " + vraboten1.lastName + ".");	//pecatenje za prezime na vraboteniot
		System.out.println("Negovata plata e" + " " + vraboten1.plata + ".");			//pecatenje za negovata plata

	}

}
