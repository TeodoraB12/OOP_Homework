package zadaca_09;
import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<Fakultet> fax = new ArrayList<Fakultet>();
		fax.add(new Fakultet("FIKT", 4, 300));
		fax.add(new Fakultet("Pedagoski", 3, 550));
		fax.add(new Fakultet("Praven", 2, 150));
		fax.add(new Fakultet("Biotehnicki", 4, 225));
		fax.add(new Fakultet("Bezbednost", 3, 554));
		for(int i = 0; i < fax.size(); i++) {
			System.out.println("Ime na fakultetot: " + fax.get(i).getIme());
			System.out.println("Broj na smerovi na fakultetot: " + fax.get(i).getBrojsmerovi());
			System.out.println("Broj na studenti na fakultetot: " + fax.get(i).getStudenti());
		}

	}

}
