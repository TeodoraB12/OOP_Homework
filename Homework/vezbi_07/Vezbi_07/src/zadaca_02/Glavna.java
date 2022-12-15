package zadaca_02;
import java.util.List;
import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		MetodiZaListaNiza m = new MetodiZaListaNiza();
		List<String> lista = new ArrayList<>();
		lista.add("Zolta");
		lista.add("Bela");
		lista.add("Plava");
		m.listaVoNiza(lista);
		String[] niza = {"Portokalova", "Crvena", "Maslinesta"};
		m.nizaVoLista(niza);
		
		

	}

}
