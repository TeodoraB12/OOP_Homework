package zadaca_3;

public class MainClass {

	public static void main(String[] args) {
		Covek covek1 = new Covek ();	//kreiranje na objekt covek1 so default konstruktorot
		covek1.ime = "Aleksandra";		//dodeluvanje na vrednosti na objektot covek1
		covek1.prezime = "Ognenoska";
		covek1.embg = "123456789987";
		
		System.out.println("Imeto na covekot e:" + " " + covek1.ime + ".");		//pecatenje na imeto na covekot
		System.out.println("Prezimeto na covekot e:" + " " + covek1.prezime + ".");		//pecatenje na prezimeto na covekot
		System.out.println("Covekot ima maticen broj:" + " " + covek1.embg + ".");		//pecatenje na maticniot broj na covekot

	}

}
