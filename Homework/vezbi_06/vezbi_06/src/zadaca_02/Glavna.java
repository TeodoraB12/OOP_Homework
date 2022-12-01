package zadaca_02;
import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> drzavi = new ArrayList<>();
		drzavi.add("Grcija");
		drzavi.add("Srbija");
		drzavi.add("Albanija");
		System.out.println("Goleminata na listata e: " + drzavi.size());
		if(drzavi.size() == 3) {
			drzavi.add("Crna Gora");
			drzavi.add("Hrvatska");
			System.out.println("Elementite na listata se: " + drzavi);
		}
		else
			System.out.println("Elementite na listata se: " + drzavi);

	}

}
