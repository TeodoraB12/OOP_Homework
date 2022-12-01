package zadaca_11;
import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> lista1 = new ArrayList<>();
		lista1.add("bela");
		lista1.add("crvena");
		lista1.add("plava");
		List<String> lista2 = new ArrayList<>();
		lista2.add("zolta");
		lista2.add("plava");
		lista2.add("zelena");
		lista1.retainAll(lista2);
		System.out.println(lista1);

	}

}
