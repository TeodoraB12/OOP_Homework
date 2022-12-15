package zadaca_02;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MetodiZaListaNiza {

	public MetodiZaListaNiza() {
		// TODO Auto-generated constructor stub
	}
	public void listaVoNiza(List<String>lista) {
		String[] niza = new String[lista.size()];
		lista.toArray(niza);
		System.out.println("Lista pretvorena vo niza: ");
		for(String s: niza) {
			System.out.println(s);
		}
	}
	public void nizaVoLista(String[] niza) {
		List<String> lista = new ArrayList<>();
		lista = Arrays.asList(niza);
		System.out.println("Niza pretvorena vo lista: ");
		for(String s: lista) {
			System.out.println(s);
		}
	}

}
