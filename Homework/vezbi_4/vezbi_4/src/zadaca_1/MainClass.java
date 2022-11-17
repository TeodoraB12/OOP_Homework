package zadaca_1;

public class MainClass {

	public static void main(String[] args) {
		Covek c1 = new Covek();
		c1.setIme("Teodora");
		c1.setPrezime("Bojadzieska");
		c1.setEmbg("123456789");
		System.out.println("Imeto na covekot e: " + c1.getIme());
		System.out.println("Prezimeto na covekot e: " + c1.getPrezime());
		System.out.println("Maticniot broj na covekot e: " + c1.getEmbg());

	}

}
