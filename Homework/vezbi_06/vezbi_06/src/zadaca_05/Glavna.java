package zadaca_05;
import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<Integer> celibroevi = new ArrayList<>();
		celibroevi.add(5);
		celibroevi.add(7);
		celibroevi.add(8);
		celibroevi.add(10);
		celibroevi.add(2);
		System.out.println("Pecatenje na vtoriot element: " + celibroevi.get(1));

	}

}
