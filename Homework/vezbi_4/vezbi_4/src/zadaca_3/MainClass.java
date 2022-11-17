package zadaca_3;

public class MainClass {

	public static void main(String[] args) {
		Proizvod p1 = new Proizvod();
		p1.setIme("Lenovo ideapad3");
		p1.setCena(28000);
		p1.setProizvoditel("Lenovo");
		p1.setTezina(2);
		System.out.println("Imeto na proizvodot e: " + p1.getIme());
		System.out.println("Cenata na proizvodot e: " +  p1.getCena() + " " + "denari");
		System.out.println("Proizvoditel na proizvodot e: " + p1.getProizvoditel());
		System.out.println("Tezina na proizvodot e: " + p1.getTezina() + "kg");
	}

}
