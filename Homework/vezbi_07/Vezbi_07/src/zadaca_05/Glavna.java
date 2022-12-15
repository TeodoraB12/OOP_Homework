package zadaca_05;
import java.util.Set;
import java.util.TreeSet;

public class Glavna {

	public static void main(String[] args) {
		Set<String> mnozestvo1 = new TreeSet<String>();
		mnozestvo1.add("Kuce");
		mnozestvo1.add("Macka");
		mnozestvo1.add("Papagal");		
		Set<String> mnozestvo2 = new TreeSet<String>();
		mnozestvo2.add("Kuce");
		mnozestvo2.add("Riba");
		mnozestvo2.add("Macka");		
		System.out.println("Unija od dvete mnozestva: ");
		mnozestvo1.addAll(mnozestvo2);
		System.out.println(mnozestvo1);
	

	}


	}

