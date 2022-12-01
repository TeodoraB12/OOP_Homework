package zadaca_04;
import java.util.ArrayList;
import java.util.List;


public class Glavna {

	public static void main(String[] args) {
		List<Integer> celibroevi = new ArrayList<>();
		celibroevi.add(3);
		celibroevi.add(5);
		celibroevi.add(7);
		celibroevi.add(1);
		celibroevi.add(9);
		celibroevi.sort(null);
		System.out.println("Sortiranata lista e: " + celibroevi);

	}

}
