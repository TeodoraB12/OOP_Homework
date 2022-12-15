package Zadaca_02;
import java.util.Map;
import java.util.HashMap;

public class Glavna {

	public class Rechnik {
	            Map<String, String> rechnik = new HashMap<String, String>();
	            public void vnesiMapa() {
	            rechnik.put("Tea", "Caj");
	            rechnik.put("Daughter", "Kerka");
	            rechnik.put("House", "Kukja");
	            rechnik.put("Sister", "Sestra");
	            }
	            
	            public void translate (String s) {
	            if (rechnik.containsKey(s))
	            {
	           System.out.println(rechnik.get(s));
	           }
	          System.out.println("Ne postoi takov zbor vo rechnikot.");
	            }}}