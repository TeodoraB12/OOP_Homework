package zadaca_01;

import java.util.List;
import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		List<String> lekovi = new ArrayList<>();
		lekovi.add("Ibruprofen");
		lekovi.add("Analgin");
		lekovi.add("Paracetamol");
		if(lekovi.get(lekovi.size() - 1).equals("Paracetamol")) {
			System.out.println("Lekot pomaga za namaluvanje na telesna temperatura");
		}
		else {
			System.out.println("Namenata na lekot e nepoznata!");
		}
	}

}
