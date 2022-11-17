package zadaca_2;

public class MainClass {

	public static void main(String[] args) {
		Restoran r1 = new Restoran();
		r1.setIme("Aurum");
		r1.setLokacija("Partizanska");
		r1.setTelefon("077543789");
		r1.setBroj(4);
		System.out.println("Imeto na restoranot e: " + r1.getIme());
		System.out.println("Lokacijata na restoranot e: " + r1.getLokacija());
		System.out.println("Telefonot na restoranot e: " + r1.getTelefon());
		System.out.println("Brojot na sediste na restoranot: " + r1.getBroj());
	}

}
