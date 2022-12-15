package zadaca_03;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		List<SportskiKlub> list = new ArrayList<SportskiKlub>();
		list.add(new SportskiKlub("Chelsea", "Football", 20));
		list.add(new SportskiKlub("Partizan", "Kosarka", 18));
		list.add(new SportskiKlub("Real Madrid", "Football", 17));
		Collections.sort(list);
		for(SportskiKlub a : list) {
			System.out.println(a.getIme());
			System.out.println(a.getSport());
			System.out.println(a.getBrojNaClenovi());
			System.out.println();
		}
	}
	}
