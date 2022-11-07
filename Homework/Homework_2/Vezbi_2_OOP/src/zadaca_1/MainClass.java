package zadaca_1;

public class MainClass {

	public static void main(String[] args) {
		Student object1 = new Student ();		//kreiranje na objekt object1 so default konstruktor
		object1.firstName =  "Teodora";		//dodeluvanje na vrednosti na object1
		object1.lastName = "Bojadzieska";
		object1.index = 838;
		
		System.out.println(object1.firstName + " " + object1.lastName + " "  +  object1.index);	//pecatenje na ime prezime i indeks na studentot

	}

}
