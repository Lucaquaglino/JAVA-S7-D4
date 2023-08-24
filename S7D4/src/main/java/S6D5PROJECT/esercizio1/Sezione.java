package S6D5PROJECT.esercizio1;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements Elemento {
	private List<Elemento> elementi = new ArrayList<>();

	public void aggiungiElemento(Elemento elemento) {
		elementi.add(elemento);
	}

	@Override
	public int getNumeroPagine() {

		int totale = 0;
		for (Elemento elemento : elementi) {
			totale += elemento.getNumeroPagine();
		}
		return totale;
	}

	@Override
	public void print() {
		System.out.println("Stampo la sezione:");
		for (Elemento elemento : elementi) {
			elemento.print();
		}

	}

}
