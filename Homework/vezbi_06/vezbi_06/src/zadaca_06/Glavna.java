package zadaca_06;
import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		for(int i=0; i<20; i++) {
			lista.add("mail" + (i+1) + "@yahoo.com");
		}
		for(int i=0; i<20; i++) {
			System.out.println(lista.get(i));
		}

	}

}
