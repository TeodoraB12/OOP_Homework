package zadaca_10;
import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("Ilina");
		l1.add("Martin");
		l1.add("Teodora");
		List<String> l2 = new ArrayList<>();
		l2.add("Hristijan");
		l2.add("Bisera");
		l2.add("Marija");
		l1.addAll(l2);
		System.out.println(l1);

	}

}
