package zadaca_4;

public class MainClass {

	public static void main(String[] args) {
		Avtomobil car = new Avtomobil("Toyota", "Corolla", 1700, "bela");
		car.setMarka("Toyota");
		car.setModel("Corolla");
		car.setKilometri(1700);
		car.setBoja("bela");
		System.out.println("Markata na avtomobilot e: " + car.getMarka());
		System.out.println("Modelot na avtomobilot e: " + car.getModel());
		System.out.println("Kilometri pred mnozenje: " + car.getKilometri());
		System.out.println("Kilometri posle mnozenje: " + car.mnozenjeKm(2));
		System.out.println("Bojata na avtomobilot e: " + car.getBoja());

	}

}
