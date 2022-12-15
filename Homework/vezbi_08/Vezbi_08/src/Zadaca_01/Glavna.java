package Zadaca_01;
import java.util.HashMap;
import java.util.Map;

public class Glavna {

	public static void main(String[] args) {
		Map<String, String> recnik = new HashMap<>();
		recnik.put("computer", "kompjuter");
		recnik.put("horse", "konj");
		recnik.put("name", "ime");
		recnik.put("color", "boja");
		recnik.put("hi", "zdravo");
		System.out.println("Klucevi: " + recnik.keySet());
		System.out.println("Vrednosti: " + recnik.values());
		System.out.println();		
		for(Map.Entry<String, String> entry : recnik.entrySet()) {
			System.out.println(entry.getKey() + "|" + entry.getValue());
		}
		System.out.println();		
		if(recnik.containsKey("hi"))
			System.out.println("Vrednosta za 'hi' e:  " + recnik.get("hi"));
		else
			System.out.println("Takov zbor ne postoi vo recnikot.");
	}



	}

