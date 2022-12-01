package zadaca_03;
import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> smerovi = new ArrayList<>();
		smerovi.add("IKT");
		smerovi.add("INKI");
		smerovi.add(2, "Kompjuterska tehnika");
		System.out.println("Elementite na listata se: " + smerovi);

	}

}
